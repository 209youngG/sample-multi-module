package com.sample.infra.jpa;

import com.sample.infra.SampleConfig;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@EnableTransactionManagement
@EntityScan("com.sample")
@EnableJpaRepositories("com.sample")
public class JpaConfig implements SampleConfig {
}
