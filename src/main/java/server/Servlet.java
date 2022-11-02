package server;

import java.io.IOException;

import jakarta.servlet.*;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.*;;

@WebServlet("/server")
public class Servlet extends HttpServlet {

    public Servlet() {
        super();
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) 
    throws ServletException, IOException {

        response.setContentType("text/plain");
        
        response.getWriter().write("Server GET");
    
    }
    
    protected void doPost(HttpServletRequest request, HttpServletResponse response) 
    throws ServletException, IOException{

        response.setContentType("text/plain");

        String nome = request.getParameter("nome");
        String cpf = request.getParameter("cpf");

        response.getWriter().write("Cadastro salvo! | " + "Nome: " + nome + " | CPF: " + cpf);

    }
}
