package top.aei.code.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiOperation;
import org.apache.commons.beanutils.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import top.aei.code.common.Res;
import top.aei.code.common.Result;
import top.aei.code.dto.UserDto;
import top.aei.code.entity.UserEntity;
import top.aei.code.service.IUserService;
import top.aei.code.utils.PageUtils;
import top.aei.code.web.BaseController;

import java.util.Map;

@RestController
@RequestMapping("user")
@Api(description = "用户接口")
public class UserController extends BaseController {


    @Autowired
    private IUserService userService;

    /**
     * 查询用户列表
     *
     * @param params
     * @return
     */
    @GetMapping("list")
    @ApiOperation(value = "",notes = "获取用户列表")
    public Result list(Map<String, Object> params) {
        PageUtils page = userService.queryPage(params);
        return Res.makeOKRsp(page);
    }

    /**
     * 保存用户
     *
     * @param userDto
     * @return
     */
    @PostMapping("save")
    @ApiOperation(value = "",notes = "获取保存用户")
    public Result save(UserDto userDto) {
        UserEntity user = new UserEntity();
        try {
            BeanUtils.copyProperties(user, userDto);
        } catch (Exception e) {
            return Res.makeErrRsp("保存失败");
        }
        userService.insert(user);
        return Res.makeOKRsp();
    }

    /**
     * 删除用户
     *
     * @param id
     * @return
     */
    @DeleteMapping("delete")
    @ApiOperation(value = "",notes = "删除用户")
    public Result delete(Long id) {
        userService.deleteById(id);
        return Res.makeOKRsp("删除成功");
    }

    /**
     * 批量导入用户
     *
     * @return
     */
    @PostMapping("importUser")
    @ApiOperation(value = "",notes = "导入用户")
    public Result importUser() {
        return Res.makeOKRsp();
    }

    /**
     * 用户导出
     *
     * @return
     */
    @GetMapping("exportUser")
    @ApiOperation(value = "",notes = "导出用户")
    public Result exportUser() {
        return Res.makeOKRsp();
    }

}
