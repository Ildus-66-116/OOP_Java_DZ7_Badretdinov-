package org.example.model;

import org.example.view.Text;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

public class Functions implements Calculate {

    @Override
    public String sum(ArrayList<Number> list) {
        Number numA = list.get(0);
        Number numB = list.get(1);
        double result = 0;
        result = numA.doubleValue() + numB.doubleValue();
        return numA + " + " + numB + " = " +  result;
    }

    @Override
    public String subtraction(ArrayList<Number> list) {
        Number numA = list.get(0);
        Number numB = list.get(1);
        double result = 0;
        result = numA.doubleValue() - numB.doubleValue();
        return numA + " - " + numB + " = " + result;
    }

    @Override
    public String division(ArrayList<Number> list) {
        Number numA = list.get(0);
        Number numB = list.get(1);
        double result = 0;
        result = numA.doubleValue() / numB.doubleValue();
        return numA + " / " + numB + " = " + result;
    }

    @Override
    public String multiplication(ArrayList<Number> list) {
        Number numA = list.get(0);
        Number numB = list.get(1);
        double result = 0;
        result = numA.doubleValue() * numB.doubleValue();
        return numA + " * " + numB + " = " + result;
    }
}
