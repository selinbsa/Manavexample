import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Manava Hoşgeldiniz! Hangi meyve ve sebzelerden kaçar kilo istediğinizin bilgilerini girin lütfen.");

        double pear = 2.14;
        double apple = 3.67;
        double tomato = 1.11;
        double banana = 0.95;
        double aurbergine = 5.00;

        //Getting information about how many kilos of fruits and vegetables are required
        System.out.println("Armut kaç kilo? : ");
        double kilo_pear = scanner.nextDouble();

        System.out.println("Elma kaç kilo? : ");
        double kilo_apple = scanner.nextDouble();

        System.out.println("Domates kaç kilo? : ");
        double kilo_tomato = scanner.nextDouble();

        System.out.println("Muz kaç kilo? : ");
        double kilo_banana = scanner.nextDouble();

        System.out.println("Patlıcan kaç kilo? : ");
        double kilo_aurbergine = scanner.nextDouble();

        //Calculating total price of all fruits and vegetables are required
        double total_price = (pear*kilo_pear)+(apple*kilo_apple)+(tomato*kilo_tomato)+(banana*kilo_banana)+(aurbergine*kilo_aurbergine);

        //Showing total price to user
        System.out.println("Toplam tutar : "+ total_price + "TL");


    }
}