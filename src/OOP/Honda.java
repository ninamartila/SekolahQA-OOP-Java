package OOP;

public class Honda extends Motor {
  int year;
  int manufacturerDiscount;

  Honda(int speed, double regularPrice, String color, int year, int manufacturerDiscount) {
    super(speed, regularPrice, color);
    this.manufacturerDiscount = manufacturerDiscount;
    this.year = year;
  }

  @Override
  public double getSalePrice() {
    return regularPrice -= manufacturerDiscount;
  }
}
