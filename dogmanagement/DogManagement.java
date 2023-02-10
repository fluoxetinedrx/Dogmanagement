package dogmanagement;

import data.Dog;

public class DogManagement {

  public static void main(String[] args) {
    Dog chiHu = new Dog("Chi Hu Hu", 2022, 0.5);
    chiHu.bark();
    Dog husky = new Dog("Husky", 2021, 50);
    husky.bark();
    System.out.println("After Overweight ");
    chiHu.setNewWeight(5);
    int chYob = chiHu.getYob();
    System.out.println("CH YOB: " + chYob);
    System.out.println("HK YOB: " + husky.getYob());
  }
}
