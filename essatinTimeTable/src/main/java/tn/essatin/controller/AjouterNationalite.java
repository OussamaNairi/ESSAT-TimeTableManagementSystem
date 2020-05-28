package tn.essatin.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


import tn.essatin.dao.INationaliteDao;
import tn.essatin.dao.NationaliteDaoImp;
import tn.essatin.model.Nationalite;

/**
 * Servlet implementation class AjouterNationalite
 */
@WebServlet("/AjouterNationalite")
public class AjouterNationalite extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AjouterNationalite() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String nom=request.getParameter("nom");
		
		INationaliteDao dao=new NationaliteDaoImp();
		dao.addNationalite(new Nationalite(nom));
		
		request.getRequestDispatcher("AfficheNationalite").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
