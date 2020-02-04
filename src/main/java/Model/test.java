package Model;

import java.io.IOException;

public class test {
    public static void main(String[] args) throws IOException {
        BitcoinConverter bitcoinConverter = new BitcoinConverter();
        String str=bitcoinConverter.convert("USD",500);

        System.out.println(str);
    }
}
