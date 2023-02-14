package dao;

import com.lagou.RunBoot;
import com.lagou.entity.City;
import com.lagou.repository.CityRepository;
import org.apache.shardingsphere.api.hint.HintManager;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;
import java.util.List;

/**
 * @Author: Jaa
 * @Date: 2023/2/14 10:14
 * @Description:
 */
@RunWith(SpringRunner.class)
@SpringBootTest(classes = RunBoot.class)
public class TestHintShardingAlgorithm {

    @Resource
    private CityRepository cityRepository;

    @Test
    public void test1() {
        HintManager hintManager = HintManager.getInstance();
        hintManager.setDatabaseShardingValue(0L);
        List<City> cityList = cityRepository.findAll();
        cityList.forEach(city -> {
            System.out.println(city.toString());
        });
    }

}
