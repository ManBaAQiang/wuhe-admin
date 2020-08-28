package com.wuhe.wuheadmin.mapper;

import com.wuhe.wuheadmin.entity.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

/**
 * @ClassName UserMapper
 * @Description :
 * @Date 2020/8/27 18:05
 * @Version 1.0
 **/

@Mapper
@Repository
public interface UserMapper {

//    @Select()
    /*@Results({
            @Result(property = "desc",column = "userDesc"),
            @Result(property = "userId",column = "userId"),
            @Result(property = "userName",column = "userName")
    })*/
    User queryUser(Integer id);
}
