package Model;

import org.json.JSONObject;

import java.io.IOException;

public class BitcoinStatsService extends BitcoinStats {
    private BitcoinStats bitcoinStats = new BitcoinStats();
    private JSONObject jsonObject = this.bitcoinStats.getDataJSON();

    public BitcoinStatsService() throws IOException {
    }
    public long getmarket_price_usd(){
        return  this.jsonObject.getLong("market_price_usd");

    }
    public long gethashrate(){
        return this.jsonObject.getLong("hash_rate");

    }
    public long get_total_fees_btc(){
        return  this.jsonObject.getLong("total_fees_btc");

    }
    public int getn_btc_mined(){
         return this.jsonObject.getInt("n_btc_mined");

    }
    public int getn_tx(){
        return this.jsonObject.getInt("n_tx");

    }
    public long getn_block_mined(){
        return this.jsonObject.getLong("n_block_mined");

    }   public long getminutes_btween_blocks(){
        return this.jsonObject.getLong("minutes_between_blocks");
    }
    public long get_totalbc(){
        return  this.jsonObject.getLong("totalbc");
    }
    public long getn_blocks_total(){
        return this.jsonObject.getLong("n_block_total");

    }   public long get_estimated_transaction_volume_usd(){
        return this.jsonObject.getLong("estimated_transaction_volume_usd");

    }   public long get_block_size(){
        return this.jsonObject.getLong("blocks_size");

    }
    public long get_miners_revenue_usd(){
        return  this.jsonObject.getLong("miners_revenue_usd");

    } public long getnextretarget(){
        return this.jsonObject.getLong("nextretarget");

    } public long getdiffuculty(){
        return this.jsonObject.getLong("difficulty");
    }
    public long getestimated_btc_sent(){
       return this.jsonObject.getLong("estimated_btc_sent");

    } public int getminers_revenue_btc(){
        return this.jsonObject.getInt("miners_revenue_btc");

    } public long gettotal_btc_sent(){
        return this.jsonObject.getLong("total_btc_sent");

    } public long gettrade_volume_btc(){
        return this.jsonObject.getLong("trade_volume_btc");
    }
    public long gettrade_volume_usd(){
        return this.jsonObject.getLong("trade_volume_usd");

    }


}
