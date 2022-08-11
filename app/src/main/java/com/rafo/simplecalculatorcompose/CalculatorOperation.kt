package com.rafo.simplecalculatorcompose

/**
 * Created by Rafik Gasparyan on 08/11/22
 */
sealed class CalculatorOperation(val symbol: String) {
    object Add : CalculatorOperation("+")
    object Subtract : CalculatorOperation("-")
    object Multiply : CalculatorOperation("x")
    object Divide : CalculatorOperation("/")
}