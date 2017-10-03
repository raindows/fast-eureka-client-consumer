/**
 *  www.meditrusthealth.cn Copyright © MediTrust Health 2017
 */
package com.meditrusthealth.fast.eureka.client.consumer.config;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * <p>
 * </p>
 *
 * @author xiaoyu.wang
 * @date 2017年10月3日 下午3:55:44
 * @version
 */
@Configuration
public class Config {

	@Bean
	@LoadBalanced
	RestTemplate restTemplate() {
		return new RestTemplate();
	}
}
