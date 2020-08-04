package tn.essatin.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


import tn.essatin.dao.INiveauDao;
import tn.essatin.dao.ISemestreDao;
import tn.essatin.dao.ITypeMatiereDao;

import tn.essatin.dao.NiveauDaoImp;
import tn.essatin.dao.SemestreDaoImp;
import tn.essatin.dao.TypeMatiereDaoImp;

import tn.essatin.model.Niveau;
import tn.essatin.model.Semestre;
import tn.essatin.model.TypeMatiere;

/**
 * Servlet implementation class AjouterMatiereInter
 */
@WebServlet("/AjouterMatiereInter")
public class AjouterMatiereInter extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AjouterMatiereInter() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		ITypeMatiereDao dao=new TypeMatiereDaoImp();
		List<TypeMatiere> t=dao.getAllTypeMatieres();
		request.setAttribute("t", t);
		INiveauDao dao1=new NiveauDaoImp();
		List<Niveau> n=dao1.getAllNiveaus();
		request.setAttribute("n", n);
		ISemestreDao dao2=new SemestreDaoImp();
		List<Semestre> s=dao2.getAllSemestres();
		request.setAttribute("s", s);
		request.getRequestDispatcher("ajouterMatiere.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
