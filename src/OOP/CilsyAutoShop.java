package OOP;

public class CilsyAutoShop {
  public static void main(String args[]){

    //Sebuah instance dari class Yamaha dan initialize semua field dengan value yang sesuai
    Yamaha lexy = new Yamaha(120, 70000000, "black", 150);
    System.out.println("\n\n==========================================");
    lexy.printData();

    //2 buah instance dari class Honda, dan initialize semua field dengan value yang sesuai
    Honda beat = new Honda(100, 50000000, "Red", 2015, 100000);
    Honda pcx = new Honda(150, 100000000, "White", 2022, 500000);
    System.out.println("\n\n==========================================");
    beat.printData();
    System.out.println("==========================================");
    pcx.printData();

    //sebuah instance dari class Motor dan initialize semua field dengan value yang sesuai
    System.out.println("\n\n==========================================");
    Motor bebek = new Motor(80, 20000000, "green");
    bebek.printData();

    //semua class chield dan initialize semua field dengan value yang sesuai
    Yamaha nmax = new Yamaha(150, 100000000, "black", 150);
    System.out.println("\n\n==========================================");
    nmax.printData();
    Honda adv = new Honda(150, 100000000, "blue", 2022, 500000);
    System.out.println("==========================================");
    adv.printData();
    Harley harley = new Harley(100, 40000000, "Navy", 200);
    System.out.println("==========================================");
    harley.printData();
  }
}
