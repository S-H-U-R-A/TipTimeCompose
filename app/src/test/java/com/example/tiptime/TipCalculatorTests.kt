package com.example.tiptime

import org.junit.Assert.assertEquals
import org.junit.Test
import java.text.NumberFormat

class TipCalculatorTests {

    @Test
    fun calculateTip_20PercentNoRoundup(){
        //GIVEN -> Dado un precio de 10.0 y un porcentaje de propina del 20%
        val amount: Double = 10.0
        val tipPercent: Double = 20.00
        //WHEN -> Cuando se calcula la propina sin redondeo
        val expectedTip = NumberFormat.getCurrencyInstance().format(2.00) //-> 2.00 valor esperado
        val actualTip = calculateTip(amount, tipPercent, roundUp = false) //-> 2.00 valor calculado
        //THEN -> Entonces el resultado es 2.00
        assertEquals(expectedTip, actualTip)

    }



}