package com.sample.core.infra.jasypt;

import com.sample.core.infra.SampleConfig;
import org.jasypt.encryption.StringEncryptor;
import org.jasypt.encryption.pbe.PooledPBEStringEncryptor;
import org.jasypt.encryption.pbe.config.SimpleStringPBEConfig;
import org.springframework.context.annotation.Bean;

public class JasyptConfig implements SampleConfig {

	static final String KEY = "default!23";

	static final String ALGORITHM = "PBEWithMD5AndDES";

	@Bean
	public StringEncryptor jasyptStringEncryptor() {
		PooledPBEStringEncryptor encryptor = new PooledPBEStringEncryptor();
		SimpleStringPBEConfig config = new SimpleStringPBEConfig();
		config.setPassword(KEY);
		config.setAlgorithm(ALGORITHM);
		config.setPoolSize(100);
		encryptor.setConfig(config);
		return encryptor;
	}

}