package OOP;

public class Yamaha extends Motor{
  int cubicalCentimeter;

  Yamaha(int speed, double regularPrice, String color, int cubicalCentimeter) {
    super(speed, regularPrice, color);
    this.cubicalCentimeter = cubicalCentimeter;
  }

  @Override
  public double getSalePrice() {
    if( cubicalCentimeter > 250){
      return regularPrice * 0.15;
    }else{
      return regularPrice * 0.5;
    }
  }
}
