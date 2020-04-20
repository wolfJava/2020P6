package com.wolfman.demo.service.impl;


import com.wolfman.demo.service.IDemoService;
import com.wolfman.mvcframework.annotation.WFService;

/**
 * 核心业务逻辑
 */
@WFService("aservice")
public class DemoService implements IDemoService {

	public String get(String name, String nikeName) {
		return "My name is " + name + ".My nikeName is " + nikeName +  ",from service.";
	}

}
