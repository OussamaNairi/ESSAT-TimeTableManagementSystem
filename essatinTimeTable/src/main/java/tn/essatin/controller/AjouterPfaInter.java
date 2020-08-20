package tn.essatin.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import tn.essatin.dao.DepartementDaoImp;
import tn.essatin.dao.EnseignantDaoImp;
import tn.essatin.dao.IDepartementDao;
import tn.essatin.dao.IEnseignantDao;
import tn.essatin.model.Departement;
import tn.essatin.model.Enseignant;

/**
 * Servlet implementation class AjouterPfaInter
 */
@WebServlet("/AjouterPfaInter")
public class AjouterPfaInter extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AjouterPfaInter() {
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
		IDepartementDao dao1=new DepartementDaoImp();
		List<Departement> d=dao1.getAllDepartements();
		request.setAttribute("d", d);
		request.getRequestDispatcher("ajouterPfa.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
