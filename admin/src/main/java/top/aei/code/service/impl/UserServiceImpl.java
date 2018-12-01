package top.aei.code.service.impl;

import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;
import top.aei.code.entity.UserEntity;
import top.aei.code.mapper.UserMapper;
import top.aei.code.service.IUserService;
import top.aei.code.utils.PageUtils;
import top.aei.code.utils.Query;
import top.aei.code.utils.StringUtils;

import java.util.Map;

@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, UserEntity> implements IUserService {
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        String username = (String) params.get("username");

        Page<UserEntity> page = this.selectPage(
                new Query<UserEntity>(params).getPage(),
                new EntityWrapper<UserEntity>()
                        .like(StringUtils.isNotBlank(username), "username", username)
        );

        return new PageUtils(page);
    }
}
