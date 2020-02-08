package Controllers;

import Model.BitcoinConverter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet
public class ConverterServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        PrintWriter printWriter = resp.getWriter();
        resp.setContentType("text/html");
        int value = Integer.parseInt(req.getParameter("value"));
        String currency = req.getParameter("currency");
        BitcoinConverter bitcoinConverter = new BitcoinConverter(currency,value);
        req.setAttribute("converter",bitcoinConverter.convert());
    }
}
