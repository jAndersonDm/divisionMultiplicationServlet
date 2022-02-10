package controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.divAndMult;

/**
 * Servlet implementation class getDivServlet
 */
@WebServlet("/getDivServlet")
public class getDivServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public getDivServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String num1 = request.getParameter("dNumOne");
		String num2 = request.getParameter("dNumTwo");
		divAndMult div = new divAndMult();
		String output = div.divideString(num1, num2);
		
		request.setAttribute("theOutput", output);
		request.setAttribute("number1", num1);
		request.setAttribute("number2", num2);
		getServletContext().getRequestDispatcher("/resultDiv.jsp").forward(request, response);
		
		//PrintWriter writer = response.getWriter();
		//writer.println(num1.toString() + " and " + num2.toString() + " divided = " + output);
		//writer.close();
	}

}
