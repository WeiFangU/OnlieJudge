package top.aei.code.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import top.aei.code.common.Res;
import top.aei.code.common.Result;
import top.aei.code.entity.RoleEntity;
import top.aei.code.service.RoleService;
import top.aei.code.utils.PageUtils;

import java.util.Arrays;
import java.util.Map;


/**
 * @author aeizzz
 * @email aeizzz@foxmail.com
 * @date 2018-12-01 09:53:10
 */
@RestController
@RequestMapping("role")
public class RoleController {
    @Autowired
    private RoleService roleService;

    /**
     * 列表
     */
    @RequestMapping("/list")
    public Result list(@RequestParam Map<String, Object> params) {
        PageUtils page = roleService.queryPage(params);

        return Res.makeOKRsp(page);
    }


    /**
     * 信息
     */
    @RequestMapping("/info/{roleid}")
    public Result info(@PathVariable("roleid") Integer roleid) {
        RoleEntity role = roleService.selectById(roleid);

        return Res.makeOKRsp(role);
    }

    /**
     * 保存
     */
    @RequestMapping("/save")
    public Result save(@RequestBody RoleEntity role) {
        roleService.insert(role);

        return Res.makeOKRsp();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    public Result update(@RequestBody RoleEntity role) {
        roleService.updateById(role);

        return Res.makeOKRsp();
    }

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public Result delete(@RequestBody Integer[] roleids) {
        roleService.deleteBatchIds(Arrays.asList(roleids));

        return Res.makeOKRsp();
    }

}
