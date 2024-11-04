import java.util.Scanner;

public class VariablesTipoDatos {
    public static void main(String[] args) {
        var scanner = new Scanner(System.in);

        System.out.println("Ingrese Un Valor: ");
        var text = scanner.nextLine();

        System.out.printf("El Valor Ingresado Es: %s%n", text);
        
    }
}
