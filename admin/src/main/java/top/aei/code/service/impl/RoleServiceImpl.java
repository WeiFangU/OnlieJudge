package top.aei.code.service.impl;

import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;
import top.aei.code.entity.RoleEntity;
import top.aei.code.mapper.RoleMapper;
import top.aei.code.service.RoleService;
import top.aei.code.utils.PageUtils;
import top.aei.code.utils.Query;

import java.util.Map;


@Service("roleService")
public class RoleServiceImpl extends ServiceImpl<RoleMapper, RoleEntity> implements RoleService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<RoleEntity> page = this.selectPage(
                new Query<RoleEntity>(params).getPage(),
                new EntityWrapper<RoleEntity>()
        );

        return new PageUtils(page);
    }

}
