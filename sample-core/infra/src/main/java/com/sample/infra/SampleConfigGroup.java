package com.sample.infra;

import com.sample.infra.async.AsyncConfig;
import com.sample.infra.jasypt.JasyptConfig;
import com.sample.infra.jpa.JpaConfig;
import com.sample.infra.mybatis.MybatisConfig;
import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
public enum SampleConfigGroup {

	ASYNC(AsyncConfig.class),
	JASYPT(JasyptConfig.class),
	JPA(JpaConfig.class),
	MYBATIS(MybatisConfig.class),
	;

	private final Class<? extends SampleConfig> configClass;

}
