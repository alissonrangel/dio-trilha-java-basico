import java.util.Locale;
import java.util.Scanner;

/**
 * @author Alisson Rangel
 * @since 22/08/2023
 * @version 1.0.0
 */
public class ContaTerminal {
    
    public static void main(String[] args) throws Exception {
               
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
        
        System.out.print("\n\nPor favor, digite o número da sua conta: ");
        int numeroDaConta = scanner.nextInt();
        

        System.out.print("Por favor, digite a agência do Banco: ");
        String agenciaDoBanco = scanner.next();

        System.out.print("Por favor, digite seu nome: ");
        scanner.nextLine();
        String nomeDoCliente = scanner.nextLine();
        
        System.out.print("Por favor, digite o saldo da sua conta: ");
        double saldoDaConta = scanner.nextDouble();
        
        scanner.close();        

        String resposta = "\n\nOlá ".concat(nomeDoCliente).concat(", obrigado por criar uma conta em nosso banco, sua agência é ").concat(agenciaDoBanco).concat(", conta ").concat(""+numeroDaConta).concat(" e seu saldo ").concat(""+saldoDaConta).concat(" já está disponível para saque.");

        System.out.println(resposta);

    }
}
