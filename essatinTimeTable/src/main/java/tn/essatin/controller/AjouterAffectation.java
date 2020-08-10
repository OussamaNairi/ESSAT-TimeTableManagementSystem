package tn.essatin.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import tn.essatin.dao.AffectationDaoImp;
import tn.essatin.dao.ChargeHoraireDaoImp;
import tn.essatin.dao.EnseignantDaoImp;
import tn.essatin.dao.IAffectationDao;
import tn.essatin.dao.IChargeHoraireDao;
import tn.essatin.dao.IEnseignantDao;

import tn.essatin.model.Affectation;
import tn.essatin.model.ChargeHoraire;
import tn.essatin.model.Enseignant;


/**
 * Servlet implementation class AjouterAffectation
 */
@WebServlet("/AjouterAffectation")
public class AjouterAffectation extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AjouterAffectation() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		 
	        int chargeHoraire=Integer.parseInt(request.getParameter("chargeHoraire"));
	        int enseignant=Integer.parseInt(request.getParameter("enseignant"));
	        IAffectationDao dao=new AffectationDaoImp();
			IEnseignantDao dao1=new EnseignantDaoImp();
			IChargeHoraireDao dao2=new ChargeHoraireDaoImp();
			Enseignant en=dao1.getEnseignant(enseignant);
			ChargeHoraire ch=dao2.getChargeHoraire(chargeHoraire);
			dao.addAffectation(new Affectation(en,ch));
			
			request.getRequestDispatcher("AfficheAffectation").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
