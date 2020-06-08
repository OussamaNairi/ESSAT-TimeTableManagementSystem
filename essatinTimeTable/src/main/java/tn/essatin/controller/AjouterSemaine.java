package tn.essatin.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import tn.essatin.dao.ISemaineDao;
import tn.essatin.dao.SemaineDaoImp;
import tn.essatin.model.Semaine;

/**
 * Servlet implementation class AjouterSemaine
 */
@WebServlet("/AjouterSemaine")
public class AjouterSemaine extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AjouterSemaine() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
       String nom=request.getParameter("nom");
		
		ISemaineDao dao=new SemaineDaoImp();
		dao.addSemaine(new Semaine(nom));
		
		request.getRequestDispatcher("AfficheSemaine").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
