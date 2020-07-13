package tn.essatin.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import tn.essatin.dao.IMatiereDao;
import tn.essatin.dao.MatiereDaoImp;

import tn.essatin.model.Matiere;

/**
 * Servlet implementation class AfficheMatiere
 */
@WebServlet("/AfficheMatiere")
public class AfficheMatiere extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AfficheMatiere() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		IMatiereDao dao=new MatiereDaoImp();
		List<Matiere> liste=dao.getAllMatieres();
		request.setAttribute("liste", liste);
		request.getRequestDispatcher("matiere.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
