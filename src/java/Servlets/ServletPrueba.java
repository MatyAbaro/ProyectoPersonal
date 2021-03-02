
package Servlets;

import Logica.Controladora;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "ServletPrueba", urlPatterns = {"/ServletPrueba"})
public class ServletPrueba extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        
    }

    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
        String cod_libro = request.getParameter("cod_libro");
        String titulo = request.getParameter("titulo");
        String autor = request.getParameter("autor");   
        String genero = request.getParameter("genero");
        String estado = request.getParameter("estado");
        
        request.getSession().setAttribute("cod_libro", cod_libro);
        request.getSession().setAttribute("titulo", titulo);
        request.getSession().setAttribute("autor", autor);
        request.getSession().setAttribute("genero", genero);
        request.getSession().setAttribute("estado", estado);
        
        response.sendRedirect("AltaCorrecta.jsp");
        
        Controladora control = new Controladora();
        control.crearLibro(cod_libro,titulo,autor,genero,estado);
        
        
    }

    @Override
    public String getServletInfo() {
        return "Short description";
    }

}
