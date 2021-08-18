
package Modelo;

import java.util.List;


public interface CRUD {
 public List alumno();
 public Alumno listarID(int codigo);
 public String add(String nombres, String apellidos, String ciudad, String cargo, String estado);
 public String editar(String nombres, String apellidos, String ciudad, String cargo, String estado,int id);
 public Alumno delete(int id);
}
