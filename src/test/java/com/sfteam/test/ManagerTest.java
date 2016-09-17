/**
 * 
 */
package com.sfteam.test;

import org.junit.Before;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.sfteam.wxzysh.service.ManagerService;

/**
 * @ClassName: ManagerTest.java
 * @Description: 测试
 * @author: knight
 * @date: 2016年6月27日 下午12:34:05
 * @company: sfteam
 */
public class ManagerTest {

	private ManagerService managerService;

	@Before
	public void before(){
		ApplicationContext context = new ClassPathXmlApplicationContext(new String[]{"classpath:conf/spring.xml"
				,"classpath:conf/spring-mybatis.xml"});
		managerService = (ManagerService)context.getBean("managerServiceImpl");
	}

	public void login(){
		
	}
}
