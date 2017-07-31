/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import org.junit.Test;

import Calc.Calc;
import static org.junit.Assert.*;



public class CalcTest {

    private double EPSILON = 1e-15;

    @Test
    public void basicTest() {
        Calc c = new Calc();
        c.push(2.0);
        c.push(2.0);
        c.add();
        assertEquals(4.0, c.pop(), EPSILON);
    }

    @Test
    public void exprTest() {
        Calc c = new Calc();
        c.push(2.0);
        c.push(3.0);
        c.multiply();
        c.push(4.0);
        c.push(5.0);
        c.multiply();
        c.add();
        assertEquals(26.0, c.pop(), EPSILON);
    }

    @Test
    public void pushDepthTest() {
        Calc c = new Calc();
        c.push(5.0);
        assertEquals(1, c.depth());
        c.push(6.0);
        assertEquals(2, c.depth());
        c.push(-10.0);
        assertEquals(3, c.depth());
    }

    @Test(expected=Exception.class)
    public void emptyPopTest() {
        Calc c = new Calc();
        c.pop();
    }

    @Test(expected=Exception.class)
    public void tooManyPopTest() {
        Calc c = new Calc();
        c.push(3.0);
        c.push(4.0);
        c.add();
        c.pop();
        c.pop();
    }

    @Test(expected=Exception.class)
    public void tooManyPushTest() {
        Calc c = new Calc();
        for(int i = 0; i < 1e6; i++)
            c.push(100.0);
    }

    @Test(expected=Exception.class)
    public void nopeekTest() {
        Calc c = new Calc();
        double v = c.peek();
    }

    @Test
    public void peekTest() {
        Calc c = new Calc();
        c.push(2.0);
        assertEquals(2.0, c.peek(), EPSILON);
        c.push(3.0);
        assertEquals(3.0, c.peek(), EPSILON);
        c.multiply();
        assertEquals(6.0, c.peek(), EPSILON);
        c.push(4.0);
        assertEquals(4.0, c.peek(), EPSILON);
        c.push(5.0);
        assertEquals(5.0, c.peek(), EPSILON);
        c.multiply();
        assertEquals(20.0, c.peek(), EPSILON);
        c.add();        
        assertEquals(26.0, c.peek(), EPSILON);
    }

    @Test(expected=Exception.class)
    public void underflowAddTest() {
        Calc c = new Calc();
        c.push(2.0);
        c.add();
    }


    @Test
    public void singleSubtractTest() {
        Calc c = new Calc();
        c.push(2.0);
        c.push(-10.0);
        c.subtract();
        assertEquals(12.0, c.pop(), EPSILON);
    }

    @Test
    public void doubleMultiplyTest() {
        Calc c = new Calc();
        c.push(-1.0);
        c.push(37.0);
        c.push(10.0);
        c.multiply();
        c.multiply();
        assertEquals(-370.0, c.pop(), EPSILON);
                }
    @Test
    public void doubleDivideTest() {
        Calc c = new Calc();
        c.push(25.0);
        c.push(50.0);
        c.push(2.0);
        c.divide();
        c.divide();
        assertEquals(1.0, c.pop(),EPSILON);
                
    }
}
