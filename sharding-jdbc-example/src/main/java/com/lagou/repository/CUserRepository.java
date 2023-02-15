package com.lagou.repository;

import com.lagou.entity.CUser;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * @Author: Jaa
 * @Date: 2023/2/15 15:44
 * @Description:
 */
public interface CUserRepository extends JpaRepository<CUser, Long> {

    public List<CUser> findByPwd(String pwd);
}
