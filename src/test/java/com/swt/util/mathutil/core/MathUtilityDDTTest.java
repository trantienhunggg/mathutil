package com.swt.util.mathutil.core;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

import static org.junit.jupiter.api.Assertions.*;

class MathUtilityDDTTest {

    // chuảna bị bộ data bỏ riêng DD- data driven
    // Lát hồi hồi fill vào so sánh T - testing
    // fill vào qua tham số hàm - hàm làm việc với nhiều data
    // DDT còn goi là PARAMETERZIED TESTING -> kiểm thử theo hàm số hóa

    // bộ data: nằm trong hàm STATIC - tĩnh 1 chỗ để các nơi vào lấy
    // bộ data thường là giá trị 2 chiều - giá trị kì vọng và giá trị thực tế

    public static Object[][] initData(){
        return new Object[][]{{0,1},
                              {1,1},
                              {2,2},
                              {3,6},
                              {4,24},
                              {5,120},
                              {6,720}};
                            // n , expected


    }


    @ParameterizedTest
    @MethodSource("initData")
    public void testFactorialGivenRightArgsRunWell(int n, long expected){
        assertEquals(expected,MathUtility.getFactorial(n));
    }






}