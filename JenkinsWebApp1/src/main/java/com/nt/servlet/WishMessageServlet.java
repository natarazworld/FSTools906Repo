package com.nt.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/wish")
public class WishMessageServlet extends HttpServlet {

	   @Override
	public  void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		     //get PrintWriter object
		   PrintWriter pw=res.getWriter();
		   //set  response content type
		   res.setContentType("text/html");
		   //write the message
		   pw.println("<h1  style='color:orange;text-align:center'> Good Morning </h1>");
		   //add home hyperlink
		   pw.println("<br> <a href='index.html'>home </a>");
		   //close the stream
		   pw.close();
	   }
	   
	   @Override
	public void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		      doGet(req,res);
		}
	   
}
