package com.profitscanner

import java.math.BigDecimal
import java.util.*

data class DivEvent(
        val ticker: String,
        val date: Date,
        val divAmount: BigDecimal
)