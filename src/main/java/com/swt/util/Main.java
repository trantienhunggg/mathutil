package com.swt.util;

import com.swt.util.mathutil.core.MathUtility;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
         verifyFactoraialGivenRightArgRunWell();
        verifyFactoraialGivenRightArg1RunWell();
        verifyFactoraialGivenRightArg2RunWell();
        verifyFactoraialGivenRightArgsRunWell();
    }
    //TEST thu ham tinh giai thua, goi trong main()
        // muon test gi do phai co test case
        // TEST CASE #1 : verify the getfactoraial() with n=0
        // steps:
        // given N = 0
        // call getfactoraial(n=0)
        // expected resul:
        // the method must return 1 as the result of 0! = 1
        // status : passed|Failed

    public static void verifyFactoraialGivenRightArgRunWell() {
        int n= 0;
        long expected =1;
        long actual = MathUtility.getFactorial(n);
        System.out.println("0! = expected: "+expected+", actual: "+actual);

    }
    // TEST CASE #2 : verify the getfactoraial() with n=1
    public static void verifyFactoraialGivenRightArg1RunWell() {
        int n= 1;
        long expected =1; // hy vọng 1 được trả về 1;
        long actual = MathUtility.getFactorial(n);
        System.out.println("1! = expected: "+expected+", actual: "+actual);

    }
    // TEST CASE #3: verify the getfactoraial() with n=2
    public static void verifyFactoraialGivenRightArg2RunWell() {
        int n= 2;
        long expected =2;
        long actual = MathUtility.getFactorial(n);
        System.out.println("2! = expected: "+expected+", actual: "+actual);

    }

    // TEST CASE #4,5,6: verify the getfactoraial() with n=4,5,6
    public static void verifyFactoraialGivenRightArgsRunWell() {


        System.out.println("3! = expected: 6 "+", actual: "+MathUtility.getFactorial(3));
        System.out.println("4! = expected: 24 "+", actual: "+MathUtility.getFactorial(4));
        System.out.println("5! = expected: 120 "+", actual: "+MathUtility.getFactorial(5));
        System.out.println("6! = expected: 720 "+", actual: "+MathUtility.getFactorial(6));

    }
}
// ky thuat vua go code vua go test case, vua go test run duoc goi la TDD (dua vao CV) test driven development