package OOP;

public class Harley extends Motor {
 int weight;

  Harley(int speed, double regularPrice, String color, int weight) {
    super(speed, regularPrice, color);
    this.weight = weight;
  }

  @Override
  public double getSalePrice() {
    if(weight > 2000){
      return regularPrice * 0.1;
    }else {
      return regularPrice * 0.2;
    }
  }
  
}
