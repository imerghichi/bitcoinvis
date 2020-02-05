package Model;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

public class BitcoinConverter {
    private  String url;
    private String currency;
    private  int value;

    public BitcoinConverter(String currency, int value) {
        this.url = "https://blockchain.info/";
        this.currency = currency;
        this.value = value;
    }

    public  String getUrl() {
        return url;
    }

    public  String convert () throws IOException {
        String url = "https://blockchain.info/tobtc?currency="+this.currency+"&value="+this.value;
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
