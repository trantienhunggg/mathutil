package com.swt.util.mathutil.core;

public class MathUtility {
    // class này dùng để cung cấp các hàm toán học trong class math, trong JDK
    // vì những tính toán này, tính xog rồi trả ra, không cần lưu trữ lại
    // do đó ta thiết kế nó dạng static
    // tính N!
    // 0!= 1
    // không giai thừa âm
    //20 vừa đủ long 21! không dùng được
    public static long getFactorial (int n){
        if(n <0 || n>20){
            throw new IllegalArgumentException("n must be between 0 and 20");
            // đưa data n cà chớn, ném ra ngoại lệ, ném câu thông báo, không có giá trị trả về
        }
        if(n==0){
            return 1;
        }
        //cpu chạy được đến đây tức là n = 1,2,3,.....20
        //tính n! = 1.2.3.4.5..... thuật toán con heo đất, ốc bu nhồi thịt, cộng dồn tích lũy
        long result = 1;
        for(int i=1;i<=n;i++){
            result *= i; //i =1 nhân 1, i=2 nhân 2, i= 3 nhân3
        }


        return result;
    }
}
