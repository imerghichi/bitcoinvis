package Model;

import com.google.gson.Gson;
import jdk.nashorn.internal.parser.JSONParser;
import org.json.JSONObject;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;

public class BitcoinAdressData extends BitcoinAdressDatamin {

    private JSONObject jsonObject = this.getDataJSON();

    public BitcoinAdressData(String dataAdress) throws IOException {
        super(dataAdress);
    }

    public String getHash() throws IOException {
        String out = null;
        out = this.jsonObject.getString("hash160");
        return out;
    }
    public int getn_txt() throws IOException {
        int out;
        out = jsonObject.getInt("n_tx");
        return out;

    }
    public long getTotalreceived() throws IOException {
        long out = this.jsonObject.getInt("total_received");
        return out;
    }
    public long getTotalsent() throws IOException {
        long out = this.jsonObject.getInt("total_sent");
        return out;
    }

    public long getFinal_balance() throws IOException {
        long out = this.jsonObject.getLong("final_balance");
        return out;
    }
}
