package top.aei.code.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import top.aei.code.common.Res;
import top.aei.code.common.Result;
import top.aei.code.entity.ProblemEntity;
import top.aei.code.service.ProblemService;
import top.aei.code.utils.PageUtils;

import java.util.Arrays;
import java.util.Map;


/**
 * @author aeizzz
 * @email aeizzz@foxmail.com
 * @date 2018-12-01 09:53:10
 */
@RestController
@RequestMapping("generator/problem")
public class ProblemController {
    @Autowired
    private ProblemService problemService;

    /**
     * 列表
     */
    @RequestMapping("/list")
    public Result list(@RequestParam Map<String, Object> params) {
        PageUtils page = problemService.queryPage(params);

        return Res.makeOKRsp(page);
    }


    /**
     * 信息
     */
    @RequestMapping("/info/{probid}")
    public Result info(@PathVariable("probid") Integer probid) {
        ProblemEntity problem = problemService.selectById(probid);

        return Res.makeOKRsp(problem);
    }

    /**
     * 保存
     */
    @RequestMapping("/save")
    public Result save(@RequestBody ProblemEntity problem) {
        problemService.insert(problem);

        return Res.makeOKRsp();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    public Result update(@RequestBody ProblemEntity problem) {
        problemService.updateById(problem);

        return Res.makeOKRsp();
    }

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public Result delete(@RequestBody Integer[] probids) {
        problemService.deleteBatchIds(Arrays.asList(probids));

        return Res.makeOKRsp();
    }

}
