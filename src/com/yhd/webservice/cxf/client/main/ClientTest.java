package com.yhd.webservice.cxf.client.main;

import java.util.List;

import org.apache.cxf.jaxws.JaxWsProxyFactoryBean;

import com.yhd.webservice.cxf.client.info.Person;
import com.yhd.webservice.cxf.client.info.PersonService;

/**
 * 类名称：ClientTest.java<br>
 * 类描述：<br>
 * 创建时间：2016年11月15日, 上午10:04:16
 * 
 * @version 1.0 
 * @since JDK版本
 * @author flx 
 */

public class ClientTest {

	public static void main(String[] args) {

		JaxWsProxyFactoryBean factory = new JaxWsProxyFactoryBean();
		factory.setServiceClass(PersonService.class);
		factory.setAddress("http://localhost:8081/hello/person");
		PersonService service = (PersonService)factory.create();
		List<Person> list = (List<Person>)service.findAll("张");
		
		for(Person person : list) {
			System.out.println("name=" + person.getName());
			System.out.println("age=" + person.getAge());
			System.out.println("-------------------");
		}
	}

}
