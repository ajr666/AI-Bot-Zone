package com.kob.backend.backend.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.kob.backend.backend.pojo.User;
import org.apache.ibatis.annotations.Mapper;

@Mapper//一个表对应一个pojo，一个pojo对应一个mapper
public interface UserMapper extends BaseMapper<User> {
}
