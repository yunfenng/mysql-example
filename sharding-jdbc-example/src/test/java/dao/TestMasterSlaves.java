package dao;

import com.lagou.RunBoot;
import com.lagou.entity.BOrder;
import com.lagou.repository.BOrderRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.Repeat;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;
import java.util.Date;
import java.util.List;
import java.util.Random;

/**
 * @Author: Jaa
 * @Date: 2023/2/13 10:51
 * @Description:
 */
@RunWith(SpringRunner.class)
@SpringBootTest(classes = RunBoot.class)
public class TestMasterSlaves {

    @Resource
    private BOrderRepository orderRepository;

    @Test
    @Repeat(100)
    public void testShardingBOrder(){
        Random random = new Random();
        int companyId = random.nextInt(10);
        BOrder order = new BOrder();
        order.setDel(false);
        order.setCompanyId(companyId);
        order.setPositionId(3242342);
        order.setUserId(2222);
        order.setPublishUserId(1111);
        order.setResumeType(1);
        order.setStatus("AUTO");
        order.setCreateTime(new Date());
        order.setOperateTime(new Date());
        order.setWorkYear("2");
        order.setName("lagou");
        order.setPositionName("Java");
        order.setResumeId(23233);
        orderRepository.save(order);
    }

    @Test
    public void testFind() {
        List<BOrder> list = orderRepository.findAll();
        list.forEach(bOrder -> {
            System.out.println(bOrder.toString());
        });
    }
}
