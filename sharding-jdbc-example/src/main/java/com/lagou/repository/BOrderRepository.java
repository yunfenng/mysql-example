package com.lagou.repository;

import com.lagou.entity.BOrder;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @Author: Jaa
 * @Date: 2023/2/9 9:25
 * @Description:
 */
public interface BOrderRepository extends JpaRepository<BOrder, Long> {
}
