package com.prot1.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.prot1.model.Job;

/**
 * Servlet implementation class JobPost
 */
@WebServlet("/JobPost.do")
public class JobPost extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public JobPost() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Job job = new Job();
		job.setJobcode(request.getParameter("jobcode"));
		job.setTitle(request.getParameter("title"));
		job.setOwner((request.getSession()).getAttribute("username").toString());
		job.setIndustry(request.getParameter("industry"));
		job.setCategory(request.getParameter("category"));
		job.setSubCategory(request.getParameter("subCategory"));
		job.setRole(request.getParameter("role"));
		job.setDescription(request.getParameter("description"));
		if(job.createJob(job)){
			response.sendRedirect("home.jsp");
		}else
			response.sendRedirect("error.jsp");
		
		// TODO Auto-generated method stub
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}

}
