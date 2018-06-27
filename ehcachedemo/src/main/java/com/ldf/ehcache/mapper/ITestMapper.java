package com.ldf.ehcache.mapper;

import com.ldf.ehcache.domain.UserInfo;
import org.apache.ibatis.annotations.Param;
import org.springframework.cache.annotation.CacheConfig;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by ldf on 2018/6/26.
 */
@Repository
public interface ITestMapper {

    int addUser(@Param("userInfo") UserInfo userInfo);

    List<UserInfo> selectUserList(@Param("name") String name);

    int updateUser(@Param("userInfo") UserInfo userInfo);

    int delUser(@Param("name") String name);
}
