package br.com.imc.javacore.person.classPerson;

public class CalcIMC  {
  public void calc(int heigth, double weight) {

    double resultCalc = weight / ((double) heigth / 100 * (double) heigth / 100);

    System.out.println("Seu IMC é de: " +(int) resultCalc + "kg/m2");

  }

}
