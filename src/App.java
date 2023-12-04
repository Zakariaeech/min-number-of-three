import java.util.Scanner;

class app {
  // the function that get the min number
  static double min(double n1, double n2, double n3) {
    double minNumber = n1;
    if (n2 <= minNumber)
      minNumber = n2;
    if (n3 <= minNumber)
      minNumber = n3;
    return minNumber;
  }

  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    System.out.println("Enter 3 numbers : ");
    // get the numbers from the user
    double N1 = sc.nextDouble();
    double N2 = sc.nextDouble();
    double N3 = sc.nextDouble();
    sc.close();
    // print the minNumber returned from the function
    System.err.println("The MIN number is : " + min(N1, N2, N3));

  }
}