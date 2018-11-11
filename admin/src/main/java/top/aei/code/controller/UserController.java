package top.aei.code.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;
import top.aei.code.common.Res;
import top.aei.code.common.Result;
import top.aei.code.service.IUserService;
import top.aei.code.utils.PageUtils;
import top.aei.code.web.BaseController;

import java.util.Map;

@RestController
public class UserController extends BaseController {


    @Autowired
    private IUserService userService;


    public Result list(Map<String, Object> params) {
        PageUtils page = userService.queryPage(params);
        return Res.makeOKRsp(page);
    }


}
