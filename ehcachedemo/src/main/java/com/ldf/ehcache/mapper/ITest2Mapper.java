package com.ldf.ehcache.mapper;

import com.ldf.ehcache.domain.UserInfo;
import com.ldf.ehcache.domain.UserSchool;
import org.apache.ibatis.annotations.Param;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by ldf on 2018/6/26.
 */
@Repository
public interface ITest2Mapper {
    @Cacheable()
    List<UserSchool> selectUserSchoolList(@Param("name") String name);

}
