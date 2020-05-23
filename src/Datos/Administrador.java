package Datos;

public class Administrador extends Persona {

    public Administrador(String name, String last_name, String id, String email, String phone, String user, String password) {
        super(name, last_name, id, email, phone, user, password);
    }

    public Administrador(String name, String id, String email, String phone, String user, String password) {
        super(name, id, email, phone, user, password);
    }

}
