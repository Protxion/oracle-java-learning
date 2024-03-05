/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package duke.choise;

import io.helidon.common.http.Http;
import io.helidon.webserver.Handler;
import io.helidon.webserver.ServerRequest;
import io.helidon.webserver.ServerResponse;

public class GetItemList implements Handler {

    private Clothing[] items;

    public GetItemList(Clothing[] items) {
        this.items = items;
    }

    @Override
    public void accept(ServerRequest request, ServerResponse response) {
        response.status(Http.Status.OK_200);
        response.headers().put("Content-Type","text/plain; charset=UTF-8");
        StringBuilder result  = new StringBuilder();
        for (Clothing item : items){
            result.append(item.toString());
            
        }
        response.send(result);
    }
}
