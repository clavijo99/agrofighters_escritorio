
package Datos;


public class Main {


    public static void main(String[] args) {
        String  [] arra = new String [2];
        arra[0] = "pepe";
        arra[1] = "jose";
        Maestro m = new Maestro("pepe","jajaja", "123456789", "bc", "311", "12", "45",arra.length, arra);
        m.MostrarDatos();
    }
    
}
