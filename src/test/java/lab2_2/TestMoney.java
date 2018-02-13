package lab2_2;

import static org.junit.Assert.assertEquals;

import pl.com.bottega.ecommerce.sharedkernel.Money;

public class TestMoney {

    @org.junit.Test
    public void addPositiveToPositive() {
        Money money = new Money(5);
        Money money2 = new Money(5);
        Money expect = new Money(10);
        Money result = money.add(money2);
        assertEquals(result, expect);
    }

    @org.junit.Test
    public void addNegativeToPositive() {
        Money money = new Money(10);
        Money money2 = new Money(-5);
        Money expect = new Money(5);
        Money result = money.add(money2);
        assertEquals(result, expect);
    }

    @org.junit.Test
    public void addNegativeToNegative() {
        Money money = new Money(-5);
        Money money2 = new Money(-5);
        Money expect = new Money(-10);
        Money result = money.add(money2);
        assertEquals(result, expect);
    }

    @org.junit.Test
    public void subPositiveFromPositive() {
        Money money = new Money(10);
        Money money2 = new Money(5);
        Money expect = new Money(5);
        Money result = money.subtract(money2);
        assertEquals(result, expect);
    }

    @org.junit.Test
    public void subPositiveFromNegative() {
        Money money = new Money(5);
        Money money2 = new Money(-5);
        Money expect = new Money(10);
        Money result = money.subtract(money2);
        assertEquals(result, expect);
    }

    @org.junit.Test
    public void subNegativeFromNegative() {
        Money money = new Money(-10);
        Money money2 = new Money(-5);
        Money expect = new Money(-5);
        Money result = money.subtract(money2);
        assertEquals(result, expect);
    }

    @org.junit.Test
    public void multPositiveByPositive() {
        Money money = new Money(5);
        Money expect = new Money(30);
        Money result = money.multiplyBy(6);
        assertEquals(result, expect);
    }

    @org.junit.Test
    public void multPositiveByNegative() {
        Money money = new Money(20);
        Money expect = new Money(-40);
        Money result = money.multiplyBy(-2);
        assertEquals(result, expect);
    }

    @org.junit.Test
    public void multPozitiveByZero() {
        Money money = new Money(5);
        Money expect = new Money(0);
        Money result = money.multiplyBy(0);
        assertEquals(result, expect);
    }

    @org.junit.Test
    public void multNegativeByZero() {
        Money money = new Money(5);
        Money expect = new Money(0);
        Money result = money.multiplyBy(0);
        assertEquals(result, expect);
    }

}
