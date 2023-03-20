package dao;

import com.lagou.RunBoot;
import com.lagou.entity.Position;
import com.lagou.repository.PositionRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;
import java.util.List;

/**
 * @Author: Jaa
 * @Date: 2023/3/20 16:41
 * @Description:
 */
@RunWith(SpringRunner.class)
@SpringBootTest(classes = RunBoot.class)
public class TestPosition {

    @Resource
    private PositionRepository positionRepository;

    @Test
    public void test1() {
        List<Position> positionList = positionRepository.findAll();
        positionList.forEach(position -> {
            System.out.println(position.getId() + ", " + position.getName() + ", " + position.getCity());
        });
    }

    @Test
    public void test2() {
        Position position = new Position();
        position.setName("tiger");
        position.setSalary("30000");
        position.setCity("shanghai");
        positionRepository.save(position);
    }
}
