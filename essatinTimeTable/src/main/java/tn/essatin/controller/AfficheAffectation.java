package tn.essatin.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import tn.essatin.dao.AffectationDaoImp;

import tn.essatin.dao.IAffectationDao;

import tn.essatin.model.Affectation;


/**
 * Servlet implementation class AfficheAffectation
 */
@WebServlet("/AfficheAffectation")
public class AfficheAffectation extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AfficheAffectation() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		IAffectationDao dao=new AffectationDaoImp();
		List<Affectation> liste=dao.getAllAffectations();
		request.setAttribute("liste", liste);
		request.getRequestDispatcher("affectation.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
