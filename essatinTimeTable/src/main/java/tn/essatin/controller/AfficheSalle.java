package tn.essatin.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


import tn.essatin.dao.ISalleDao;
import tn.essatin.dao.SalleDaoImp;

import tn.essatin.model.Salle;

/**
 * Servlet implementation class AfficheSalle
 */
@WebServlet("/AfficheSalle")
public class AfficheSalle extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AfficheSalle() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		ISalleDao dao=new SalleDaoImp();
		List<Salle> liste=dao.getAllSalles();
		request.setAttribute("liste", liste);
		request.getRequestDispatcher("salle.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
