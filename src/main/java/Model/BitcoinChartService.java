package Model;


import org.json.JSONObject;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class BitcoinChartService extends BitcoinChart {
    private BitcoinChart bitcoinChart = new BitcoinChart();
    private JSONObject jsonObject = this.bitcoinChart.getDataJSON();

    public BitcoinChartService() throws IOException {
    }
    ArrayList getx() throws IOException {
       return (ArrayList) jsonObject.get("value");
    }

}
