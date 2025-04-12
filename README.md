import java.util.Scanner;

public class RegistroCenso {

    public void registrarPersonas() {
        Scanner sc = new Scanner(System.in);

        System.out.print("¿Cuántas personas desea registrar?: ");
        int n = Integer.parseInt(sc.nextLine());

        for (int i = 0; i < n; i++) {
            System.out.println("\nPersona " + (i + 1));
            System.out.print("Nombre: ");
            String nombre = sc.nextLine();

            System.out.print("Cédula: ");
            String cedula = sc.nextLine();

            System.out.print("Edad: ");
            int edad = Integer.parseInt(sc.nextLine());

            System.out.print("¿Es desplazado? (true/false): ");
            boolean desplazado = Boolean.parseBoolean(sc.nextLine());

            System.out.print("Estrato (1 a 6): ");
            int estrato = Integer.parseInt(sc.nextLine());

            Persona persona = new Persona(nombre, cedula, edad, desplazado, estrato);
            persona.mostrarInfo();
        }

        sc.close();
    }
}
