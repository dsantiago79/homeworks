
package proyectos.examen_final;

import java.util.Scanner;
import javax.swing.JOptionPane;

public class Examen_final {
    static Scanner scanner = new Scanner (System.in);
    
    public static void main(String[] args) {
       
        int opcion = 0;
        
        
        do{
        System.out.println("---Menu de opciones---");
        System.out.println("1. Funciones");
        System.out.println("2. Recursividad");
        System.out.println("3. Metodo de ordenacion de insercion");
        System.out.println("4. Metodo de ordenacion Shell");
        System.out.println("5. Lista de personas");
        System.out.println("6. Pilas");
        System.out.println("7. Colas");
        System.out.println("8. Salir");
        System.out.println("Selecciona una opcion: ");
        
        opcion = scanner.nextInt();
           
        switch(opcion){
            case 1 -> funciones();
            case 2 -> recursividad();
            case 3 -> insercion();
            case 4 -> shell();
            case 5 -> lista();
            case 6 -> pilas();
            case 7 -> colas();
            case 8 -> {
                }
            default -> System.out.println("\nOpcion invalida,intenta de nuevo\n\n");
        }
      }while (opcion!=8); 
        
      System.out.println("\nGracias por utilizar el sistema, hasta luego\n\n");
    }

    private static void funciones() {
        System.out.println("\nUso de funciones\n\n");   
       int n1 = Integer.parseInt(JOptionPane.showInputDialog("Digite el primer numero: "));
       int n2 = Integer.parseInt(JOptionPane.showInputDialog("Digite el segundo numero: "));
       
       Operacion op = new Operacion();
       
       op.sumar(n1,n2);
       op.restar(n1,n2);
       op.multiplicar(n1, n2);
       op.dividir(n1, n2);
       
       op.mostrarResultados();
       
   }    


    private static void recursividad() {
        System.out.println("\nUso del Metodo de Recursividad\n\n");
        int num;
        try (Scanner sc = new Scanner (System.in)) {
            System.out.print("Introduce un numero: ");
            num = sc.nextInt();
        }
        
        System.out.println("\nEl factorial de "+num + "es: " +factorial(num));
        
    }
    public static int factorial (int num){
    if(num == 0){
        return 1;
        }
    else{
    return num + factorial (num+1);
        } 
    }

    private static void insercion() {
        System.out.println("\nUso del metodo de ordenacion por Insercion\n\n");
    }

    private static void shell() {
        System.out.println("\nUso del metodo de ordenacion por Shell\n\n");
    }

    private static void lista() {
        System.out.println("\nUso de creacion de lista de personas\n\n");
    }

    private static void pilas() {
        System.out.println("\nUso de la funcion pilas\n\n");
    }

    private static void colas() {
        System.out.println("\nUso de la funcion colas\n\n");
    }
}
