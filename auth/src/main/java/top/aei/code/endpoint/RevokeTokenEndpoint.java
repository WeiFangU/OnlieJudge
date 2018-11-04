package top.aei.code.endpoint;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.security.oauth2.provider.endpoint.FrameworkEndpoint;
import org.springframework.security.oauth2.provider.token.ConsumerTokenServices;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import top.aei.code.common.Res;
import top.aei.code.common.Result;

/**
 * @author aeizzz
 * 退出登陆,删除token
 */
@FrameworkEndpoint
public class RevokeTokenEndpoint {


    @Autowired
    @Qualifier("consumerTokenServices")
    ConsumerTokenServices consumerTokenServices;

    @DeleteMapping(value = "/oauth/token")
    @ResponseBody
    public Result revokeToken(String accsee_token) {
        if (consumerTokenServices.revokeToken(accsee_token)) {
            return Res.makeOKRsp("注销成功");
        } else {
            return Res.makeErrRsp("注销失败");
        }
    }
}
