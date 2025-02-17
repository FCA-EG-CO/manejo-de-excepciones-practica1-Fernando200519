import java.util.Scanner;

public class Numero {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Digite un valor: ");

        int valor = entrada.nextInt();

        try {
            int resultado = verificarNumero(valor);
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }

        entrada.close();
    }

    public static int verificarNumero(int numero) throws Exception {
        if (numero % 2 == 0) {
            System.out.println("El número es par");
            return numero;
        } else {
            throw new Exception("El número es impar");
        }
    }
}
