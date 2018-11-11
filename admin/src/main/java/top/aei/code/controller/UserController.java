package top.aei.code.controller;

import org.apache.commons.beanutils.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import top.aei.code.common.Res;
import top.aei.code.common.Result;
import top.aei.code.dto.UserDto;
import top.aei.code.entity.User;
import top.aei.code.service.IUserService;
import top.aei.code.utils.PageUtils;
import top.aei.code.web.BaseController;

import java.lang.reflect.InvocationTargetException;
import java.util.Map;

@RestController
@RequestMapping("user")
public class UserController extends BaseController {


    @Autowired
    private IUserService userService;

    /**
     * 查询用户列表
     * @param params
     * @return
     */
    @GetMapping("list")
    public Result list(Map<String, Object> params) {
        PageUtils page = userService.queryPage(params);
        return Res.makeOKRsp(page);
    }

    /**
     * 保存用户
     * @param userDto
     * @return
     */
    @PostMapping("save")
    public Result save(UserDto userDto){
        User user = new User();
        try {
            BeanUtils.copyProperties(user,userDto);
        } catch (Exception e) {
            return Res.makeErrRsp("保存失败");
        }
        userService.insert(user);
        return Res.makeOKRsp();
    }

    /**
     * 删除用户
     * @param id
     * @return
     */
    @DeleteMapping("delete")
    public Result delete(Long id){
        userService.deleteById(id);
        return Res.makeOKRsp("删除成功");
    }

    /**
     * 批量导入用户
     * @return
     */
    public Result importUser(){
        return Res.makeOKRsp();
    }

    /**
     * 用户导出
     * @return
     */
    public Result exportUser(){
        return Res.makeOKRsp();
    }

}
