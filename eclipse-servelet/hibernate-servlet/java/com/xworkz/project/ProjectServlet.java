package com.xworkz.project;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.xworkz.project.dao.ProjectDAO;
import com.xworkz.project.dao.ProjectDAOImpl;
import com.xworkz.project.entity.ProjectEntity;

public class ProjectServlet extends HttpServlet {
	public ProjectServlet() {
		System.out.println("created" + this.getClass().getSimpleName());
	}

	@Override
	public void init(ServletConfig config) throws ServletException {
		System.out.println("invoked init method");
	}

	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("invoked Service created");
		String name = req.getParameter("name");
		String phone = req.getParameter("phone");
		String company = req.getParameter("company");
		String email = req.getParameter("email");
		String project = req.getParameter("project");
		System.out.println(name);
		System.out.println(phone);
		System.out.println(company);
		System.out.println(email);
		System.out.println(project);

		resp.setContentType("text/html");
		PrintWriter writer = resp.getWriter();
		writer.println("<html>");
		writer.println("<body>");
		writer.println("<h1>");
		writer.println("<b>");
		writer.println(" Project from is sucessfull");
		writer.println("</b>");
		writer.println("</h1>");
		writer.println("</body>");
		writer.println("</html>");
		ProjectEntity en = new ProjectEntity();
		en.setName(name);
		en.setPhone(phone);
		en.setCompany(company);
		en.setEmail(email);
		en.setProject(project);
		ProjectDAO dao = new ProjectDAOImpl();
		dao.create(en);
	}

	@Override
	public void destroy() {
		System.out.println("invoked destroy XboxServelet");
		super.destroy();
	}

}
