package Controllers;

import Model.BitcoinAdressData;
import Model.BitcoinStatsService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet
public class BitcoinStatsServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        PrintWriter printWriter = resp.getWriter();
        resp.setContentType("text/html");
        BitcoinStatsService bitcoinStatsService = new BitcoinStatsService();
        printWriter.println("Total BC: "+bitcoinStatsService.get_totalbc());
        printWriter.println("miner revenue: "+bitcoinStatsService.getminers_revenue_btc());
        printWriter.println("total number of blocks"+bitcoinStatsService.getn_blocks_total());
        printWriter.println("minutes between blocks"+bitcoinStatsService.getminutes_btween_blocks());
        printWriter.println("total fees BTC"+bitcoinStatsService.get_total_fees_btc());
        req.setAttribute("total", bitcoinStatsService.get_total_fees_btc());
        printWriter.close();
    }
}
