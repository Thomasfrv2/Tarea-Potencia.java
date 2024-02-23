import java.util.Scanner;

public class PotenciaRecursiva {
    public static int potenciaRecursiva(int base, int exponente) {

        if (exponente == 0) {
            return 1;
        } else {

            return base * potenciaRecursiva(base, exponente - 1);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese la base: ");
        int base = scanner.nextInt();

        System.out.print("Ingrese el exponente: ");
        int exponente = scanner.nextInt();

        
        int resultado = potenciaRecursiva(base, exponente);

        
        System.out.println(base + "^" + exponente + " = " + resultado);
    }
}
