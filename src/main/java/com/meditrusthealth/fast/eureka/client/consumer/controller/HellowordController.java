/**
 *  www.meditrusthealth.cn Copyright © MediTrust Health 2017
 */
package com.meditrusthealth.fast.eureka.client.consumer.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * <p>
 * </p>
 *
 * @author xiaoyu.wang
 * @date 2017年10月3日 下午3:43:23
 * @version
 */
@RestController
@RequestMapping(value = "/consumer")
public class HellowordController {

	private static final Logger LOG = LoggerFactory.getLogger(HellowordController.class);

	private static final String URL = "http://fast-eureka-client-provider/provider/hello";

	@Autowired
	private RestTemplate restTemplate;

	@Value("${app.env}")
	private String env;

	@GetMapping(value = "/hello")
	public String hello() {
		String message = restTemplate.getForEntity(URL, String.class).getBody();
		// return "Consumer Helloword";
		LOG.info("message:{}", message);
		return message;
	}

	@GetMapping(value = "/config")
	public String config() {
		LOG.info("app.env:{}", env);
		return env;
	}
}
