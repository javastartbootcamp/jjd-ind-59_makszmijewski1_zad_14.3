import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;

public class CountryReader {

    public HashMap<String, Country> createMap(String fileName) {
        HashMap<String, Country> countryMap = new HashMap<>();
        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
            String s;
            while ((s = reader.readLine()) != null) {
                String[] values = s.split(";");
                countryMap.put(values[0], new Country(values[0], values[1], Integer.parseInt(values[2])));
            }
        } catch (IOException e) {
            System.out.println("Brak pliku countries.csv.");
        }
        return countryMap;
    }
}
