package com.profitscanner.web.client

import com.profitscanner.DivEvent
import com.profitscanner.web.WebConst
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service
import org.springframework.web.client.RestOperations
import java.util.*


@Service
class AlphaVantageClient {

    @Autowired
    private lateinit var restClient: RestOperations


    fun stockHistory(symbol: String): StockHistory =
           restClient.getForEntity(WebConst.SERVER_URL_DEMO, StockHistory::class.java).body?.apply {
               this.ticker = symbol
           } ?: StockHistory()

   fun createDivEventList(ticker: String): List<DivEvent> {
       val stockHistory = stockHistory(ticker)
       return stockHistory(ticker).data.map { DivEvent(date = it.key, ticker = stockHistory.ticker, divAmount = it.value.divAmount, stockPrice = it.value.close) }
               .toList()
   }
}