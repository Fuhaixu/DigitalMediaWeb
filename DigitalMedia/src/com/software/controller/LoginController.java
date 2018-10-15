package com.software.controller;

import java.io.IOException;
import java.io.UnsupportedEncodingException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.software.entity.User;
import com.software.serviceImp.UserServicesImp;

@WebServlet("/login")
public class LoginController extends HttpServlet{
	
	private UserServicesImp usi=new UserServicesImp();
	public void doPost(HttpServletRequest req,
			HttpServletResponse res) {
		long id=Integer.parseInt(req.getParameter("id"));
		String pwd=req.getParameter("pwd");
		System.out.println(id);
		System.out.println(pwd);
		User user=usi.userLogin(id);
		if(user.getPassword().equals(pwd)) {
			try {
				req.getRequestDispatcher("index.jsp").forward(req, res);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	public void doGet(HttpServletRequest req,
			HttpServletResponse res){
		doPost(req,res);
	}
}
