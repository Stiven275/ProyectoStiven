import java.util.Scanner;

public class ejercicio2 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        float notaDefinitiva;
        System.out.println("Sistema de notas");
        System.out.print("Nota definitiva: ");
        notaDefinitiva = scanner.nextFloat();
        System.out.println("\nR e s u l t a d o");


        if(notaDefinitiva>5 || notaDefinitiva<0){
            System.out.println("NOTA INVÁLIDA");
        }else if(notaDefinitiva>4.49){
            System.out.println("Superior");
        }else if(notaDefinitiva>3.99 ){
            System.out.println("Alto");
        }else if(notaDefinitiva>2.94){
            System.out.println("Básico");
        }else{
            System.out.println("Bajo");
        }
    }
}