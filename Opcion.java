import java.util.Scanner;

public class Opcion {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String Mensaje = "";
        double n1 = 0, n2 = 0;
        String opt = "";
        Opcion m = new Opcion();

        System.out.print("Ingrese el primer número: ");
        n1 = sc.nextDouble();
        System.out.print("Ingrese el segundo número: ");
        n2 = sc.nextDouble();
        System.out.print("Ingrese S: Para sumar, R: Para restar, M: Para multiplicar, o D: Para dividir los números: ");
        opt = sc.next().toUpperCase();
        Mensaje = m.Operaciones(opt);
        System.out.println(Mensaje);

     } public String Operaciones(String opt) {

        double n1 = 0, n2 = 0;
        String Mensaje = "";

        switch (opt) {

            case "S":
                double suma = n1 + n2;
                Mensaje = "La suma de los dos números es: " + suma;
                break;
            case "R":
                double resta = n1 - n2;
                Mensaje = "La resta de los dos números es: " + resta;
                break;
            case "M":
                double mult = n1 * n2;
                Mensaje = "La multiplicación de los dos números es: " + mult;
                break;
            case "D":
                double div = n1 / n2;
                Mensaje = "La suma de los dos números es: " + div;
                break;
        
            default:
                Mensaje = "La letra ingresada no corresponde a ninguna operación";
                break;
        }
        return Mensaje;
    }

    public void MostrarResultado(String Mensaje) {
        System.out.println(Mensaje);
    }
}