package com.profitscanner.web

object WebConst {

    const val API_KEY = "XCV1XX716R7YTPJC"
    const val SERVER_URL = "https:/www.alphavantage.co/query?function={function}&outputsize={size}&symbol={ticker}&apikey={key}"
    const val SERVER_URL_DEMO = "https://www.alphavantage.co/query?function=TIME_SERIES_DAILY_ADJUSTED&symbol=ET&apikey=XCV1XX716R7YTPJC"
    const val FUNCTION_DAILY_ADJUSTED= "TIME_SERIES_DAILY_ADJUSTED"
    const val FULL_SIZE = "full"
    const val COMPACT_SIZE = "compact"


}