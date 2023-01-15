package OOP;

public class Motor {
  int speed;
  double regularPrice;
  String color;
  
  Motor(int speed, double regularPrice, String color) {
    this.color = color;
    this.regularPrice = regularPrice;
    this.speed = speed;
  }

  public double getSalePrice() {
    return this.regularPrice;
  }

  void printData() {
    System.out.println("Speed Motor        : " + this.speed);
    System.out.println("Regular Price Motor: " + String.format("%1$,.0f", this.regularPrice));
    System.out.println("Color Motor        : " + this.color);
    System.out.println("Price Sale Motor   : " + String.format("%1$,.0f", getSalePrice()));
  }
}
