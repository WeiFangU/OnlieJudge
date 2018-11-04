package top.aei.code.common;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import top.aei.code.constant.CommonConstant;

import java.io.Serializable;

/**
 * 返回请求结果
 * @author aeizzz
 * @param <T>
 */
@ApiModel("请求返回结果")
public class Result<T> implements Serializable {

    @ApiModelProperty("请求返回信息")
    private String msg = "success";

    @ApiModelProperty("请求状态码（0成功 1失败）")
    private int code = CommonConstant.SUCCESS_CODE;

    @ApiModelProperty("请求返回数据")
    private T data;

    public Result() {
        super();
    }

    public Result(int code) {
        super();
        this.code = code;
    }

    public Result<T> data(T data) {
        this.data = data;
        return this;
    }

    public Result<T> message(String msg) {
        this.msg = msg;
        return this;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }
}
