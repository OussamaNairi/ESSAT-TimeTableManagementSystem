package tn.essatin.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import tn.essatin.dao.IIdentificateurDao;
import tn.essatin.dao.INationaliteDao;
import tn.essatin.dao.IdentificateurDaoImp;
import tn.essatin.dao.NationaliteDaoImp;
import tn.essatin.model.Identificateur;
import tn.essatin.model.Nationalite;

/**
 * Servlet implementation class AjouterEnseignantInter
 */
@WebServlet("/AjouterEnseignantInter")
public class AjouterEnseignantInter extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AjouterEnseignantInter() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		INationaliteDao dao=new NationaliteDaoImp();
		List<Nationalite> na=dao.getAllNationalites();
		request.setAttribute("na", na);
		IIdentificateurDao dao1=new IdentificateurDaoImp();
		List<Identificateur> iden=dao1.getAllIdentificateurs();
		request.setAttribute("iden", iden);
		request.getRequestDispatcher("ajouterEnseignant.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
