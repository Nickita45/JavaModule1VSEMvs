package com.module2.FactoryBuilder;

import java.util.Objects;

public class MyInteger {
    private int value;

    public MyInteger(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MyInteger myInteger = (MyInteger) o;
        return value == myInteger.value;
    }

    @Override
    public int hashCode() {
        return Objects.hash(value);
    }

    @Override
    public String toString() {
        return "MyInteger{" +
                "value=" + value +
                '}';
    }
    public static boolean isPrime(int num)
    {

        if (num == 1 || num == 2)
        {
            return true;
        }
        else
        {
            for (int i = 2; i < num; i++) {
                if (num % i == 0) return false;
            }
        }
        return true;
    }
    public boolean isPrime()
    {
        return isPrime(getValue());
    }
}
