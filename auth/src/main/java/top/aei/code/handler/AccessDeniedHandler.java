package top.aei.code.handler;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.apache.http.HttpStatus;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.AccessDeniedException;
import org.springframework.security.oauth2.provider.error.OAuth2AccessDeniedHandler;
import org.springframework.stereotype.Component;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Map;

/**
 * @author aeizzz
 * 重写授权失败信息
 */

@Component
public class AccessDeniedHandler extends OAuth2AccessDeniedHandler {
    private static Logger logger = LoggerFactory.getLogger(AccessDeniedHandler.class);

    @Autowired
    private ObjectMapper objectMapper;

    @Override
    public void handle(HttpServletRequest request, HttpServletResponse response, AccessDeniedException authException)
        throws IOException, ServletException {
        logger.info("授权失败，禁止访问");
        response.setCharacterEncoding("UTF-8");
        response.setContentType("application/json; charset=utf-8");
        Map<String, Object> result = new HashMap();
        result.put("msg", "授权失败，禁止访问");
        result.put("code", HttpStatus.SC_FORBIDDEN);
        response.setStatus(HttpStatus.SC_FORBIDDEN);
        PrintWriter printWriter = response.getWriter();
        printWriter.append(objectMapper.writeValueAsString(result));

    }
}
