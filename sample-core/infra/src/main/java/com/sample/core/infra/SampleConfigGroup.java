package com.sample.core.infra;

import com.sample.core.infra.async.AsyncConfig;
import com.sample.core.infra.jpa.JpaConfig;
import com.sample.core.infra.jasypt.JasyptConfig;
import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
public enum SampleConfigGroup {

	ASYNC(AsyncConfig.class),
	JASYPT(JasyptConfig.class),
	JPA(JpaConfig.class),
	;

	private final Class<? extends SampleConfig> configClass;

}
