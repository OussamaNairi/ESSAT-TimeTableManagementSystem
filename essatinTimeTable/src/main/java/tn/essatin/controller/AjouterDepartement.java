package tn.essatin.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import tn.essatin.dao.DepartementDaoImp;
import tn.essatin.dao.IDepartementDao;

import tn.essatin.model.Departement;


/**
 * Servlet implementation class AjouterDepartement
 */
@WebServlet("/AjouterDepartement")
public class AjouterDepartement extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AjouterDepartement() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
     String nom=request.getParameter("nom");
     String description=request.getParameter("description");
     String chefDepartement=request.getParameter("chefDepartement");
		
		IDepartementDao dao=new DepartementDaoImp();
		dao.addDepartement(new Departement(nom,description,chefDepartement));
		
		request.getRequestDispatcher("AfficheDepartement").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
