
package Datos;


public abstract class Persona {
    
    private String name;
    private String last_name;
    private String id;
    private String email;
    private String phone;
    private String user;
    private String password;

    public Persona(String name, String last_name, String id, String email, String phone, String user, String password) {
        this.name = name;
        this.last_name = last_name;
        this.id = id;
        this.email = email;
        this.phone = phone;
        this.user = user;
        this.password = password;
    }

    public Persona(String name, String id, String email, String phone, String user, String password) {
        this.name = name;
        this.id = id;
        this.email = email;
        this.phone = phone;
        this.user = user;
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLast_name() {
        return last_name;
    }

    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    
    
}
