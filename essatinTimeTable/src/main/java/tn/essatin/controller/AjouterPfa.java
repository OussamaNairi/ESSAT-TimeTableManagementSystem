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
import tn.essatin.dao.IPfaDao;
import tn.essatin.dao.PfaDaoImp;
import tn.essatin.model.Departement;
import tn.essatin.model.Enseignant;
import tn.essatin.model.Pfa;


/**
 * Servlet implementation class AjouterPfa
 */
@WebServlet("/AjouterPfa")
public class AjouterPfa extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AjouterPfa() {
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
         int enseignant=Integer.parseInt(request.getParameter("enseignant"));
         int departement=Integer.parseInt(request.getParameter("departement"));
             
		IPfaDao dao=new PfaDaoImp();
		IEnseignantDao dao1=new EnseignantDaoImp();
		IDepartementDao dao2=new DepartementDaoImp();
		Enseignant en=dao1.getEnseignant(enseignant);
		Departement d=dao2.getDepartement(departement);
		dao.addPfa(new Pfa(titre, description,motCle, technologie, en,d));
		
		request.getRequestDispatcher("AffichePfa").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
