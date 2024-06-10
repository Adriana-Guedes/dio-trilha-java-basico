import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class ContaTerminal {
    public static void main(String[] args) {
        double saldo = 237.48;
        Scanner sc = new Scanner(System.in);
        System.out.println("BEM VINDO !!!: ");

        System.out.println("POR GENTILEZA DIGITE O NÚMERO DA AGÊNCIA: ");
        int ag =  sc.nextInt();

        System.out.println("POR GENTILEZA DIGITE O NÚMERO DA CONTA: ");
        String conta =  sc.next();

        System.out.println("POR GENTILEZA DIGITE O SEU NOME: ");
        String nome =  sc.next();



        System.out.println("Olá " +nome+ ", obrigado por criar uma conta em nosso banco, sua agencia é "+ag+ ", conta "+conta+" e seu sando "+saldo+ " já esta disponível para saque");



        }

    }
