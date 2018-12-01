package top.aei.code.mapper;

import com.baomidou.mybatisplus.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;
import top.aei.code.entity.UserEntity;

@Mapper
public interface UserMapper extends BaseMapper<UserEntity> {
}
