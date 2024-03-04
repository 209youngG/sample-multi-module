package com.sample.core.infra.jpa;

import com.sample.core.infra.SampleConfig;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@EnableJpaAuditing
@EnableTransactionManagement
@EntityScan("com.sample")
@EnableJpaRepositories("com.sample")
public class JpaConfig implements SampleConfig {
}
