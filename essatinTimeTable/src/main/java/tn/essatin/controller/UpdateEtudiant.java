package tn.essatin.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


import tn.essatin.dao.EtudiantDaoImp;
import tn.essatin.dao.IEtudiantDao;
import tn.essatin.dao.IIdentificateurDao;
import tn.essatin.dao.INationaliteDao;
import tn.essatin.dao.IdentificateurDaoImp;
import tn.essatin.dao.NationaliteDaoImp;
import tn.essatin.model.Etudiant;
import tn.essatin.model.Identificateur;
import tn.essatin.model.Nationalite;

/**
 * Servlet implementation class UpdateEtudiant
 */
@WebServlet("/UpdateEtudiant")
public class UpdateEtudiant extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public UpdateEtudiant() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int id=Integer.parseInt(request.getParameter("id"));
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
        String description=request.getParameter("description");
        IEtudiantDao dao=new EtudiantDaoImp();
		INationaliteDao dao1=new NationaliteDaoImp();
		IIdentificateurDao dao2=new IdentificateurDaoImp();
		Nationalite na=dao1.getNationalite(nationalite);
		Identificateur iden=dao2.getIdentificateur(identificateur);
		dao.updateEtudiant(new Etudiant(id,nom, prenom, mail, adresse, tel, dateDeNaissance, lieuDeNaissance, iden, numeroIdentificateur, sexe,na,description));
		request.getRequestDispatcher("AfficheEtudiant").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
