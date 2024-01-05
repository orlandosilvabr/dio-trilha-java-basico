import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        Scanner teclado = new Scanner(System.in);
        int numero;
        String agencia;
        String nome;
        double saldo;

        System.out.print("Digite o número da conta: ");
        numero  = teclado.nextInt();
        System.out.print("Digite o número da agência: ");
        agencia = teclado.nextLine(); teclado.nextLine();
        System.out.print("Digite o nome: ");
        nome = teclado.nextLine();
        System.out.print("Digite o saldo da conta: ");
        saldo = teclado.nextDouble();

        System.out.println("Olá, " + nome + "! Obrigado por criar uma conta em nosso banco, sua agência é a " + agencia + 
            ", conta " + numero + " e seu saldo de " + saldo + " já está disponível.");
    }
}
