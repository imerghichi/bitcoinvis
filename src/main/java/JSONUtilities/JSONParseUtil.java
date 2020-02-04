package JSONUtilities;


import Model.BitcoinData;
import com.google.gson.Gson;
import com.google.gson.JsonArray;
import jdk.nashorn.internal.parser.JSONParser;
import jdk.nashorn.internal.parser.Parser;
import org.json.JSONException;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;

public class JSONParseUtil {
    public  String read (String url) throws IOException {
        URL url1 = new URL(url);
        BufferedReader br = new BufferedReader(new InputStreamReader(url1.openStream()));
        StringBuilder stringBuilder = new StringBuilder();
        String str = "";
        while (null != (str = br.readLine())) {
            stringBuilder.append(str);
        }
        return stringBuilder.toString();

    }
    /*
    public static void createJSONFile(String s) throws IOException{
        File file = new File("tmp/Jsonbitcoin.json");
        Writer writer = new FileWriter(file);
        writer.write(s);
        writer.close();
    }*/
 /*   public static void main(String[] args) throws Exception {
        String url ="https://api.coindesk.com/v1/bpi/historical/close.json";
        BitcoinData bitcoinData = new BitcoinData();
        String jsonstr = read(url);
        bitcoinData = parser(jsonstr);
        System.out.println(bitcoinData.toString());


    }*/
    public static BitcoinData parser(String jsonstr)throws Exception{
        Gson gson = new Gson();
        BitcoinData bitcoinData = gson.fromJson(jsonstr,BitcoinData.class);
        BitcoinData bitcoinData1 = new BitcoinData(bitcoinData.getDate(),bitcoinData.getPrice());
        return bitcoinData;
    }


}
