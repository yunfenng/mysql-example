package com.lagou.repository;

import com.lagou.entity.Position;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

/**
 * @Author: Jaa
 * @Date: 2023/2/7 0:09
 * @Description:
 */
public interface PositionRepository extends JpaRepository<Position, Long> {

    @Query(nativeQuery = true, value = "select p.id, p.name, p.salary, p.city, pd.description from position p join position_detail pd on (p.id = pd.pid) where p.id = :id")
    public Object findPositionById(@Param("id") long id);
}
