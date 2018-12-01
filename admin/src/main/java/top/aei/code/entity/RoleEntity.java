package top.aei.code.entity;

import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import lombok.Data;

import java.io.Serializable;
import java.util.Date;

/**
 * @author aeizzz
 * @email aeizzz@foxmail.com
 * @date 2018-12-01 09:53:10
 */
@Data
@TableName("role")
public class RoleEntity implements Serializable {
    private static final long serialVersionUID = 1L;

    /**
     *
     */
    @TableId
    private Integer roleid;
    /**
     *
     */
    private String role;
    /**
     *
     */
    private String description;

}
