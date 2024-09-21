package Servicios;

import java.util.HashSet;
import javax.swing.JOptionPane;

public class Alumno {

    private int legajo;
    private String apellido;
    private String nombre;
    HashSet<Materias> materias = new HashSet<>();

    public Alumno(int legajo, String apellido, String nombre) {
        this.legajo = legajo;
        this.apellido = apellido;
        this.nombre = nombre;
    }

    public int getLegajo() {
        return legajo;
    }

    public void setLegajo(int legajo) {
        this.legajo = legajo;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void agregarMateria(Materias m) {
        if (materias.add(m) == true) {
            JOptionPane.showMessageDialog(null, "El alumno se ha inscripto");
        }
    }

    public int cantidadMaterias() {
        return materias.size();
    }

    @Override
    public String toString() {
        return nombre + " " + apellido;
    }

    public boolean cantidadMateria(Materias materia) {
        if (materias.size() < 3) {
            return materias.add(materia);
        }
        return false;
    }

    public HashSet<Materias> getMaterias() {
        return materias;
    }
}
