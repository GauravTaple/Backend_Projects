package com.spring.orm;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.spring.orm.dao.StudentDao;
import com.spring.orm.entities.Student;

public class App 
{
    public static void main( String[] args )
    {
    	ApplicationContext context=new ClassPathXmlApplicationContext("Config.xml");
    	StudentDao studentDao = context.getBean("studentDao",StudentDao.class);
    	Student student=new Student(1200,"Gaurav Taple","Ahmednagar");
    	int insert = studentDao.insert(student);
    	System.out.println("done"+insert);
    	
//    	BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
    }
}
