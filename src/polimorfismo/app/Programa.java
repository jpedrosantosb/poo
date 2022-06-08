package polimorfismo.app;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import polimorfismo.entidade.Empregado;
import polimorfismo.entidade.EmpregadoTerceirizado;

/*
 * Uma empresa possui funcion�rios pr�prios e terceirizados. Para cada
 * funcion�rio, deseja-se registrar nome, horas trabalhadas e valor por hora.
 * Funcion�rios terceirizado possuem ainda uma despesa adicional. 
 * O pagamento dos funcion�rios corresponde ao valor da hora multiplicado pelas horas
 * trabalhadas, sendo que os funcion�rios terceirizados ainda recebem um b�nus
 * correspondente a 110% de sua despesa adicional. 
 * O programa em quest�o ler os dados de N funcion�rios (N fornecido pelo usu�rio) e armazen�-los em uma
 * lista. Depois de ler todos os dados, mostrar nome e pagamento de cada
 * funcion�rio na mesma ordem em que foram digitados.
 */

public class Programa {

  public static void main(String[] args) {
    Scanner sc = new Scanner (System.in);
    List <Empregado> list = new ArrayList<>();
    
    System.out.print("Entre com o n� de funcion�rios por gentileza: ");
    int n = sc.nextInt();
    
    for (int i=1; i<=n; i++) {
        System.out.println("Empregado #" + i + " data: ");
        System.out.print("O funcion�rio � terceirizado? (y/n)? ");
        char yn = sc.next().charAt(0);
        System.out.print("Nome do funcion�rio: ");
        sc.nextLine();
        String nome = sc.nextLine();
        System.out.print("Horas: ");
        Integer hora = sc.nextInt();
        System.out.print("Valor por hora: ");
        double valorPorHora = sc.nextDouble();
        if (yn == 'y') {
            System.out.print("Adicional (110%): ");
            Double adicional = sc.nextDouble();
            Empregado emp = new EmpregadoTerceirizado(nome, hora, valorPorHora, adicional);
            list.add(emp);
        }
        else {
            Empregado emp = new Empregado(nome, hora, valorPorHora);
            list.add(emp);
        }
    }
        System.out.println();
        System.out.println("Pagamentos: ");
        for (Empregado emp : list) {
            System.out.println(emp.getNome() +  " - $ " + String.format("%.2f", emp.pagamento()));
        }
    
    sc.close();
  }

}
