package com.lagou.repository;

import com.lagou.entity.City;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @Author: Jaa
 * @Date: 2023/2/8 22:56
 * @Description:
 */
public interface CityRepository extends JpaRepository<City, Long> {
}
