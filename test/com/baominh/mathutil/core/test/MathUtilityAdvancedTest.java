/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.baominh.mathutil.core.test;

import com.baominh.mathutil.core.MathUtility;
import org.junit.Assert;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

/**
 *
 * @author HaPhanBaoMinh
 */
@RunWith(value = Parameterized.class)
public class MathUtilityAdvancedTest {

    // Chuẩn bị data là mảng 2 chiều kiểu Object
    // Junit tự loop qua mảng để lôi, tách data ra, vè giúp ta nhồn, fill vào hàm asertEquals()
    @Parameterized.Parameters
    public static Object[][] initData() {
        Object[][] b = {
            {0, 1},
            {1, 1},
            {2, 2},
        };
        return b;
    }
    
    @Parameterized.Parameter(value = 1) //em thích cột 0
    // map từ cột của từng dùng vào 2 biến tương ứng 
    public long expected;
    
    @Parameterized.Parameter(value = 0) //em thích cột 0
    // map từ cột của từng dùng vào 2 biến tương ứng 
    public int n;

    
    //So sánh expected và actual
    @Test
    public void TestFactorialGivenRightArgumentReturnWell(){
        Assert.assertEquals(expected, MathUtility.getFactorial(n));
    }
}
