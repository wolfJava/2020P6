package com.wolfman.demo.mvc.action;

import com.wolfman.demo.service.IDemoService;
import com.wolfman.mvcframework.annotation.WFAutowired;
import com.wolfman.mvcframework.annotation.WFController;
import com.wolfman.mvcframework.annotation.WFRequestMapping;
import com.wolfman.mvcframework.annotation.WFRequestParam;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;


//虽然，用法一样，但是没有功能
@WFController
@WFRequestMapping("/demo")
public class DemoAction {

  	@WFAutowired
	private IDemoService demoService;

	@WFRequestMapping("/query")
	public void query(HttpServletRequest req, HttpServletResponse resp,
					  @WFRequestParam("name") String name,
					  @WFRequestParam("nikeName") String nikeName){
		String result = demoService.get(name, nikeName);
//		String result = "My name is " + name;
		try {
			resp.getWriter().write(result);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	@WFRequestMapping("/add")
	public void add(HttpServletRequest req, HttpServletResponse resp,
					@WFRequestParam("a") Integer a, @WFRequestParam("b") Integer b){
		try {
			resp.getWriter().write(a + "+" + b + "=" + (a + b));
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	@WFRequestMapping("/sub")
	public void add(HttpServletRequest req, HttpServletResponse resp,
					@WFRequestParam("a") Double a, @WFRequestParam("b") Double b){
		try {
			resp.getWriter().write(a + "-" + b + "=" + (a - b));
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	@WFRequestMapping("/remove")
	public String  remove(@WFRequestParam("id") Integer id){
		return "" + id;
	}

}
