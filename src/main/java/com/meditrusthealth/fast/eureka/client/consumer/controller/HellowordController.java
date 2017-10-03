/**
 *  www.meditrusthealth.cn Copyright © MediTrust Health 2017
 */
package com.meditrusthealth.fast.eureka.client.consumer.controller;

import org.springframework.beans.factory.annotation.Autowired;
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
@RequestMapping(name="/consumer")
public class HellowordController {

	private static final String URL = "http://fast-eureka-client-provider/provider/hello";
	
	@Autowired
	private RestTemplate restTemplate;

	@GetMapping(name = "/hello")
	public String hello() {
		String message = restTemplate.getForEntity(URL, String.class).getBody();
		// return "Consumer Helloword";
		return message;
	}
}
