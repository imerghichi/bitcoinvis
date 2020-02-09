package Controllers;

import Model.BitcoinStatsService;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class BitcoinLatestBlockServlet extends HttpServlet {


    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        BitcoinStatsService bitcoinStatsService =new BitcoinStatsService();
        req.setAttribute("total fees btc", bitcoinStatsService.get_total_fees_btc());
        req.setAttribute("total bc",bitcoinStatsService.get_totalbc());
        req.setAttribute("miners revenue btc",bitcoinStatsService.getminers_revenue_btc());
        req.setAttribute("minutes between blocks", bitcoinStatsService.getminutes_btween_blocks());
        req.setAttribute("block size", bitcoinStatsService.get_block_size());
        req.setAttribute("n blocks total", bitcoinStatsService.getn_blocks_total());
        req.setAttribute("difficulty", bitcoinStatsService.getdiffuculty());
    }
}
