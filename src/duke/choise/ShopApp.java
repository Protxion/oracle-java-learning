package duke.choise;

import java.util.Arrays;
import io.helidon.webserver.Routing;
import io.helidon.webserver.ServerConfiguration;
import io.helidon.webserver.WebServer;
import java.net.InetAddress;
import java.net.UnknownHostException;
public class ShopApp {

    public static void main(String[] args) {
        final double Impuesto = 0.2;
        double total = 0.0;
        Customer c1 = new Customer("pinky", 3);
        Clothing item1 = new Clothing("Blue Jaket", 20.9, "M");
        Clothing item2 = new Clothing("Orange T-Shirt", 20.9, "M");
        Clothing item3 = new Clothing("Green Scarf", 5.0, "S");
        Clothing item4 = new Clothing("Blue T-Shirt", 10.5, "S");
        Clothing[] items = {item1, item2, item3, item4};        
        System.out.println("Minimum price is: " + Clothing.minimumPrice);
        //c1.setName("pinky");

        System.out.println("Welcome to Duke Choise Shop!");
        //System.out.println("Prenda: " + item1.Description + "\n Tamaño: " + item1.Size + "\n Precio: " + item1.Price);
        //System.out.println("Prenda: " + item2.Description + "\n Tamaño: " + item2.Size + "\n Precio: " + item2.Price);
        //total = (item1.Price + item2.Price * 2) * 1 + Impuesto;       
        c1.addItems(items);;
        //System.out.println(c1.size);
        System.out.println("Customer name is " + c1.getName() + "\n" + c1.getSize() + "\n" + c1.getTotalClothingCost());

        int average = 0;
        int count = 0;
        for (Clothing item : c1.getItems()) {
            if (item.getSize().equals("L")) {
                count++;
                average += item.getPrice();
            }

        }
        try {
            average = (count == 0) ? 0 : average / count;
            System.out.println("Average price: " + average + " count: " + count);
        } catch (ArithmeticException e) {
            System.out.println(e);
        }
        Arrays.sort(c1.getItems());
        for (Clothing item : c1.getItems()) {
            //System.out.println(item.getDescription()+"\n" +item.getSize()+"\n"+ item.getPrice());
            System.out.println(item);
        }
    }

}
