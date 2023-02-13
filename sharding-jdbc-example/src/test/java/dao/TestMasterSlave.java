package dao;

import com.lagou.RunBoot;
import com.lagou.entity.City;
import com.lagou.repository.CityRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;
import java.util.List;

/**
 * @Author: Jaa
 * @Date: 2023/2/12 23:24
 * @Description:
 */
@RunWith(SpringRunner.class)
@SpringBootTest(classes = RunBoot.class)
public class TestMasterSlave {

    @Resource
    private CityRepository cityRepository;

    @Test
    public void testAdd() {
        City city = new City();
        city.setName("杨浦区");
        city.setProvince("上海市");
        cityRepository.save(city);
    }

    @Test
    public void testFind() {
        List<City> list = cityRepository.findAll();
        list.forEach(city -> {
            System.out.println(city);
        });
    }


}
