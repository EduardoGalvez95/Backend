
package Modelo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;


public class AlumnoDao implements CRUD{
    PreparedStatement ps;
    ResultSet rs;
    Connection con;
    Conexion conex = new Conexion();
    int res;
    String mensaje;
      Alumno student= new Alumno();
      
    @Override
    public List alumno() {
       List<Alumno> alumno = new ArrayList<>();
       String sql= "select * from alumno" ;
       try {
            con=conex.getConnection();
            ps=con.prepareStatement(sql);
            rs=ps.executeQuery();
            while(rs.next()){
                Alumno student= new Alumno();
                student.setId_Alumno(rs.getInt("id"));
                student.setNomnre_alumno(rs.getString("nombre"));
                student.setApellido_alumno(rs.getString("apellido"));
                student.setCiudad_alumno(rs.getString("ciudad"));
                student.setCargo_alumno(rs.getString("cargo"));
                student.setEstado_alumno(rs.getString("estado"));
                alumno.add(student);
            }
        } catch (Exception e) {
        }
       return alumno;
    }

    @Override
    public Alumno listarID(int codigo) {
        String sql= "select * from alumno where id="+codigo ;
       
       try {
            con=conex.getConnection();
            ps=con.prepareStatement(sql);
            rs=ps.executeQuery();
            while(rs.next()){
               
                student.setId_Alumno(rs.getInt("id"));
                student.setNomnre_alumno(rs.getString("nombre"));
                student.setApellido_alumno(rs.getString("apellido"));
                student.setCiudad_alumno(rs.getString("ciudad"));
                student.setCargo_alumno(rs.getString("cargo"));
                student.setEstado_alumno(rs.getString("estado"));
               
            }
        } catch (Exception e) {
        }
       return student ;
    }

    @Override
    public String add(String nombres, String apellidos, String ciudad, String cargo, String estado) {
        String sql= "insert into alumno (nombre, apellido, ciudad, cargo, estado) values(?,?,?,?,?)";
        try {
            con=conex.getConnection();
            ps=con.prepareStatement(sql);
            ps.setString(1, nombres);
            ps.setString(2, apellidos);
            ps.setString(3, ciudad);
            ps.setString(4, cargo);
            ps.setString(5, estado);
            res= ps.executeUpdate();
            if(res==1){
                mensaje="Alumno Agregado!!!";
            }
            else{
                mensaje="ERROR!!!";
            }
        } catch (Exception e) {
        }
        return mensaje;
    }

    @Override
    public Alumno delete(int id) {
        String sql= "delete from alumno where id="+id;
        try {
              con=conex.getConnection();
            ps=con.prepareStatement(sql);
            ps.executeUpdate();
        } catch (Exception e) {
        }
        return student;
    }

    @Override
    public String editar(String nombres, String apellidos, String ciudad, String cargo, String estado, int id) {
        String sql= "update alumno set nombre=?, apellido=?,ciudad=?,cargo=?,estado=? where id="+id;
        try {
             con=conex.getConnection();
            ps=con.prepareStatement(sql);
              ps.setString(1, nombres);
            ps.setString(2, apellidos);
            ps.setString(3, ciudad);
            ps.setString(4, cargo);
            ps.setString(5, estado);
            res= ps.executeUpdate();
            if(res==1){
                mensaje="Alumno Actualizado!!!";
            }
            else{
                mensaje="ERROR!!!";
            }
        } catch (Exception e) {
        }
        return mensaje;
    }
    
}
