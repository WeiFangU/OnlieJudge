package top.aei.code.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import top.aei.code.common.Res;
import top.aei.code.common.Result;
import top.aei.code.entity.ContestEntity;
import top.aei.code.service.ContestService;
import top.aei.code.utils.PageUtils;

import java.util.Arrays;
import java.util.Map;


/**
 * @author aeizzz
 * @email aeizzz@foxmail.com
 * @date 2018-12-01 09:53:10
 */
@RestController
@RequestMapping("contest")
public class ContestController {
    @Autowired
    private ContestService contestService;

    /**
     * 列表
     */
    @GetMapping("/list")
    public Result list(@RequestParam Map<String, Object> params) {
        PageUtils page = contestService.queryPage(params);

        return Res.makeOKRsp(page);
    }


    /**
     * 信息
     */
    @GetMapping("/info/{cid}")
    public Result info(@PathVariable("cid") Integer cid) {
        ContestEntity contest = contestService.selectById(cid);

        return Res.makeOKRsp(contest);
    }

    /**
     * 保存
     */
    @PostMapping("/save")
    public Result save(@RequestBody ContestEntity contest) {
        contestService.insert(contest);

        return Res.makeOKRsp();
    }

    /**
     * 修改
     */
    @PutMapping("/update")
    public Result update(@RequestBody ContestEntity contest) {
        contestService.updateById(contest);

        return Res.makeOKRsp();
    }

    /**
     * 删除
     */
    @DeleteMapping("/delete")
    public Result delete(@RequestBody Integer[] cids) {
        contestService.deleteBatchIds(Arrays.asList(cids));

        return Res.makeOKRsp();
    }

}
