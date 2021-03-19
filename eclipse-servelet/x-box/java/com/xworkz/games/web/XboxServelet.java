package com.xworkz.games.web;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class XboxServelet extends HttpServlet {
	public XboxServelet() {
		System.out.println("created" + this.getClass().getSimpleName());
	}

	@Override
	public void init(ServletConfig config) throws ServletException {
		System.out.println("invoked init  from XboxServelet");
		super.init(config);
	}

	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("invoked service XboxServelet");
		String game = req.getParameter("game");
		String gameType = req.getParameter("gametype");
		String series = req.getParameter("series");
		String code = req.getParameter("couponcode");
		String userName = req.getParameter("username");
		String email = req.getParameter("email");
		String date = req.getParameter("date");
		System.out.println(game);
		System.out.println(gameType);
		System.out.println(series);
		System.out.println(code);
		System.out.println(userName);
		System.out.println(email);
		System.out.println(date);
		
		resp.setContentType("text/html");
		PrintWriter writer = resp.getWriter();
		writer.println("<html>");
		writer.println("<body>");
		writer.println("<h1>");
		writer.println("<b>");
		writer.println(" game order is sucessfull");
		writer.println("</b>");
		writer.println("</h1>");
		writer.println("</body>");
		writer.println("</html>");

	}

	@Override
	public void destroy() {
		System.out.println("invoked destroy XboxServelet");
		super.destroy();
	}
}
