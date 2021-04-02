package fundamentos;

import java.util.Scanner;

public class DesafioConversao {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.println("Primeiro salario:");
    String salario1 = sc.nextLine().replace(',', '.');

    System.out.println("Segundo salario:");
    String salario2 = sc.nextLine().replace(',', '.');

    System.out.println("Terceiro salario:");
    String salario3 = sc.nextLine().replace(',', '.');

    double media = (Double.parseDouble(salario1) + Double.parseDouble(salario2) + Double.parseDouble(salario3)) / 3;

    System.out.println("Media: " + media);
    sc.close();
  }
}
