
package Servlets;

import Logica.Controladora;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet(name = "ServletLogin", urlPatterns = {"/ServletLogin"})
public class ServletLogin extends HttpServlet {

    
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        
    }

    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
        
       //traigo usuario y contraseña desde el login:
        String usuario= request.getParameter("email");
        String contra=request.getParameter("pass");
        //Variable para saber si es ok o no el usuario y contraseña:
        boolean estaOno = false;
        
        //Creo una instancia a la controladora para conectarme a la Logica:
        Controladora control = new Controladora();
        
        //Asigno a mi variable el resultado de la comprobacion del usu y la contraseña:
        estaOno=control.comprobarIngreso(usuario,contra);
        
        //comprobacion de si dejo ingresar o no:
        if(estaOno == true){
            
            //verificar que exista una sesion para que no nos salteen el Login:
            HttpSession miSession = request.getSession(true);
            miSession.setAttribute("usuario", usuario);
            response.sendRedirect ("Menu.jsp");
        }
        else{
            response.sendRedirect ("LoginError.jsp");
        }
    }

    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
