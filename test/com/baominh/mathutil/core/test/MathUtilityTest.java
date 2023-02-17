package com.baominh.mathutil.core.test;

import com.baominh.mathutil.core.MathUtility;
import org.junit.Assert;
import org.junit.Test;

public class MathUtilityTest {
    // Ta sẽ viết hàm test code, các tình huống test để kiểm tra hàm getF chạy đúng hay không
    // nếu ta đưa n vào đúng

    @Test
    public void testFactorialGivenRightArgumentReturnsWell() {
        
        // Ta sẽ test tiếp với n cà chớn vd: n > 20 hoặc n < 0
        // Thiết kế của hàm getF như sau
        // Nếu n...20 thì hàm getF() phải tính ngon
        // Nếu đưa n cà chớn thì ha,f getF() nó chửi, nó ném ra ngoại lệ, argument excetion,
        // n=-5 expected ngoại lệ
        // JUNIT 4 không có hàm assertEquals() cho exception
        // Dùng chiêu đc cung cấp bởi JUNIT 4, không phải assertE()
        // Để do lòng xem có exception ra hay không
        
        
        // Test case #1: test getF() n = 0
        // Expected: 1
        int n = 0;
        long expected = 1; // Hi vọng 0! == 1

        Assert.assertEquals(expected, MathUtility.getFactorial(n));
        // Màu xanh nếu 2 thằng bằng nhau, ngược lại thì màu đỏ.

        // Test case #2 test getF() n = 1
        // Expected: 1
        n = 1;
        expected = 1;
        Assert.assertEquals(expected, MathUtility.getFactorial(n));
        // Màu xanh nếu 2 thằng bằng nhau, ngược lại thì màu đỏ.

        // Test case 3: Test getF() n = 2
        // Expected: 2 Hi vọng 2! = 1
        n = 2;
        expected = 2;
        Assert.assertEquals(expected, MathUtility.getFactorial(n));
        // Màu xanh nếu 2 thằng bằng nhau, ngược lại thì màu đỏ.
        
        // Test case 4: Test getF() n = 3
        // Expected: 6 Hi vọng 3! = 6
        n = 3;
        expected = 6;
        Assert.assertEquals(expected, MathUtility.getFactorial(n));
        // Màu xanh nếu 2 thằng bằng nhau, ngược lại thì màu đỏ.
        
        // Test case 5: Test getF() n = 5
        // Expected: 120 Hi vọng 5! = 120
        n = 5;
        expected = 120;
        Assert.assertEquals(expected, MathUtility.getFactorial(n));
        // Màu xanh nếu 2 thằng bằng nhau, ngược lại thì màu đỏ.
    }
    
    @Test (expected = Exception.class)
    public void testFactorialGivenWrongArgumentThrowsException (){
        MathUtility.getFactorial(-5);
    }
}
