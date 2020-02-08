package Controllers;

import Model.BitcoinAdressData;



import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;


@WebServlet
public class BitcoinAdressDataServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        resp.setContentType("text/html");
        String adress =req.getParameter("adress");
        BitcoinAdressData bitcoinAdressDatamin = new BitcoinAdressData(adress);
        req.setAttribute("total sent",bitcoinAdressDatamin.getTotalsent());
        req.setAttribute("total received",bitcoinAdressDatamin.getTotalreceived());
        req.setAttribute("final balance",bitcoinAdressDatamin.getFinal_balance());
        req.setAttribute("hash", bitcoinAdressDatamin.getHash());
        req.setAttribute("n_tx", bitcoinAdressDatamin.getn_txt());
    }
}
