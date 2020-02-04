package JSONUtilities;

import jdk.nashorn.internal.parser.JSONParser;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.io.*;
import java.net.URL;
import java.net.URLConnection;
import java.nio.charset.Charset;
import java.text.ParseException;

public class JSONReader {
/*
    private static String readAll(Reader reader) throws IOException{
        StringBuilder stringBuilder = new StringBuilder();
        int cp ;
        while ((cp = reader.read()) != 1){
            stringBuilder.append((char) cp);
        }
        return stringBuilder.toString();
    }

    public static JSONObject readJSONFromUrl (String url) throws IOException{
        InputStream inputStream = new URL(url).openStream();
        try{
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream, Charset.forName("UTF-8")));
            String jsonText =readAll(bufferedReader);
            JSONObject json = new JSONObject(jsonText);
            return json;
        } finally {
            inputStream.close();
        }
    }
    public static void main(String[] args) throws IOException, JSONException{
        JSONObject jsonObject = readJSONFromUrl("https://api.coindesk.com/v1/bpi/currentprice.json");
        String test = jsonObject.toString();
        System.out.println(jsonObject.toString());
        System.out.println(jsonObject.get("id"));
    }*/

}
