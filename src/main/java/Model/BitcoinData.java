package Model;

import java.util.Date;

public class BitcoinData {
    private Date date;
    private float price;

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public BitcoinData(Date date, float price) {
        this.date = date;
        this.price = price;
    }

    public BitcoinData() {
    }

    @Override
    public String toString() {
        return "BitcoinData{" +
                "date=" + date +
                ", price=" + price +
                '}';
    }
}
