package com.myprojects.spring.didemo;

import com.myprojects.spring.didemo.controllers.ConstructorInjectedController;
import com.myprojects.spring.didemo.controllers.MyController;
import com.myprojects.spring.didemo.controllers.PropertyInjectedController;
import com.myprojects.spring.didemo.controllers.SetterInjectedController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = {"com.myprojects.spring.services", "com.myprojects.spring.didemo"})
public class DiDemoApplication {

	public static void main(String[] args) {
		ApplicationContext ctx =  SpringApplication.run(DiDemoApplication.class, args);

		MyController controller = (MyController) ctx.getBean("myController");
		controller.hello();

		System.out.println(ctx.getBean(PropertyInjectedController.class).sayHello());
        System.out.println(ctx.getBean(ConstructorInjectedController.class).sayHello());
        System.out.println(ctx.getBean(SetterInjectedController.class).sayHello());



	}
}
