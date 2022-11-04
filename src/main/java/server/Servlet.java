package server;

import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.ServletException;

import java.io.IOException;

@WebServlet("/server")
public class Servlet extends HttpServlet {

    public Servlet() {
        super();
    }

    /* Chamado ao receber requisições do tipo GET */
    protected void doGet(HttpServletRequest request, HttpServletResponse response) 
    throws ServletException, IOException {

        ajustarResponse(response);
        response.getWriter().write("Server GET");
    
    }
    
    /* Chamado ao receber requisições do tipo POST */
    protected void doPost(HttpServletRequest request, HttpServletResponse response) 
    throws ServletException, IOException{

        ajustarResponse(response);

        String nome = request.getParameter("nome");
        String cpf = request.getParameter("cpf");

        response.getWriter().write("Cadastro salvo! | " + "Nome: " + nome + " | CPF: " + cpf);

    }

    /**
     * Método chamado para ajustar o reponse com seu status code, seu tipo e seu enconding
     * @param response
     */
    public void ajustarResponse(HttpServletResponse response){

        response.setStatus(200);
        response.setContentType("text/plain");
        response.setCharacterEncoding("UTF-8");

    }
}
