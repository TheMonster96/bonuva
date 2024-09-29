package test;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class test extends HttpServlet{
	
	
	public void doPost(HttpServletRequest req, HttpServletResponse res) throws IOException
	{
		String libro=req.getParameter("Libro");
		String autore=req.getParameter("Autore");
		String collocazione=req.getParameter("Collocazione");
		
		PrintWriter out=res.getWriter();
		
		out.println(libro + "  " + autore + "  " + collocazione);
		
	}
}
