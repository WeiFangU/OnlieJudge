package top.aei.code.web;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import top.aei.code.constant.CommonConstant;
import top.aei.code.utils.UserUtils;

import javax.servlet.http.HttpServletRequest;

/**
 * 基础controller  能获取用户信息
 */
public class BaseController implements CommonConstant {
    protected Logger logger = LoggerFactory.getLogger(this.getClass());
    @Autowired
    private HttpServletRequest request;

    public String getUserName() {
        return UserUtils.getUserName(request);
    }

}
