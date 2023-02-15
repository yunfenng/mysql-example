package dao;

import com.lagou.RunBoot;
import com.lagou.entity.CUser;
import com.lagou.repository.CUserRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;
import java.util.List;

/**
 * @Author: Jaa
 * @Date: 2023/2/15 16:33
 * @Description:
 */
@RunWith(SpringRunner.class)
@SpringBootTest(classes = RunBoot.class)
public class TestEncryptor {

    @Resource
    private CUserRepository userRepository;

    @Test
    public void testAdd() {
        CUser user = new CUser();
        user.setName("scott");
        user.setPwd("abc");
        userRepository.save(user);
    }

    @Test
    public void testFind() {
        List<CUser> list = userRepository.findByPwd("abc");
        list.forEach(cUser -> {
            System.out.println(cUser.toString());
        });
    }

}
