
package Servicios;


public class Materias {
      private int idMateria;
    private String nombre;
    private int año;

    public Materias(int idMateria, String nombre, int año) {
        this.idMateria = idMateria;
        this.nombre = nombre;
        this.año = año;
    }

    public int getIdMateria() {
        return idMateria;
    }

    public void setIdMateria(int idMateria) {
        this.idMateria = idMateria;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getAño() {
        return año;
    }

    public void setAño(int año) {
        this.año = año;
    }

//    @Override
//    public String toString() {
//        return nombre + ("año" + año );
//    }

    @Override
    public String toString() {
        return nombre;
    }
    
    
    
    
}
