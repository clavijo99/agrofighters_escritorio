package Datos;

import javax.swing.JOptionPane;

public class Maestro extends Persona {

    private String asignatura[];

    public Maestro(String name, String last_name, String id, String email, String phone, String user, String password, int tama, String[] asignaturas) {
        super(name, last_name, id, email, phone, user, password);
        this.asignatura = new String[tama];
        System.arraycopy(asignaturas, 0, this.asignatura, 0, tama);

    }

    public Maestro(String name, String id, String email, String phone, String user, String password) {
        super(name, id, email, phone, user, password);
    }

    
    public void MostrarDatos(){
        for(String ite : this.asignatura){
            JOptionPane.showMessageDialog(null, ite);
    }
    }
}
