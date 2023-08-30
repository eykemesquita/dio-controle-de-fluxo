import java.util.Scanner;

public class Contador {
    public static void main(String[] args) {
        var scanner = new Scanner(System.in);

        System.out.println("Digite o primeiro parametro");
        var parametroUm = scanner.nextInt();
        System.out.println("Digite o segundo parametro");
        var parametroDois = scanner.nextInt();

        try {
            contar(parametroUm, parametroDois);
        } catch (ParametrosInvalidosException e) {
            System.out.println("O segundo parâmetro deve ser maior que o primeiro");
        }
    }

    private static void contar(int parametroUm, int parametroDois) throws ParametrosInvalidosException {
        if (parametroUm >= parametroDois) {
            throw new ParametrosInvalidosException();
        } else {
            var contagem = parametroDois - parametroUm;
            for (int i = 1; i <= contagem; i++) {
                System.out.println("Imprimindo o número " + i);
            }
        }
    }
}
