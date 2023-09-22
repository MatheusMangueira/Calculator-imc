package br.com.imc.javacore.person.classPerson;

public class Person {
  private String name;
  private int age;
  private int height;
  private double weight;

  public Person(String name, int age, int height, double weight) {
    this.name = name;
    this.age = age;
    this.height = height;
    this.weight = weight;
  }

  public Person() {
  }

  public void print() {
    if (this.name != null) {
      System.out.println("Nome: " + this.name);
    } else {
      System.out.println("nome não existente. Insira um nome");
    }
    System.out.println("Idade: " + this.age);
    System.out.println("Altura: " + this.height + " cm");
    System.out.println("Peso: " + this.weight  + " kg");
  }

  public String getName() {
    return this.name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public int getAge() {
    return this.age;
  }

  public void setAge(int age) {
    this.age = age;
  }

  public int getHeight() {
    return this.height;
  }

  public void setHeight(int height) {
    this.height = height;
  }

  public double getWeight() {
    return this.weight;
  }

  public void setWeight(double weight) {
    this.weight = weight;
  }
}
