import java.util.Scanner;
public class ContaTerminal{
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Digite o número da Agência:");
        String agencia = scanner.nextLine();
        
        System.out.println("Digite o número da Conta:");
        int numero = scanner.nextInt();
        scanner.nextLine(); 
        
        System.out.println("Digite o nome do Cliente:");
        String nomeCliente = scanner.nextLine();
        
        System.out.println("Digite o saldo:");
        double saldo = scanner.nextDouble();
        
        System.out.println("Olá " + nomeCliente + ", sua agência é " + agencia + ", conta " + numero + " e seu saldo " + saldo + " já está disponível para saque.");
    }
}
