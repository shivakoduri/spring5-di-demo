package com.myprojects.spring.didemo;

import com.myprojects.spring.didemo.controllers.ConstructorInjectedController;
import com.myprojects.spring.didemo.controllers.MyController;
import com.myprojects.spring.didemo.controllers.PropertyInjectedController;
import com.myprojects.spring.didemo.controllers.SetterInjectedController;
import com.myprojects.spring.didemo.examplebeans.SomeDataSource;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class DiDemoApplication {

	public static void main(String[] args) {
		ApplicationContext ctx =  SpringApplication.run(DiDemoApplication.class, args);

		MyController controller = (MyController) ctx.getBean("myController");

		SomeDataSource dataSource = (SomeDataSource) ctx.getBean(SomeDataSource.class);
		System.out.println(dataSource.getUser());
	}
}
