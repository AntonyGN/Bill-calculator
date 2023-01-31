
import java.util.Scanner;

public class ElectricityBill {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.print("Enter the amount of electricity used (in kWh): ");
    double electricityUsed = input.nextDouble();
    double baseCharge = electricityUsed * 10;
    double vat = baseCharge * 0.16;
    double tax = baseCharge * 0.1;
    double totalBill = baseCharge + vat + tax;
    System.out.println("Base charge: KSH " + baseCharge);
    System.out.println("VAT (16%): KSH " + vat);
    System.out.println("Tax (10%): KSH " + tax);
    System.out.println("Electricity bill (in KSH): " + totalBill);
  }
}

