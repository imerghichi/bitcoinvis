package Controllers;

import Model.BitcoinAdressData;
import Model.BitcoinAdressDatamin;
import Model.BitcoinConverter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet
public class BitcoinAdressDataServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        PrintWriter printWriter = resp.getWriter();
        resp.setContentType("text/html");
        String adress =req.getParameter("adress");
        BitcoinAdressData bitcoinAdressDatamin = new BitcoinAdressData(adress);
        printWriter.println("total sent"+bitcoinAdressDatamin.getTotalsent());
        printWriter.println("total received"+bitcoinAdressDatamin.getTotalreceived());
        printWriter.println("final balance"+bitcoinAdressDatamin.getFinal_balance());

        printWriter.close();
    }
}
