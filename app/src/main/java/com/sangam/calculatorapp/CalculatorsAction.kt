package com.sangam.calculatorapp

sealed class CalculatorsAction {
    data class Number(val number: Int) : CalculatorsAction()
    object Clear : CalculatorsAction()
    object Delete : CalculatorsAction()
    object Decimal : CalculatorsAction()
    object Calculate : CalculatorsAction()
    data class Operation(val operation: CalculatorOperation) : CalculatorsAction()

}
