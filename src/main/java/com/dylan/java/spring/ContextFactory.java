package com.dylan.java.spring;

import java.io.IOException;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;
import org.springframework.core.io.ByteArrayResource;
import org.springframework.core.io.Resource;

import com.dylan.java.spring.bean.MsgDefinition;
import com.dylan.java.spring.bean.ReplierSource;
import com.dylan.java.spring.context.GenericStringApplicationContext;
import com.dylan.java.spring.util.SpringUtil;

public class ContextFactory {
	
	
	public static void main(String[] args) throws IOException {
		
		byte[] context = SpringUtil.getContext("E:/repository/java/bin/com/dylan/java/spring/bean-string.xml");
		Resource resource = new ByteArrayResource(context);
		
		
		
		ApplicationContext cpxcontext = new ClassPathXmlApplicationContext("bean-common.xml");
		
		ReplierSource  replierSource = (ReplierSource)cpxcontext.getBean("replierSource1");
		System.out.println(replierSource.getName());
		
		GenericStringApplicationContext springContext = new GenericStringApplicationContext();
		springContext.setParent(cpxcontext);
		springContext.load(resource);
		springContext.refresh();
		
		MsgDefinition myBean = (MsgDefinition)springContext.getBean("msgdefinion1");
		System.out.println(myBean.getGroupName());
		System.out.println(myBean.getReplierSource().getRegion());
		
	}
	

}
