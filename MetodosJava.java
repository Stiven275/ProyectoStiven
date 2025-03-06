import java.util.Scanner;

public class MetodosJava {
    public static void main(String[] args) {

        String Mensaje = "";
        int edad = 0;
        Scanner sc = new Scanner(System.in);
        MetodosJava m = new MetodosJava();
        System.out.print("Ingrese la edad: ");
        edad = sc.nextInt();
        Mensaje = m.LosJacobs(edad);
        System.out.println(Mensaje);
    }

    public String LosJacobs(int edad) {
        String Mensaje = "";
        if (edad > 17) {
            System.out.println("--------------------");
            Mensaje = "Puede pasar";
        } else {
            System.out.println("--------------------");
            Mensaje = "No puede pasar";
        }
        return Mensaje;
    }

    public void ImprimirMensaje(String Mensaje) {
        System.out.println(Mensaje);
    }
}