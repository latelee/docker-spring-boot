package com.waylau.docker_spring_boot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.boot.context.web.SpringBootServletInitializer;
import org.springframework.boot.builder.SpringApplicationBuilder;

/**
 * 主应用入口
 * @author <a href="http://latelee.org">latelee.org</a>
 * @date 2017年12月30日
 */
@SpringBootApplication
public class Application extends SpringBootServletInitializer {

    @RequestMapping("/")
	public String home() {
		return "Hello Docker World. <br />"
				+ "Welcome to Late Lee website:<a href='http://latelee.org'>latelee.org</a></li>";
	}
    // 修改启动类，继承 SpringBootServletInitializer 并重写 configure 方法
    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
        return application.sources(Application.class);
    }

    public static void main(String[] args) throws Exception {
        SpringApplication.run(Application.class, args);
    }

}
