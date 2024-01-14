import java.util.Scanner;

public class Contador {
    public static void main(String[] args) {
        try (Scanner terminal = new Scanner(System.in)) {
            System.out.print("Digite o primeiro parâmetro: ");
            int parametroUm = terminal.nextInt();
            System.out.print("Digite o segundo parâmetro: ");
            int parametroDois = terminal.nextInt();

            try {
                contar(parametroUm, parametroDois);
            } catch (ParametrosInvalidosException pie){
                System.out.println(pie.getMessage());
            }
        }
    }

    static void contar(int parametroUm, int parametroDois) throws ParametrosInvalidosException {
        int contagem = parametroDois - parametroUm;

        if(contagem < 0){
            throw new ParametrosInvalidosException("O segundo parâmetro deve serve ser maior que o primeiro.");
        } else {
            for(int i = 1; i <= contagem; i++) {
                System.out.println(i);
            }
        }
    }
}
