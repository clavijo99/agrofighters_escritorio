package Datos;

public class Estudiante extends Persona {

    private String faculta;
    private String semestre;
    private String jornada;

    public Estudiante(String name, String last_name, String id, String email, String phone, String user, String password) {
        super(name, last_name, id, email, phone, user, password);
    }

    @Override
    public boolean Registrar() {
        return true;
    }

    @Override
    public boolean Ingresar() {
        return true;
    }

}
