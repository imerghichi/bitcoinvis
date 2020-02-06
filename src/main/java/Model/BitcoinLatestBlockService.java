package Model;

import org.json.JSONObject;

import java.io.IOException;

public class BitcoinLatestBlockService extends BitcoinLatestblock {
   private BitcoinLatestblock bitcoinLatestblock =  new BitcoinLatestblock();
    private JSONObject jsonObject = this.bitcoinLatestblock.getDataJSON();

    public BitcoinLatestBlockService() throws IOException {
    }
    public String gethash(){
        return this.jsonObject.getString("hash");
    }
    public String gettime(){
        long lo =  this.jsonObject.getLong("time");
        TimetoDate ttd = new TimetoDate(lo);
        return ttd.converttimetostr();
    }
    public long getIndex(){
        return this.jsonObject.getLong("block_index");
    }
    public long get_height(){
        return this.jsonObject.getLong("height");
    }


}
