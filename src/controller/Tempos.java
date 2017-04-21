package controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Tempos
 */
@WebServlet({"/Tempos"})
public class Tempos extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Tempos() {
        super();
        // TODO Auto-generated constructor stub
        
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
		
		System.out.println(request.getParameter("tempo1")+":"+request.getParameter("tempo2")+":"+request.getParameter("tempo3")+":"
				+request.getParameter("tempo4"));
		
		//TODO: Ordenar tempos
		request.setAttribute("Vencedor",request.getParameter("tempo1"));
		request.setAttribute("Segundo",request.getParameter("tempo2"));
		request.setAttribute("Terceiro",request.getParameter("tempo3"));
		request.setAttribute("Quarto",request.getParameter("tempo4"));
		
		request.getRequestDispatcher("Lista.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
