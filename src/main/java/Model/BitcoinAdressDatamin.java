package Model;

import org.json.JSONObject;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;

public class BitcoinAdressDatamin {
    private String dataAdress;

    public String getDataAdress() {
        return dataAdress;
    }

    public void setDataAdress(String dataAdress) {
        this.dataAdress = dataAdress;
    }

    public BitcoinAdressDatamin(String dataAdress) {
        this.dataAdress = dataAdress;
    }

    public String getData() throws IOException {
        String url = "https://blockchain.info/rawaddr/"+this.dataAdress;
        URL url1 = new URL(url);
        BufferedReader br = new BufferedReader(new InputStreamReader(url1.openStream()));
        StringBuilder stringBuilder = new StringBuilder();
        String str = "";
        while (null != (str = br.readLine())) {
            stringBuilder.append(str);
        }
        return stringBuilder.toString();

    }
    public JSONObject getDataJSON() throws IOException {
        JSONObject jsonObject =new JSONObject(this.getData());
        return jsonObject;
    }
}
