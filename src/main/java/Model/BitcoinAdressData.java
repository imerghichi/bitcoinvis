package Model;

import com.google.gson.Gson;
import jdk.nashorn.internal.parser.JSONParser;
import org.json.JSONObject;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;

public class BitcoinAdressData {
    private String dataAdress;

    public String getDataAdress() {
        return dataAdress;
    }

    public void setDataAdress(String dataAdress) {
        this.dataAdress = dataAdress;
    }

    public BitcoinAdressData(String dataAdress) {
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
    public String getHash() throws IOException {
        String out;
        JSONObject jsonObject = this.getDataJSON();
        out = jsonObject.getString("hash160");
        return out;
    }
    public int getn_txt() throws IOException {
        int out;
        JSONObject jsonObject = this.getDataJSON();
        out = jsonObject.getInt("n_tx");
        return out;

    }
    public long getTotalreceived() throws IOException {
        long out = this.getDataJSON().getInt("total_received");
        return out;
    }
    public long getTotalsent() throws IOException {
        long out = this.getDataJSON().getInt("total_sent");
        return out;
    }

    public long getFinal_balance() throws IOException {
        long out = this.getDataJSON().getLong("final_balance");
        return out;
    }
}
