package com.xworkz.it.web;

import java.io.IOException;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class LifeCycle extends GenericServlet {
	public LifeCycle() {
		System.out.println("created" + this.getClass().getSimpleName());
	}

	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		System.out.println("invoked serive in lifecycle");
	}

	@Override
	public void init() throws ServletException {
		System.out.println("invoked init in lifecycle");
		super.init();
	}

	@Override
	public void destroy() {
		System.out.println("invoke destroy in lifecycle");
		super.destroy();
	}

}
