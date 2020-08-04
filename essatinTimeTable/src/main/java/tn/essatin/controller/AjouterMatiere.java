package tn.essatin.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import tn.essatin.dao.IMatiereDao;

import tn.essatin.dao.INiveauDao;
import tn.essatin.dao.ISemestreDao;
import tn.essatin.dao.ITypeMatiereDao;

import tn.essatin.dao.MatiereDaoImp;

import tn.essatin.dao.NiveauDaoImp;
import tn.essatin.dao.SemestreDaoImp;
import tn.essatin.dao.TypeMatiereDaoImp;

import tn.essatin.model.Matiere;

import tn.essatin.model.Niveau;
import tn.essatin.model.Semestre;
import tn.essatin.model.TypeMatiere;

/**
 * Servlet implementation class AjouterMatiere
 */
@WebServlet("/AjouterMatiere")
public class AjouterMatiere extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AjouterMatiere() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	    String nom=request.getParameter("nom");
        int coefficient=Integer.parseInt(request.getParameter("coefficient"));
        int volumeHoraire=Integer.parseInt(request.getParameter("volumeHoraire"));
        int typeMatiere=Integer.parseInt(request.getParameter("typeMatiere"));
        int niveau=Integer.parseInt(request.getParameter("niveau"));
        int semestre=Integer.parseInt(request.getParameter("semestre"));
       	IMatiereDao dao=new MatiereDaoImp();
		ITypeMatiereDao dao1=new TypeMatiereDaoImp();
		TypeMatiere t=dao1.getTypeMatiere(typeMatiere);
		INiveauDao dao2=new NiveauDaoImp();
		Niveau n=dao2.getNiveau(niveau);
		ISemestreDao dao3=new SemestreDaoImp();
		Semestre s=dao3.getSemestre(semestre);
		
		
		dao.addMatiere(new Matiere(nom, coefficient, volumeHoraire,t,n,s));
		
		request.getRequestDispatcher("AfficheMatiere").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
