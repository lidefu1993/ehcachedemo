package com.ldf.ehcache.service;

import com.ldf.ehcache.domain.UserInfo;
import com.ldf.ehcache.mapper.ITestMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CacheConfig;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by ldf on 2018/6/27.
 */
@Service
@CacheConfig(cacheNames = "userCache")
public class TestService {

    @Autowired
    private ITestMapper testMapper;

    @Cacheable
    public List<UserInfo> getUsers(){
        return testMapper.selectUserList("ldf");
    }

}
