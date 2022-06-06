package encapsulamento.app;

import java.util.Locale;
import java.util.Scanner;

import encapsulamento.entidade.Conta;

public class Programa {

  public static void main(String[] args) {
    Locale.setDefault(Locale.US);
    Scanner sc = new Scanner(System.in);
    Conta conta;

    System.out.print("Entre com o nº da conta: ");
    int numero = sc.nextInt();
    System.out.print("Entre com o titular da conta: ");
    sc.nextLine();
    String titular = sc.nextLine();
    System.out.print("Existe um depósito inicial (s/n)? ");
    char resposta = sc.next().charAt(0);
    if (resposta == 's') {
        System.out.print("Insira o valor do depósito inicial: ");
        double depositoInicial = sc.nextDouble();
        conta = new Conta(numero, titular, depositoInicial);
    }
    else {
        conta = new Conta(numero, titular);
    }
    
    System.out.println();
    System.out.println("Dados da conta:");
    System.out.println(conta);
    
    if(resposta == 'n') {
      System.out.println();
      System.out.print("Insira um valor de depósito: ");
      double depositValue = sc.nextDouble();
      conta.deposito(depositValue);
      System.out.println("Dados da conta atualizados: ");
      System.out.println(conta);
    }
    
    System.out.println();
    System.out.print("Valor para saque: ");
    double valorSaque = sc.nextDouble();
    conta.saque(valorSaque);
    System.out.println("Dados da conta atualizados:");
    System.out.println(conta);
    
    sc.close();
  }

}
