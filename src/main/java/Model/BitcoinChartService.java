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
    List<Integer> getx() throws IOException {
       return null;
    }
    List<Date> gety() {
        return null;
    }
}
