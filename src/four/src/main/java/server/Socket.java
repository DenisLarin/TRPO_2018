package Server;


import javax.websocket.OnMessage;
import javax.websocket.Session;
import javax.websocket.server.ServerEndpoint;
import java.io.IOException;

@ServerEndpoint("/getcoast")
public class Socket {
    @OnMessage
    public void message(Session session, String str) throws IOException {
        if (str.contains("price")){
            String[] datas = str.split(":");
            session.getBasicRemote().sendText(GetCource.getNewPrice(datas[1],datas[2]));
        }
    }
}
