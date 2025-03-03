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

// Another work 
import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        double km;
        int age;
        String roundTrip;
        System.out.println("Please enter the distance:  ");
        km = input.nextDouble();
        km = km*10;
        System.out.println("Please enterence passangers age: ");
        age = input.nextInt();
        if (age < 12 ){
            km *= 0.5;
            System.out.println(km);
        }else if (12<= age && age <= 24){
            km *= 0.9;
        }else if (65 <age){
            km *= 0.7;
        }
        System.out.print("Will it be round trip?\n('Y' or 'N'): ");
        roundTrip = input.next();
        while (true){
            if (roundTrip.equalsIgnoreCase("Y")){
                km *=0.8;
            }else if (roundTrip.equalsIgnoreCase("N")){
                break;
            }
            else{
                System.out.print("Please enter valid option:  ");
            }
        }
        System.out.print("Total bill: " + km);
    }
}
