package com.timmy.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.timmy.entity.Bean2;
import com.timmy.entity.Bean3;
import com.timmy.entity.Book;
import com.timmy.entity.Person;
import com.timmy.entity.PropertyDemo1;
import com.timmy.entity.UserService;


public class Test {

	public static void main(String[] args) {
     ApplicationContext context=new ClassPathXmlApplicationContext("applicationContext.xml");
//     Bean3 bean3=(Bean3) context.getBean("bean3");
//     Bean3 bean4=(Bean3) context.getBean("bean3");
 //    PropertyDemo1 propertyDemo1=(PropertyDemo1) context.getBean("propertyDemo");
  //   Book book=(Book) context.getBean("book");
    // System.out.println(bean3==bean4);
//    book.test();
    // UserService userService=(UserService) context.getBean("userService");
    // userService.test();
     Person person=(Person) context.getBean("person");
     person.testArr();
     person.testlist();
     person.testmap();
     person.testproperties();
	}

}
