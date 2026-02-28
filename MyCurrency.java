import java.util.Scanner;

public class MyCurrency{
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("     Currency Convert     ");
        System.out.println("     ________________     ");
        System.out.println("Enter amount in EGP: ");
        double egp = sc.nextDouble();

        double usd = egp / 50.0;
        double eur = egp / 56.5;
        double sar = egp / 12.77;

        System.out.println("\n     Currency Convert     ");
        System.out.println("     ___________________     ");
        System.out.println(egp + " EGP = " + usd + " USD");
        System.out.println(egp + " EGP = " + eur + " EUR");
        System.out.println(egp + " EGP = " + sar + " SAR");
        System.out.println("Thank you for using my program");
    }
}