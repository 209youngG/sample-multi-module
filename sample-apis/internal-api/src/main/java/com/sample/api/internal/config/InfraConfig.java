package com.sample.api.internal.config;

import com.sample.core.infra.EnableSampleConfig;
import com.sample.core.infra.SampleConfigGroup;
import org.springframework.context.annotation.Configuration;

@Configuration(proxyBeanMethods = false)
@EnableSampleConfig({
        SampleConfigGroup.ASYNC,
        SampleConfigGroup.JASYPT,
        SampleConfigGroup.JPA,
})
class InfraConfig {
}
