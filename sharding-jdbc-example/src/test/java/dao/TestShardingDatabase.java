package dao;

import com.lagou.RunBoot;
import com.lagou.entity.Position;
import com.lagou.entity.PositionDetail;
import com.lagou.repository.PositionDetailRepository;
import com.lagou.repository.PositionRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;

/**
 * @Author: Jaa
 * @Date: 2023/2/7 10:25
 * @Description:
 */
@RunWith(SpringRunner.class)
@SpringBootTest(classes = RunBoot.class)
public class TestShardingDatabase {

    @Resource
    private PositionRepository positionRepository;

    @Resource
    private PositionDetailRepository positionDetailRepository;

    @Test
    public void testAdd() {
        for (int i = 1; i <= 20; i++) {
            Position position = new Position();
            // position.setId(i);
            position.setName("lagou" + 1);
            position.setSalary("1000000");
            position.setCity("Shanghai");
            positionRepository.save(position);
        }
    }

    @Test
    public void testAdd2() {
        for (int i = 1; i <= 20; i++) {
            Position position = new Position();
            position.setName("lagou" + 1);
            position.setSalary("1000000");
            position.setCity("Shanghai");
            positionRepository.save(position);

            PositionDetail positionDetail = new PositionDetail();
            positionDetail.setPid(position.getId());
            positionDetail.setDescription("this is a message " + i);
            positionDetailRepository.save(positionDetail);
        }
    }
}
