package top.aei.code.service.impl;

import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;
import top.aei.code.entity.ContestEntity;
import top.aei.code.mapper.ContestMapper;
import top.aei.code.service.ContestService;
import top.aei.code.utils.PageUtils;
import top.aei.code.utils.Query;

import java.util.Map;


@Service("contestService")
public class ContestServiceImpl extends ServiceImpl<ContestMapper, ContestEntity> implements ContestService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<ContestEntity> page = this.selectPage(
                new Query<ContestEntity>(params).getPage(),
                new EntityWrapper<ContestEntity>()
        );

        return new PageUtils(page);
    }

}
