package tn.essatin.controller;

import java.io.IOException;
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
 * Servlet implementation class AjouterEnseignant
 */
@WebServlet("/AjouterEnseignant")
public class AjouterEnseignant extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AjouterEnseignant() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
         String nom=request.getParameter("nom");
         String prenom=request.getParameter("prenom");
         String mail=request.getParameter("mail");
         String adresse=request.getParameter("adresse");
         String tel=request.getParameter("tel");
         String dateDeNaissance=request.getParameter("dateDeNaissance");
         String lieuDeNaissance=request.getParameter("lieuDeNaissance");
         int identificateur=Integer.parseInt(request.getParameter("identificateur"));
         String numeroIdentificateur=request.getParameter("numeroIdentificateur");
         String sexe=request.getParameter("sexe");
         int nationalite=Integer.parseInt(request.getParameter("nationalite"));
         String cnss=request.getParameter("cnss");
         String cnrps=request.getParameter("cnrps");
         String dateEntree=request.getParameter("dateEntree");
         String observation=request.getParameter("observation");
         String situationM=request.getParameter("situationM");
         int nombreEnfants=Integer.parseInt(request.getParameter("nombreEnfants"));
         String diplome=request.getParameter("diplome");
         String ribIban=request.getParameter("ribIban");
         String image=request.getParameter("image");
         String poste=request.getParameter("poste");
         String etablissementOrigine=request.getParameter("etablissementOrigine");
		
		IEnseignantDao dao=new EnseignantDaoImp();
		INationaliteDao dao1=new NationaliteDaoImp();
		IIdentificateurDao dao2=new IdentificateurDaoImp();
		Nationalite na=dao1.getNationalite(nationalite);
		Identificateur iden=dao2.getIdentificateur(identificateur);
		dao.addEnseignant(new Enseignant(nom, prenom, mail, adresse, tel, dateDeNaissance, lieuDeNaissance, iden, numeroIdentificateur, sexe,na,cnss,cnrps,dateEntree,observation, situationM,nombreEnfants,diplome,ribIban,image,poste,etablissementOrigine));
		
		request.getRequestDispatcher("AfficheEnseignant").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
