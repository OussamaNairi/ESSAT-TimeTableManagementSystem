package tn.essatin.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import tn.essatin.dao.EnseignantDaoImp;
import tn.essatin.dao.IEnseignantDao;
import tn.essatin.dao.IIdentificateurDao;
import tn.essatin.dao.INationaliteDao;
import tn.essatin.dao.IdentificateurDaoImp;
import tn.essatin.dao.NationaliteDaoImp;
import tn.essatin.model.Enseignant;
import tn.essatin.model.Identificateur;
import tn.essatin.model.Nationalite;


/**
 * Servlet implementation class ModifierEnseignant
 */
@WebServlet("/ModifierEnseignant")
public class ModifierEnseignant extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ModifierEnseignant() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int id=Integer.parseInt(request.getParameter("id"));
		IEnseignantDao dao=new EnseignantDaoImp();
		Enseignant en=dao.getEnseignant(id);
	    request.setAttribute("en", en);
	    INationaliteDao dao1=new NationaliteDaoImp();
		List<Nationalite> nat=dao1.getAllNationalites();
		request.setAttribute("nat", nat);
		IIdentificateurDao dao2=new IdentificateurDaoImp();
		List<Identificateur> ident=dao2.getAllIdentificateurs();
		request.setAttribute("ident", ident);
	    request.getRequestDispatcher("modifierEnseignant.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
