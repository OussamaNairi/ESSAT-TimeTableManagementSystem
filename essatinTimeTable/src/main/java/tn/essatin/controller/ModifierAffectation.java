package tn.essatin.controller;

import java.io.IOException;
import java.util.List;

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
 * Servlet implementation class ModifierAffectation
 */
@WebServlet("/ModifierAffectation")
public class ModifierAffectation extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ModifierAffectation() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int id=Integer.parseInt(request.getParameter("id"));
		IAffectationDao dao=new AffectationDaoImp();
		Affectation af=dao.getAffectation(id);
		request.setAttribute("af", af);
		IEnseignantDao dao2=new EnseignantDaoImp();
		List<Enseignant> en=dao2.getAllEnseignants();
		request.setAttribute("en", en);
		IChargeHoraireDao dao1=new ChargeHoraireDaoImp();
		List<ChargeHoraire> ch=dao1.getAllChargeHoraires();
		request.setAttribute("ch", ch);
		request.getRequestDispatcher("modifierAffectation.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
