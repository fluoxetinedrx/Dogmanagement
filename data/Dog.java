package data;

public class Dog {

  private String name;
  private int yob;
  private double weight;

  public Dog(String iName, int iYob, double iWeigh) {
    name = iName;
    yob = iYob;
    weight = iWeigh;
  }

  public void bark() {
    System.out.println("My name is " + name);
    System.out.printf("|%-10s|%4d|%4.1f|\n", name, yob, weight);
  }

  public void setNewWeight(double newWeight) { // thay đổi info ban đầu
    weight = newWeight;
  }

  public int getYob() {
    return yob;
  }
}
