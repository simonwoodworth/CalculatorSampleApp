package com.example.demo;

import com.example.demo.Models.Calculator;
import static junit.framework.Assert.*;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class CalculatorSampleAppApplicationTests {
        
        @Test
        public void calcAdd() {
            Calculator c = new Calculator(2, 3, "+"); //Arrange
            double result = c.calculateResult(); //Act
            assertEquals(5.0, result, 0.000001); //Assert
        }
        
        @Test
        public void calcAddParameterised() {
            Calculator c = new Calculator(2, 3, "+"); //Arrange
            double result = c.calculateResult(); //Act
            assertEquals(5.0, result, 0.000001); //Assert
        }
        
        @Test
        public void calcMultiply() {
            Calculator c = new Calculator(2, 3, "*"); //Arrange
            double result = c.calculateResult(); //Act
            assertEquals(6.0, result, 0.000001); //Assert
        }
        
        @Test
        public void calcSubtract() {
            Calculator c = new Calculator(2, 3, "-"); //Arrange
            double result = c.calculateResult(); //Act
            assertEquals(-1.0, result, 0.000001); //Assert
        }
        
         @Test
        public void calcDivide() {
            Calculator c = new Calculator(2, 3, "/"); //Arrange
            double result = c.calculateResult(); //Act
            assertEquals(0.666666, result, 0.000001); //Assert
        }
        
        @Test
        public void calcPower() {
            Calculator c = new Calculator(2, 3, "^"); //Arrange
            double result = c.calculateResult(); //Act
            assertEquals(8.0, result, 0.000001); //Assert
        }
        
        @Test
        public void calcModulo() {
            Calculator c = new Calculator(7, 3, "%"); //Arrange
            double result = c.calculateResult(); //Act
            assertEquals(1.0, result, 0.000001); //Assert
        }
        
        @Test
        public void calcCube() {
            Calculator c = new Calculator(5, 0, "3"); //Arrange
            double result = c.calculateResult(); //Act
            assertEquals(125.0, result, 0.000001); //Assert
        }

}
