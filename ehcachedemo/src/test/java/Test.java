import com.ldf.ehcache.App;
import com.ldf.ehcache.domain.UserInfo;
import com.ldf.ehcache.mapper.ITestMapper;
import com.ldf.ehcache.service.TestService;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.cache.Cache;
import org.springframework.cache.CacheManager;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

/**
 * Created by ldf on 2018/6/27.
 */
@RunWith(SpringRunner.class)
@SpringBootTest(classes = App.class)
public class Test {

    @Autowired
    private TestService testService;
    @Autowired
    private CacheManager cacheManager;

    @org.junit.Test
    public void cacheTest(){
        List<UserInfo> userInfos = testService.getUsers();
        Cache userCache = cacheManager.getCache("userCache");
        System.out.println("------------");
    }

}
