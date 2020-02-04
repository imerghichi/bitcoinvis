package Model;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

public class BitcoinConverter {
    private  String url;

    public BitcoinConverter() {
        this.url = "https://blockchain.info/";
    }

    public  String getUrl() {
        return url;
    }

    public  String convert (String currency, int value) throws IOException {
        String url = "https://blockchain.info/tobtc?currency="+currency+"&value="+value;
        URL url1 = new URL(url);
        BufferedReader br = new BufferedReader(new InputStreamReader(url1.openStream()));
        StringBuilder stringBuilder = new StringBuilder();
        String str = "";
        while (null != (str = br.readLine())) {
            stringBuilder.append(str);
        }
        return stringBuilder.toString();

    }

}
