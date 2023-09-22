package br.com.imc.javacore.person.calc;

import br.com.imc.javacore.person.classPerson.CalcIMC;
import br.com.imc.javacore.person.classPerson.Person;

import java.util.Scanner;

public class Calc {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    Person person = new Person();
    CalcIMC calc = new CalcIMC();

    while (true) {
      System.out.println("Digite seu nome");
      String value = scanner.next();
      person.setName(value);

      System.out.println("digite sua altura");
      int valueHeigth = scanner.nextInt();
      person.setHeight(valueHeigth);

      System.out.println("digite seu peso");
      double valueWeight = scanner.nextDouble();
      person.setWeight(valueWeight);

      System.out.println("digite sua idade");
      int valueAge = scanner.nextInt();
      person.setAge(valueAge);
      break;
    }
    scanner = new Scanner(System.in);


    person.print();
    calc.calc(person.getHeight(), person.getWeight());
  }
}
