/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ws.services;

import Modelo.Alumno;
import Modelo.AlumnoDao;
import java.util.List;
import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;

/**
 *
 * @author capur
 */
@WebService(serviceName = "Servicios")
public class Servicios {

    AlumnoDao dao = new AlumnoDao();
    /**
     * Web service operation
     */
    @WebMethod(operationName = "lista")
    public List<Alumno> lista() {
        List datos= dao.alumno();
        return datos;
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "Agregar")
    public String Agregar(@WebParam(name = "nombre") String nombre, @WebParam(name = "apellido") String apellido, @WebParam(name = "ciudad") String ciudad, @WebParam(name = "cargo") String cargo, @WebParam(name = "estado") String estado) {
        String datos= dao.add(nombre, apellido, ciudad, cargo, estado);
        return datos;
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "ListarID")
    public Alumno ListarID(@WebParam(name = "id") int id) {
       Alumno al=dao.listarID(id);
        return al;
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "editar")
    public String editar(@WebParam(name = "nombre") String nombre, @WebParam(name = "apellido") String apellido, @WebParam(name = "ciudad") String ciudad, @WebParam(name = "cargo") String cargo, @WebParam(name = "estado") String estado, @WebParam(name = "id") int id) {
        String datos= dao.editar(nombre, apellido, ciudad, cargo, estado, id);
        return datos;
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "eliminar")
    public Alumno eliminar(@WebParam(name = "id") int id) {
        //TODO write your implementation code here:
        Alumno alumno = dao.delete(id);
        return alumno;
    }
}
