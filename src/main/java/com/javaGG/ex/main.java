package com.javaGG.ex;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String congifLocation = "classpath:applicationCTX.xml";
		AbstractApplicationContext ctx = new GenericXmlApplicationContext(congifLocation);
		MyInfo myInfo1 = ctx.getBean("myInfo1", MyInfo.class);
		MyInfo myInfo2 = ctx.getBean("myInfo2", MyInfo.class);
				
		myInfo1.getInfoPrint();
		System.out.println();
		myInfo2.getInfoPrint();
		ctx.close();
	}

}
