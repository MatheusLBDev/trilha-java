import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Variaveis auxiliares
         int numero;
         String agencia;
         String nome;
         double saldo;

        System.out.print("Por favor, digite a agência: ");
        agencia = sc.nextLine();
        System.out.print("Por favor, digite o número da conta: ");
        numero = sc.nextInt();
        sc.nextLine();
        System.out.print("Por favor, digite o nome do cliente: ");
        nome = sc.nextLine();
        System.out.print("Por favor, o saldo da conta: ");
        saldo = sc.nextDouble();
        ContaTerminal cliente = new ContaTerminal(numero, agencia, nome, saldo);


        System.out.println("Olá " + cliente.getNomeCliente() + ", obrigado por criar uma conta em nosso banco, sua agência é "
                + cliente.getAgencia() + ", conta " + cliente.getNumeroConta()
                + " e seu saldo " + cliente.getSaldoConta() + " está disponível para saque");

    }
}