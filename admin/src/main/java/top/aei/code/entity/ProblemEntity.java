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
@TableName("problem")
@Data
public class ProblemEntity implements Serializable {
    private static final long serialVersionUID = 1L;

    /**
     *
     */
    @TableId
    private Integer probid;
    /**
     *
     */
    private String name;
    /**
     *
     */
    private Float timelimit;
    /**
     *
     */
    private Integer memlimit;
    /**
     *
     */
    private Integer outputlimit;
    /**
     *
     */
    private String problemtext;
    /**
     *
     */
    private String problemtextType;

}
