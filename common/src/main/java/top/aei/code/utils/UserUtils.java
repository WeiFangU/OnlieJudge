package top.aei.code.utils;


import io.jsonwebtoken.Claims;
import io.jsonwebtoken.Jwts;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import top.aei.code.constant.CommonConstant;

import javax.servlet.http.HttpServletRequest;
import java.util.ArrayList;
import java.util.Base64;
import java.util.List;

/**
 * @author aeizzz 获取用户名
 */
public class UserUtils {

    private static Logger logger = LoggerFactory.getLogger(UserUtils.class);

    /**
     * 根据用户请求中的token 获取用户名
     */
    public static String getUserName(HttpServletRequest request) {
        String username = "";
        String token = getToken(request);
        if (StringUtils.isEmpty(token)) {
            return username;
        }
        String key = Base64.getEncoder().encodeToString(CommonConstant.SIGN_KEY.getBytes());
        try {
            Claims claims = Jwts.parser().setSigningKey(key).parseClaimsJws(token).getBody();
            username = claims.get("user_name").toString();
        } catch (Exception ex) {
            logger.error("用户名解析异常,token:{},key:{}", token, key);
        }
        return username;
    }

    /**
     * 根据请求heard中的token获取用户角色
     */
    public static List<String> getRole(HttpServletRequest request) {
        String token = getToken(request);
        String key = Base64.getEncoder().encodeToString(CommonConstant.SIGN_KEY.getBytes());
        try {
            Claims claims = Jwts.parser().setSigningKey(key).parseClaimsJws(token).getBody();
            List<String> roleNames = (List<String>) claims.get("authorities");
            return roleNames;
        } catch (Exception ex) {
            return new ArrayList<String>();
        }
    }

    /**
     * 获取请求中token
     *
     * @return token
     */
    private static String getToken(HttpServletRequest request) {
        String authorization = request.getHeader(CommonConstant.REQ_HEADER);
        return StringUtils.substringAfter(authorization, CommonConstant.TOKEN_SPLIT);
    }


}
