/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package duke.choise;
import java.util.Arrays;
import io.helidon.webserver.Routing;
import io.helidon.webserver.ServerConfiguration;
import io.helidon.webserver.WebServer;
import java.net.InetAddress;
import java.net.UnknownHostException;
public class ServerStart {

    public static void main(String[] args) {
        final double Impuesto = 0.2;
        double total = 0.0;
        Customer c1 = new Customer("pinky", 3);
        Clothing item1 = new Clothing("Blue Jaket", 20.9, "M");
        Clothing item2 = new Clothing("Orange T-Shirt", 20.9, "M");
        Clothing item3 = new Clothing("Green Scarf", 5.0, "S");
        Clothing item4 = new Clothing("Blue T-Shirt", 10.5, "S");
        Clothing[] items = {item1, item2, item3, item4};
        try {
            GetItemList list = new GetItemList(items);
            HelloWorld helloWorldHandler = new HelloWorld (); 
            Routing routing = Routing.builder()
                    
                    .get("/items", list)
                    .get("/perro", helloWorldHandler)
                    .build();
            ServerConfiguration config = ServerConfiguration.builder()
                    .bindAddress(InetAddress.getLocalHost())
                    .port(8888).build();
            WebServer server = WebServer.create(config, routing);
            server.start();
            System.out.println("Se inicio   ");
        } catch (UnknownHostException ex) {
            ex.printStackTrace();
        }
    }
}
