/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package duke.choise;
import io.helidon.common.http.Http;
import io.helidon.webserver.Handler;
import io.helidon.webserver.ServerRequest;
import io.helidon.webserver.ServerResponse;

public class HelloWorld  implements Handler{

    @Override
    public void accept(ServerRequest request, ServerResponse response) {
        System.out.println("Hola mundo");
        response.status(Http.Status.OK_200);
        response.headers().put("Content-Type","text/plain; charset=UTF-8");
        response.send("Hola mundo");
    }
    
}
