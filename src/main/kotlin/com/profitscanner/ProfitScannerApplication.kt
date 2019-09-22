package com.profitscanner

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class ProfitScannerApplication

fun main(args: Array<String>) {
    runApplication<ProfitScannerApplication>(*args)
}
