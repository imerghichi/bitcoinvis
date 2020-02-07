package Model;

import org.json.JSONObject;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;

public interface Model {
    public String getData() throws IOException;
    public JSONObject getDataJSON() throws IOException;

}
