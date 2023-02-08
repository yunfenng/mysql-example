package com.lagou.id;

import org.apache.shardingsphere.core.strategy.keygen.SnowflakeShardingKeyGenerator;
import org.apache.shardingsphere.spi.keygen.ShardingKeyGenerator;

import java.util.Properties;

/**
 * @Author: Jaa
 * @Date: 2023/2/7 23:28
 * @Description:
 */
public class MyLagouId implements ShardingKeyGenerator {

    private SnowflakeShardingKeyGenerator snow = new SnowflakeShardingKeyGenerator();

    @Override
    public Comparable<?> generateKey() {
        System.out.println("-----执行了自定义主键生成器-----");
        return snow.generateKey();
    }

    @Override
    public String getType() {
        return "LAGOUKEY";
    }

    @Override
    public Properties getProperties() {
        return null;
    }

    @Override
    public void setProperties(Properties properties) {

    }
}
