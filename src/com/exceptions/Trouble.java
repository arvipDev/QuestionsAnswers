package com.exceptions;

public class Trouble{
    public int calculate (int number) throws NumericalException{
        if (number <= 10)
            throw new NumericalException("Number is not bigger than 10");
        else return number - 10;
    }

}
