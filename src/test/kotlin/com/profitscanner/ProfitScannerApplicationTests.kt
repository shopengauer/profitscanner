package com.profitscanner

import com.profitscanner.web.WebConst
import com.profitscanner.web.client.AlphaVantageService
import com.profitscanner.web.client.StockHistory
import org.junit.Test
import org.junit.runner.RunWith
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.test.context.junit4.SpringRunner
import org.springframework.web.client.RestOperations

@RunWith(SpringRunner::class)
@SpringBootTest
class ProfitScannerApplicationTests {


    @Autowired
    private lateinit var alphaVantageService: AlphaVantageService
    @Autowired
    private lateinit var restClient: RestOperations



    @Test
    fun contextLoads() {


      // val stockHistory = restTemplate.getForEntity(WebConst.SERVER_URL_DEMO, StockHistory::class.java, WebConst.FUNCTION_DAILY_ADJUSTED, WebConst.COMPACT_SIZE, "MSFT", WebConst.API_KEY)
       val stockHistory = restClient.getForEntity(WebConst.SERVER_URL_DEMO, StockHistory::class.java  )
       println()
    }

    @Test
    fun advantage() {
      val map = alphaVantageService.stockHistory("ET")
        println()
    }
}
