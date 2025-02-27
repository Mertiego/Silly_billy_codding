import java.util.Scanner;

public class Main3{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double km, toplam;
        int yas;

        System.out.println("Mesafeyi giriniz (km): ");
        km = scanner.nextDouble();

        toplam = km * 10;

        System.out.println("Gidiş dönüş olacak mı? (Y/N)");
        String gidisDonus = scanner.next();

        if (gidisDonus.equalsIgnoreCase("Y")) {
            toplam *= 0.8;  
        }

        System.out.println("Yolcu kaç yaşında? ");
        yas = scanner.nextInt();

        if (yas < 12) {
            toplam *= 0.5;
        } else if (yas >= 12 && yas <= 24) {
            toplam *= 0.9;
        } else if (yas > 65) {
            toplam *= 0.7;
        }

        System.out.println("Toplam bilet ücreti: " + toplam + " $");

        scanner.close();
    }
}
