package com.xxl.job.admin;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**http://127.0.0.1:8080/xxl-job-admin/api
 * @author xuxueli 2018-10-28 00:38:13
 * http://localhost:8080/xxl-job-admin
 * 默认登录账号 "admin/123456"
 */
@SpringBootApplication
public class XxlJobAdminApplication {

	public static void main(String[] args) {
        SpringApplication.run(XxlJobAdminApplication.class, args);
	}

}