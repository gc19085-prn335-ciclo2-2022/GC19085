/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ues.occ.edu.sv.ingenieria.prn335.guia01_2022.boundary;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import ues.occ.edu.sv.ingenieria.prn335.guia01_2022.control.BolsaTrabajo;
import ues.occ.edu.sv.ingenieria.prn335.guia01_2022.entity.Persona;

/**
 *
 * @author Kevin
 */
@WebServlet(name = "BolsaTrabajoServlet", urlPatterns = {"/BolsaTrabajoServlet"})
public class BolsaTrabajoServlet extends HttpServlet {
    
    
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
       
    
        response.setContentType("text/html; charset=UTF-8"); 
        
        PrintWriter out = response.getWriter();
        String id_persona = request.getParameter("id_persona");
        int id = Integer.parseInt(id_persona);
        String nombres = request.getParameter("nombres");
        String apellidos = request.getParameter("apellidos");
        String genero = request.getParameter("genero");
        String fecha_nacimiento = request.getParameter("fecha_nacimiento");
        String CapacidadesEspeciales = request.getParameter("CapacidadesEspeciales");
        String direccion = request.getParameter("direccion");
        String EstadoCivil = request.getParameter("EstadoCivil");  
        String jubilado = request.getParameter("jubilado");
        boolean esjubilado = true ;
        if ("si".equals(jubilado)) {
            esjubilado = true;
        } else if ("no".equals(jubilado)) {
            esjubilado = false;
        }
        String conocido_por = request.getParameter("conocido_por");

        Persona persona1 = new Persona(1, "jose", "osorio", "mi casa", "M", "1999-09-06", true, "chepe", "No", "soltero/a");
        Persona persona2 = new Persona(2, "jose", "clemente", "su casa", "M", "2000-01-03", true, "armando", "No", "soltero/a");
        Persona persona3 = new Persona(3, "carlos", "roberto", "candelaria", "M", "2001-09-04", true, "carlitos", "No", "soltero/a");
        Persona persona4 = new Persona(4, "cristiano", "ronaldo", "soyapango", "M", "1985-02-05", true, "el bicho", "No", "casado/a");
        Persona persona5 = new Persona(5, "leonel", "messi", "apopa", "M", "1987-05-24", true, "la pulga", "No", "casado/a");
        Persona persona6 = new Persona(id, nombres, apellidos, direccion, genero, fecha_nacimiento, esjubilado , conocido_por,  CapacidadesEspeciales, EstadoCivil);
       
        try {
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet BolsaTrabajoServlet</title>");
            out.println("</head>");
            out.println("<table  id=\"datos\" border=\"1\" bordercolor=\"black\" align=\"center\">");
            out.println("<tr>");
            out.println("<th>id persona</th>");
            out.println("<th>Nombre</th>"); 
            out.println("<th>Apellido</th>");
            out.println("<th>Dirrecion</th>");
            out.println("<th>Genero</th>");
            out.println("<th>Fecha Nacimiento</th>");
            out.println("<th>Jubilado</th>");
            out.println("<th>Conocido Por</th>");
            out.println("<th>Capacidades especiales</th>");
            out.println("<th>Estado Civil</th>");
            out.println("</tr>");

            out.println("<tr>");
            out.println("<td>" + persona1.getId_persona() + "</td>");
            out.println("<td>" + persona1.getNombres() + "</td>");
            out.println("<td>" + persona1.getApellidos() + "</td>");
            out.println("<td>" + persona1.getDireccion() + "</td>");
            out.println("<td>" + persona1.getGenero() + "</td>");
            out.println("<td>" + persona1.getFecha_nacimiento() + "</td>");
            out.println("<td>" + persona1.isJubilado() + "</td>");
            out.println("<td>" + persona1.getConocido_por() + "</td>");
            out.println("<td>" + persona1.getCapacidadesEspeciales() + "</td>");
            out.println("<td>" + persona1.getEstadoCivil() + "</td>");
            out.println("</tr>");

            out.println("<tr>");
            out.println("<td>" + persona2.getId_persona() + "</td>");
            out.println("<td>" + persona2.getNombres() + "</td>");
            out.println("<td>" + persona2.getApellidos() + "</td>");
            out.println("<td>" + persona2.getDireccion() + "</td>");
            out.println("<td>" + persona2.getGenero() + "</td>");
            out.println("<td>" + persona2.getFecha_nacimiento() + "</td>");
            out.println("<td>" + persona2.isJubilado() + "</td>");
            out.println("<td>" + persona2.getConocido_por() + "</td>");
            out.println("<td>" + persona2.getCapacidadesEspeciales() + "</td>");
            out.println("<td>" + persona2.getEstadoCivil() + "</td>");
            out.println("</tr>");
          
            out.println("<tr>");
            out.println("<td>" + persona3.getId_persona() + "</td>");
            out.println("<td>" + persona3.getNombres() + "</td>");
            out.println("<td>" + persona3.getApellidos() + "</td>");
            out.println("<td>" + persona3.getDireccion() + "</td>");
            out.println("<td>" + persona3.getGenero() + "</td>");
            out.println("<td>" + persona3.getFecha_nacimiento() + "</td>");
            out.println("<td>" + persona3.isJubilado() + "</td>");
            out.println("<td>" + persona3.getConocido_por() + "</td>");
            out.println("<td>" + persona3.getCapacidadesEspeciales() + "</td>");
            out.println("<td>" + persona3.getEstadoCivil() + "</td>");
            out.println("</tr>");

            out.println("<tr>");
            out.println("<td>" + persona4.getId_persona() + "</td>");
            out.println("<td>" + persona4.getNombres() + "</td>");
            out.println("<td>" + persona4.getApellidos() + "</td>");
            out.println("<td>" + persona4.getDireccion() + "</td>");
            out.println("<td>" + persona4.getGenero() + "</td>");
            out.println("<td>" + persona4.getFecha_nacimiento() + "</td>");
            out.println("<td>" + persona4.isJubilado() + "</td>");
            out.println("<td>" + persona4.getConocido_por() + "</td>");
            out.println("<td>" + persona4.getCapacidadesEspeciales() + "</td>");
            out.println("<td>" + persona4.getEstadoCivil() + "</td>");
            out.println("</tr>");

            out.println("<tr>");
            out.println("<td>" + persona5.getId_persona() + "</td>");
            out.println("<td>" + persona5.getNombres() + "</td>");
            out.println("<td>" + persona5.getApellidos() + "</td>");
            out.println("<td>" + persona5.getDireccion() + "</td>");
            out.println("<td>" + persona5.getGenero() + "</td>");
            out.println("<td>" + persona5.getFecha_nacimiento() + "</td>");
            out.println("<td>" + persona5.isJubilado() + "</td>");
            out.println("<td>" + persona5.getConocido_por() + "</td>");
            out.println("<td>" + persona5.getCapacidadesEspeciales() + "</td>");
            out.println("<td>" + persona5.getEstadoCivil() + "</td>");
            out.println("</tr>");
            
            out.println("<tr>");
            out.println("<td>" + persona6.getId_persona() + "</td>");
            out.println("<td>" + persona6.getNombres() + "</td>");
            out.println("<td>" + persona6.getApellidos() + "</td>");
            out.println("<td>" + persona6.getDireccion() + "</td>");
            out.println("<td>" + persona6.getGenero() + "</td>");
            out.println("<td>" + persona6.getFecha_nacimiento() + "</td>");
            out.println("<td>" + persona6.isJubilado() + "</td>");
            out.println("<td>" + persona6.getConocido_por() + "</td>");
            out.println("<td>" + persona6.getCapacidadesEspeciales() + "</td>");
            out.println("<td>" + persona6.getEstadoCivil() + "</td>");
            out.println("</tr>");
           
            out.println("<form action=\"index.html\" method=\"get\">");
            out.println("<input type=\"submit\" value=\"Regresar\" align=\"center\"><br>");
            out.println("</form>");

            out.println("</tbody>");
            out.println("</table>");

            out.println("</body>");
            out.println("</html>");
        } finally {
            out.close();
        }
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);

    }
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }
    
    @Override
    public String getServletInfo() {
        return "Test";
    }

}