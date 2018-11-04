package top.aei.code.annotation;

import java.lang.annotation.*;

/**
 * 系统日志注解
 * 
 * @author aeizzz
 * @email aeizzz@foxmail.com
 */
@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface SysLog {

	String value() default "";
}
