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
 * Servlet implementation class UpdateDepartement
 */
@WebServlet("/UpdateDepartement")
public class UpdateDepartement extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public UpdateDepartement() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int id=Integer.parseInt(request.getParameter("id"));
		String nom=request.getParameter("nom");
		String description=request.getParameter("description");
		String chefDepartement=request.getParameter("chefDepartement");
	
		
		IDepartementDao dao=new DepartementDaoImp();
		dao.updateDepartement(new Departement(id,nom,description,chefDepartement));
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
