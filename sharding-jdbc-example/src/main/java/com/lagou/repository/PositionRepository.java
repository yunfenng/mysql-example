package com.lagou.repository;

import com.lagou.entity.Position;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @Author: Jaa
 * @Date: 2023/2/7 0:09
 * @Description:
 */
public interface PositionRepository extends JpaRepository<Position, Long> {
}
