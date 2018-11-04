package top.aei.code.constant;

/**
 * @author aeizzz
 */
public interface CommonConstant {

    //通用用户角色
    String BASE_ROLE = "ROLE_USER";

    //实体类删除标记
    String DELETE_FLAG = "1";

    //实体类正常标记
    String NORMAL_FLAG = "0";

    //响应成功码
    int SUCCESS_CODE = 0;

    //响应失败码
    int FAIL_CODE = 1;

    //实体类更新人字段
    String UPDATE_BY = "updateBy";

    //实体类更新时间字段
    String UPDATE_DATE = "updateDate";

    //实体类创建人字段
    String CREATE_BY = "createBy";

    //实体类创建时间字段
    String CREATE_DATE = "createDate";

    //
    String DEL_FLAG = "delFlag";

    String FALSE = "0";

    String TRUE = "1";

    /**
     * jwt签名
     */
    String SIGN_KEY = "aei";
    /**
     * 请求头
     */
    String REQ_HEADER = "Authorization";

    /**
     * token分割符
     */
    String TOKEN_SPLIT = "Bearer ";
}
