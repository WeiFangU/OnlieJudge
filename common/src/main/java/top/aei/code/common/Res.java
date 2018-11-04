package top.aei.code.common;


import top.aei.code.constant.CommonConstant;

/**
 * @author aeizzz
 */
public class Res implements CommonConstant {

    private final static String SUCCESS = "success";

    public static <T> Result<T> makeOKRsp() {
        return new Result<T>(SUCCESS_CODE).message(SUCCESS);
    }

    public static <T> Result<T> makeOKRsp(String message) {
        return new Result<T>(SUCCESS_CODE).message(message);
    }

    public static <T> Result<T> makeOKRsp(T data) {
        return new Result<T>(SUCCESS_CODE).message(SUCCESS).data(data);
    }

    public static <T> Result<T> makeErrRsp(String message) {
        return new Result<T>(FAIL_CODE).message(message);
    }

    public static <T> Result<T> makeRsp(int code, String msg) {
        return new Result<T>(code).message(msg);
    }

    public static <T> Result<T> makeRsp(int code, String msg, T data) {
        return new Result<T>(code).message(msg).data(data);
    }


}
