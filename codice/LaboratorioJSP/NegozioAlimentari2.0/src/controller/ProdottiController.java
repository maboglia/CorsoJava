package controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.Prodotto;

/**
 * Servlet implementation class ProdottiController
 */
@WebServlet("/ProdottiController")
public class ProdottiController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ProdottiController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String s = request.getParameter("codProdotto");
		Prodotto selezionato = null;
		for(Prodotto p : ProdottiJar.elencoProdotti){
			if (p.getCodice().equals(s))
				selezionato = p;
		}
		
		
		PrintWriter out = response.getWriter();
		response.setContentType("text/html");


		out.print(selezionato);
	}

}