package com.jabaddon.practices.junit.parameterized

import org.junit.runner.RunWith
import org.junit.runners.Parameterized 
import org.junit.runners.Parameterized.Parameters
import org.junit.Test

import static org.junit.Assert.*
           
@RunWith(Parameterized.class)
class ParameterizedExampleTest {

    Long expected
    Long value1
    Long value2

    ParameterizedExampleTest(Long expected, Long value1, Long value2) {
        this.expected = expected
        this.value1 = value1
        this.value2 = value2
    }

    @Parameters
    static Collection<Long[]> data() {
        return [[2L, 1L, 1L] as Long[], [4L, 2L, 2L] as Long[]]
    }
                         
    @Test
    void testSum() {
        assertEquals(this.expected, value1 + value2);
    }
}