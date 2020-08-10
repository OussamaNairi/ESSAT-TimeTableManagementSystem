package tn.essatin.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import tn.essatin.dao.ChargeHoraireDaoImp;
import tn.essatin.dao.EnseignantDaoImp;
import tn.essatin.dao.IChargeHoraireDao;
import tn.essatin.dao.IEnseignantDao;

import tn.essatin.model.ChargeHoraire;
import tn.essatin.model.Enseignant;


/**
 * Servlet implementation class AjouterAffectationInter
 */
@WebServlet("/AjouterAffectationInter")
public class AjouterAffectationInter extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AjouterAffectationInter() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		IEnseignantDao dao=new EnseignantDaoImp();
		List<Enseignant> en=dao.getAllEnseignants();
		request.setAttribute("en", en);
		IChargeHoraireDao dao1=new ChargeHoraireDaoImp();
		List<ChargeHoraire> ch=dao1.getAllChargeHoraires();
		request.setAttribute("ch", ch);
		request.getRequestDispatcher("ajouterAffectation.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
