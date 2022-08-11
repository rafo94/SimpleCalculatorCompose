package com.rafo.simplecalculatorcompose

/**
 * Created by Rafik Gasparyan on 08/11/22
 */
data class CalculatorState(
    val number1: String = "",
    val number2: String = "",
    val operation: CalculatorOperation? = null
) {
}