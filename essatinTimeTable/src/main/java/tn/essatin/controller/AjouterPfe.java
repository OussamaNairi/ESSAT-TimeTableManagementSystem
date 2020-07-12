package tn.essatin.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import tn.essatin.dao.DepartementDaoImp;
import tn.essatin.dao.EnseignantDaoImp;
import tn.essatin.dao.IDepartementDao;
import tn.essatin.dao.IEnseignantDao;

import tn.essatin.dao.IPfeDao;

import tn.essatin.dao.PfeDaoImp;
import tn.essatin.model.Departement;
import tn.essatin.model.Enseignant;

import tn.essatin.model.Pfe;

/**
 * Servlet implementation class AjouterPfe
 */
@WebServlet("/AjouterPfe")
public class AjouterPfe extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AjouterPfe() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		 String titre=request.getParameter("titre");
         String description=request.getParameter("description");
         String motCle=request.getParameter("motCle");
         String technologie=request.getParameter("technologie");
         String dateDebut=request.getParameter("dateDebut");
         String dateFin=request.getParameter("dateFin");
         Boolean projetExterne=Boolean.parseBoolean(request.getParameter("projetExterne"));
         String nomSociete=request.getParameter("nomSociete");
         int enseignant=Integer.parseInt(request.getParameter("enseignant"));
         int departement=Integer.parseInt(request.getParameter("departement"));
             
		IPfeDao dao=new PfeDaoImp();
		IEnseignantDao dao1=new EnseignantDaoImp();
		IDepartementDao dao2=new DepartementDaoImp();
		Enseignant en=dao1.getEnseignant(enseignant);
		Departement d=dao2.getDepartement(departement);
		dao.addPfe(new Pfe(titre, description,motCle, technologie, dateDebut, dateFin, projetExterne,nomSociete, en,d));
		
		request.getRequestDispatcher("AffichePfe").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
