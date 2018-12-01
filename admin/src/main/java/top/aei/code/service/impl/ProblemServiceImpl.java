package top.aei.code.service.impl;

import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;
import top.aei.code.entity.ProblemEntity;
import top.aei.code.mapper.ProblemMapper;
import top.aei.code.service.ProblemService;
import top.aei.code.utils.PageUtils;
import top.aei.code.utils.Query;

import java.util.Map;


@Service("problemService")
public class ProblemServiceImpl extends ServiceImpl<ProblemMapper, ProblemEntity> implements ProblemService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<ProblemEntity> page = this.selectPage(
                new Query<ProblemEntity>(params).getPage(),
                new EntityWrapper<ProblemEntity>()
        );

        return new PageUtils(page);
    }

}
