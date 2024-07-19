package com.srini.myapplication

import junit.framework.TestCase.assertEquals
import junit.framework.TestCase.assertFalse
import junit.framework.TestCase.assertTrue
import org.junit.Before
import org.junit.Test

class UserValidatorTest{
    private lateinit var validator: UserValidator

    @Before
    fun setUp(){

        validator=UserValidator()
    }

    @Test
    fun validateSumwithSuccess(){
        val result=validator.validateSum(10,5,15)
        assertTrue(result)
    }

    @Test
    fun validateSumwithFail(){
        val result=validator.validateSum(10,5,13)
        assertFalse(result)
    }
}