
import java.util.Scanner;
public class ContaTerminal{
    
    public static void main(String[] args){
        
     
            Scanner ler = new Scanner(System.in); 

            int numero;
            String agencia, nomeCliente;
            double saldo = 2.000;
            System.out.println("Digite seu Nome: ");
            nomeCliente = ler.nextLine();
            System.out.print("Por favor, Digite o número da Conta: ");
            numero = ler.nextInt();
            System.out.println("Digite o numero da Agencia: ");
            agencia = ler.nextLine();
            System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agencia é" + agencia + " Conta"  + numero +
                    "e seu saldo " + saldo + "esta disponivel para saque.");

                    ler.close();
        

    }
}