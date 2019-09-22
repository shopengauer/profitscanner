package com.profitscanner.web.client

import com.fasterxml.jackson.annotation.JsonIgnore
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.annotation.JsonSetter
import java.math.BigDecimal
import java.util.*

class StockHistoryEntry(
        @JsonProperty(value = "1. open")
        var open: BigDecimal = BigDecimal.ZERO,
        @JsonProperty(value = "2. high")
        var high: BigDecimal = BigDecimal.ZERO,
        @JsonProperty(value = "3. low")
        var low: BigDecimal = BigDecimal.ZERO,
        @JsonProperty(value = "4. close")
        var close: BigDecimal = BigDecimal.ZERO,
        @JsonProperty(value = "6. volume")
        var volume: BigDecimal = BigDecimal.ZERO,
        @JsonProperty(value = "7. dividend amount")
        var divAmount: BigDecimal = BigDecimal.ZERO
)

class StockHistory(
        @JsonIgnore
        var ticker: String = "",
        @JsonSetter(value = "Time Series (Daily)")
        val data: Map<Date, StockHistoryEntry> = mutableMapOf()
)


