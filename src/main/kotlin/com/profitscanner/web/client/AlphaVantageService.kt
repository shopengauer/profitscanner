package com.profitscanner.web.client

import com.profitscanner.web.WebConst
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service
import org.springframework.web.client.RestOperations
import java.util.*


@Service
class AlphaVantageService {

    @Autowired
    private lateinit var restClient: RestOperations


   fun stockHistory(ticker: String): Map<Date, StockHistoryEntry>  =
           restClient.getForEntity(WebConst.SERVER_URL_DEMO, StockHistory::class.java).body?.data ?: mapOf()

   fun stocksHistory(ticker: List<String>): Map<Date, StockHistoryEntry>  =
           restClient.getForEntity(WebConst.SERVER_URL_DEMO, StockHistory::class.java).body?.data ?: mapOf()




}