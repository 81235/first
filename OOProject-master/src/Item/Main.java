package Item;


import java.util.ArrayList;
import java.util.Collections;
//import java.util.List;//

public class Main {

    public static void main(String[] args) {

        //  line of code to create an ArrayList of products
        ArrayList<Product> products;
        //  line of code to call testCollection and assign the result to the ArrayList
        products = testCollection();
        //  line of code to sort the ArrayList
        Collections.sort(products);
        // Call the print method on the ArrayList
        print(products);
    }

    // Step 15
    // Complete the header for the testCollection method here

    public static ArrayList<Product> testCollection() {
        ArrayList<Product> products = new ArrayList<>();
        AudioPlayer a1 = new AudioPlayer("iPod Mini", "MP3");
        AudioPlayer a2 = new AudioPlayer("Walkman", "WAV ");
        MoviePlayer m1 = new MoviePlayer("DB POWER MK101",
                new Screen(" 720x480", 40, 22), MonitorType.LCD);
        MoviePlayer m2 = new MoviePlayer("Pyle PDV156BK",
                new Screen("1366x768", 40, 22), MonitorType.LED);

        // lines of code here to create the collection

        products.add(a1);
        products.add(a2);
        products.add(m1);
        products.add(m2);
        return products;
    }

    public static void print(ArrayList<Product> products) {

        for (Product p : products) {
            System.out.println(p);
        }
    }
    // Step 16
    //  print method

}






