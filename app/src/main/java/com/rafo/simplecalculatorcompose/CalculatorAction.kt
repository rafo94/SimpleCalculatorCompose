package com.rafo.simplecalculatorcompose

/**
 * Created by Rafik Gasparyan on 08/11/22
 */
sealed class CalculatorAction {
    data class Number(val number: Int) : CalculatorAction()
    object Clear : CalculatorAction()
    object Delete : CalculatorAction()
    object Decimal : CalculatorAction()
    object Calculate : CalculatorAction()
    data class Operation(val operation: CalculatorOperation) : CalculatorAction()
}