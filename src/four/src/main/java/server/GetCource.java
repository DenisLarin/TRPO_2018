package Server;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;

public class GetCource {
    static Money money = new Money();
    public static String getNewPrice(String fsym, String tsyms) throws IOException {
        URL url = new URL(String.format("https://min-api.cryptocompare.com/data/price?fsym=%s&tsyms=%s",fsym,tsyms));
        URLConnection urlConnection = url.openConnection();
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(urlConnection.getInputStream()));
        String data = bufferedReader.readLine().replaceAll("\\{", "").replaceAll("\\}","").replaceAll("\"","");
        String[] dataArray = data.split(":");
        money.setName(fsym);
        money.setValue(dataArray[0]);
        money.setPrice(dataArray[1]);
        bufferedReader.close();
        return money.toString();
    }
}
