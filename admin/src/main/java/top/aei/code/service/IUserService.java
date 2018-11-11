package top.aei.code.service;

import com.baomidou.mybatisplus.service.IService;
import top.aei.code.entity.User;
import top.aei.code.utils.PageUtils;

import java.util.Map;

public interface IUserService extends IService<User> {
    PageUtils queryPage(Map<String, Object> params);
}
