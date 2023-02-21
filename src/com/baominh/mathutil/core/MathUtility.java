/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.baominh.mathutil.core;

/**
 *
 * @author HaPhanBaoMinh
 */
public class MathUtility {

    public static final double PI = 3.145;

    // 21! vượt kiểu long 
    // ta thí nghiệm hàm n! với n - 0 ... 20 -> đủ kiểu long
    // n! = 1 x 2 X 3 X ... n
    // không có giai thừa âm
    // 21! tràn long, do đó n chỉ áp dụng 0 . . . 20
    // 0!= 1! quy ước 0! = 1
    public static long getFactorial(int n) {
        if(n > 20 || n < 0) throw new IllegalArgumentException("Invalid n, n must be between 0...20!");
        if(n == 0 || n ==1) return 1;
        
        // n = 1 ... 20
        // 1. For ...
        // 2. Đệ quy
        long product = 1;
        for (int i = 2; i < n; i++) {
            product *= i;
        }
        
        return product;
    }
}
