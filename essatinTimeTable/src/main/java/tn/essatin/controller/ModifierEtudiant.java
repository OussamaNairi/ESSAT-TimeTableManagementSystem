package tn.essatin.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import tn.essatin.dao.EtudiantDaoImp;
import tn.essatin.dao.IEtudiantDao;
import tn.essatin.model.Etudiant;


/**
 * Servlet implementation class ModifierEtudiant
 */
@WebServlet("/ModifierEtudiant")
public class ModifierEtudiant extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ModifierEtudiant() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int id=Integer.parseInt(request.getParameter("id"));
		IEtudiantDao dao=new EtudiantDaoImp();
		Etudiant et=dao.getEtudiant(id);
	    request.setAttribute("et", et);
	    request.getRequestDispatcher("modifierEtudiant.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
