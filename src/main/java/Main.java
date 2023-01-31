import java.io.*;
import java.util.HashMap;
import java.util.Scanner;

public class Main {

    // nie zmieniaj nic w main
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Main main = new Main();
        main.run(scanner);
    }

    void run(Scanner scanner) {
        CountryReader countryReader = new CountryReader();
        HashMap<String, Country> countryMap = countryReader.createMap("countries.csv");
        File file = new File("countries.csv");
        if (file.exists()) {
            System.out.println("Podaj kod kraju, o którym chcesz zobaczyć informacje:");
            String countryCode = scanner.nextLine();
            if (countryMap.containsKey(countryCode)) {
                System.out.println(countryMap.get(countryCode));
            } else {
                System.out.println("Kod kraju " + countryCode + " nie został znaleziony.");
            }
        }
    }
}
