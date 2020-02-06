package Controllers;

import Model.BitcoinConverter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/converter")
public class ConverterServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.sendRedirect("converter.jsp");
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String currency = req.getParameter("currency");
        String value = req.getParameter("value");

        Integer valueint = Integer.parseInt(value);
        BitcoinConverter bitcoinConverter = new BitcoinConverter("USD",30);
        String outputconverter = bitcoinConverter.convert();
        req.setAttribute("outputconverter",outputconverter);
    }
}
