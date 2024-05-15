import java.nio.charset.StandardCharsets;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in, StandardCharsets.UTF_8.name());
        System.out.println("Digite o nome do usuário: ");
        String nome = input.nextLine();
        System.out.println("Digite o número da sua agência:");
        int agencia = input.nextInt();
        System.out.println("Digite o número da sua conta:");
        int conta = input.nextInt();

        float saldo = 0;

        System.out.println("Olá " + nome + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta " + conta + " e seu saldo " + saldo + " já está disponível para saque");
    }
}
