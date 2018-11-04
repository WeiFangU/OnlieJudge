package top.aei.code.utils;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

/**
 * @author XuYunXuan
 * @ClassName: PasswordUtils
 * @Description:
 * @date 2018-04-03 15:11
 */
public class PasswordUtils {

    private static PasswordEncoder encoder = new BCryptPasswordEncoder();

    public static String passwordEncode(String plainPassword){
        return encoder.encode(plainPassword);
    }

    public static void main(String[] args){
        System.out.println(passwordEncode("1234"));
    }

}
