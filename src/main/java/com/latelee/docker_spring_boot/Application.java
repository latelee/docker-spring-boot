package com.waylau.docker_spring_boot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
 
/**
 * 主应用入口
 * @author <a href="http://latelee.org">latelee.org</a>
 * @date 2017年12月30日
 */
@SpringBootApplication
@RestController
public class Application {

	@RequestMapping("/")
	public String home() {
		return "Hello Docker World. <br />"
				+ "Welcome to Late Lee website:<a href='http://latelee.org'>latelee.org</a></li>";
	}

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

}