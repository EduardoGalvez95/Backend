
package Modelo;


public class Alumno {
     int id_Alumno;
     String nomnre_alumno,apellido_alumno,ciudad_alumno,cargo_alumno, estado_alumno;

    public Alumno() {
    }

    public Alumno(int id_Alumno, String nomnre_alumno, String ciudad_alumno, String apellido_alumno, String cargo_alumno, String estado_alumno) {
        this.id_Alumno = id_Alumno;
        this.nomnre_alumno = nomnre_alumno;
        this.ciudad_alumno = ciudad_alumno;
        this.apellido_alumno = apellido_alumno;
        this.cargo_alumno = cargo_alumno;
        this.estado_alumno = estado_alumno;
    }

    public int getId_Alumno() {
        return id_Alumno;
    }

    public void setId_Alumno(int id_Alumno) {
        this.id_Alumno = id_Alumno;
    }

    public String getNomnre_alumno() {
        return nomnre_alumno;
    }

    public void setNomnre_alumno(String nomnre_alumno) {
        this.nomnre_alumno = nomnre_alumno;
    }

    public String getCiudad_alumno() {
        return ciudad_alumno;
    }

    public void setCiudad_alumno(String ciudad_alumno) {
        this.ciudad_alumno = ciudad_alumno;
    }

    public String getApellido_alumno() {
        return apellido_alumno;
    }

    public void setApellido_alumno(String apellido_alumno) {
        this.apellido_alumno = apellido_alumno;
    }

    public String getCargo_alumno() {
        return cargo_alumno;
    }

    public void setCargo_alumno(String cargo_alumno) {
        this.cargo_alumno = cargo_alumno;
    }

    public String getEstado_alumno() {
        return estado_alumno;
    }

    public void setEstado_alumno(String estado_alumno) {
        this.estado_alumno = estado_alumno;
    }
     
     
     
     
}
