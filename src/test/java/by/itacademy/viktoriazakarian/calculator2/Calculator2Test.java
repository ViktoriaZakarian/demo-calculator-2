package by.itacademy.viktoriazakarian.calculator2;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Calculator2Test {

    @Test
    public void testSum1(){
        Assertions.assertEquals(3.6, new Calculator2().sum(2.3,1.3), 0.01);
    }
}
