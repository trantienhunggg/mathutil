package com.swt.util.mathutil.core;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MathUtilityTest {

    @Test // @test tương đương hàm MAIN(), code trong hàm này sẽ run như hàm mani()
    // biến mỗi test case thành test run, thành main() để chạy
    public void verifyFactoraialGivenRightArgRunWell() {
        //0! có là 1 hay không
        assertEquals(1,MathUtility.getFactorial(0));
    }

    @Test
    public void verifyFactoraialGivenRightArg2RunWell() {
        //1! có là 1 hay không
        assertEquals(1,MathUtility.getFactorial(1));
    }
    @Test
    public void verifyFactoraialGivenRightArg3RunWell() {
        assertEquals(2,MathUtility.getFactorial(2));
    }
    @Test
    public void verifyFactoraialGivenRightArg4RunWell() {
        assertEquals(6,MathUtility.getFactorial(3));
    }



}