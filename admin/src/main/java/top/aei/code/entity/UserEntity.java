package top.aei.code.entity;

import com.baomidou.mybatisplus.activerecord.Model;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableName;
import lombok.Data;

import java.io.Serializable;

@Data
@TableName("user")
public class UserEntity extends Model<UserEntity> {
    @TableField(value = "id")
    private Long id;
    private String username;
    private String name;
    private String password;
    private Integer type;
    private Integer status;
    private String email;
    private String mobile;
    private String ip;
    private Long teamId;
    private Long orgn;


    @Override
    protected Serializable pkVal() {
        return this.id;
    }
}
