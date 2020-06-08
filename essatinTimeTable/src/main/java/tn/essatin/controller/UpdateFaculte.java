package tn.essatin.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import tn.essatin.dao.FaculteDaoImp;
import tn.essatin.dao.IFaculteDao;
import tn.essatin.model.Faculte;


/**
 * Servlet implementation class UpdateFaculte
 */
@WebServlet("/UpdateFaculte")
public class UpdateFaculte extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public UpdateFaculte() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int id=Integer.parseInt(request.getParameter("id"));
		String nom=request.getParameter("nom");
		String adresse=request.getParameter("adresse");
		int nombreEffectif=Integer.parseInt(request.getParameter("nombreEffectif"));
	
		
		IFaculteDao dao=new FaculteDaoImp();
		dao.updateFaculte(new Faculte(id,nom,adresse,nombreEffectif));
		request.getRequestDispatcher("AfficheFaculte").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
