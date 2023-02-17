/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.baominh.mathutil.main;

import com.baominh.mathutil.core.MathUtility;

/**
 *
 * @author HaPhanBaoMinh
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        testFactorialGivenRightArgumentReturnRunWell();
        testFactorialGivenWrongArgumentReturnException();
    }

    // Kiểm thử xem hàm getF() có được viết dúng như thiết kế hay không
    // Thiết kế n tử tế từ n...20 phải tính n! đúng như kì vọng
    // Khi đưa n cà chớn < 0 hoặc > 20 chửi
    // Ta phải giả lập các cách sài của user hay của ai đó khác,
    // Cách sài là đưa giá trị vào hàm và so sánh giá trị
    // Mỗi cách sài hàm ứng với mỗi n thì hàm sẽ chạy với n đó, mỗi cách sài hàm ta gọi là 1 test case
    // Quy tắc đặt tên hàm con lạc đà 
    // Tên Hàm mang luôn ý nghĩa, mục đích
    public static void testFactorialGivenRightArgumentReturnRunWell() {

        // Test case #1: Test getF with n = 0;
        // Expected value: 1
        // Vietsub: Kiểm tra thử getF() với 0 tức là tính 0! coi có trả về 1 hem?
        int n = 0;
        long expectedvalue = 1;
        long actualValue = MathUtility.getFactorial(n);
        // Kiểm thử là so sanhs expected vs actual
        System.out.println("Test " + n + "!: Expected: " + expectedvalue + " | Actual: " + actualValue);

        // Test case #2: Test getF with n = 1
        // Expected value: 1
        // Vietsub: Kiểm tra thử getF() với 1 tức là tính 1! coi có trả về 1 hem?
        n = 1;
        expectedvalue = 1;
        actualValue = MathUtility.getFactorial(n);
        System.out.println("Test " + n + "!: Expected: " + expectedvalue + " | Actual: " + actualValue);

        // Test case #2: Test getF with n = 2
        // Expected value: 2
        // Vietsub: Kiểm tra thử getF() với 2 tức là tính 2! coi có trả về 2 hem?
        n = 2;
        expectedvalue = 2;
        actualValue = MathUtility.getFactorial(n);
        System.out.println("Test " + n + "!: Expected: " + expectedvalue + " | Actual: " + actualValue);

    }

    public static void testFactorialGivenWrongArgumentReturnException() {
        // Test case #2: Test getF with n = -1
        // Expected value: Thrroww
        // Vietsub: Kiểm tra thử getF() với 2 tức là tính 2! coi có trả về 2 hem?
        int n = -1;
        System.out.println("Test " + n + "!: Expected: " + "An Illegal Argument" + " | Actual: ???");
        MathUtility.getFactorial(n);
    }
}
