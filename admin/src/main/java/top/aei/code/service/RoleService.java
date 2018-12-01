package top.aei.code.service;

import com.baomidou.mybatisplus.service.IService;
import top.aei.code.entity.RoleEntity;
import top.aei.code.utils.PageUtils;

import java.util.Map;

/**
 * @author aeizzz
 * @email aeizzz@foxmail.com
 * @date 2018-12-01 09:53:10
 */
public interface RoleService extends IService<RoleEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

