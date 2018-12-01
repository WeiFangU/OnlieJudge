package top.aei.code.entity;

import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import lombok.Data;

import java.io.Serializable;
import java.util.Date;

/**
 * 
 * 
 * @author aeizzz
 * @email aeizzz@foxmail.com
 * @date 2018-12-01 09:53:10
 */
@Data
@TableName("contest")
public class ContestEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * 比赛id
	 */
	@TableId
	private Integer cid;
	/**
	 * 比赛名称
	 */
	private String name;
	/**
	 * 比赛简称
	 */
	private String shortname;
	/**
	 * 激活比赛时间
	 */
	private Date activatetime;
	/**
	 * 比赛开始时间
	 */
	private Date starttime;
	/**
	 * 封榜时间
	 */
	private Date freezetime;
	/**
	 * 比赛结束时间
	 */
	private Date endtime;
	/**
	 * 封榜结束时间
	 */
	private Date unfreezetime;
	/**
	 * 比赛完全截止时间
	 */
	private Date deactivatetime;
	/**
	 * 是否开启
	 */
	private Integer enabled;
	/**
	 * 是否公共
	 */
	private Integer ispublic;


}
