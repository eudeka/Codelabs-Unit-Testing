package com.acd.unittest

import org.junit.Assert.*
import org.junit.Before
import org.junit.Test

class BangunRuangUtilsTest{
    private lateinit var bangunRuang : BangunRuangUtils

    @Before
    fun setup() {
        bangunRuang = BangunRuangUtils()
    }

    @Test
    fun testHitungVolumeBalok() {
        val hasil = bangunRuang.hitungVolumeBalok(5, 5, 5)
        assertEquals(125, hasil)
    }
}