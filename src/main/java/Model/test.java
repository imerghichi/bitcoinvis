package Model;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class test {
    public static void main(String[] args)  {


        BitcoinAdressData bitcoinAdressData = null;
        try {
            bitcoinAdressData = new BitcoinAdressData("1AJbsFZ64EpEfS5UAjAfcUG8pH8Jn3rn1F");

            String strr = bitcoinAdressData.getHash();
            System.out.println(strr);
            int inttt = bitcoinAdressData.getn_txt();
            System.out.println(inttt);
            System.out.println(bitcoinAdressData.getFinal_balance());
            System.out.println(bitcoinAdressData.getTotalreceived());
            System.out.println(bitcoinAdressData.getTotalsent());
        } catch (IOException e) {
            e.printStackTrace();
        }


/*

        BitcoinStatsService bitcoinStatsService = null;
        try {
            bitcoinStatsService = new BitcoinStatsService();
        } catch (IOException e) {
            e.printStackTrace();
        }
        long out = bitcoinStatsService.gethashrate();
    System.out.println(out);
       /* try {
            BitcoinChartService bitcoinChartService = new BitcoinChartService();
            List<Integer> list = new ArrayList<Integer>();
            list = bitcoinChartService.getx();
            for (int x:
                 list) {
                System.out.println(x);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

*/
    }

    }

