package org.example.Service;

import org.example.model.Calculate;
import org.example.model.Logger;

import org.example.view.Text;
import org.example.view.View;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;


public class Operations {

    public View print;
    public Calculate functions;
    public Logger logger;

    public Operations(View print, Calculate functions,  Logger logger) {
        this.print = print;
        this.functions = functions;
        this.logger = logger;
    }

    /** subMenu() - Функция предоставляет выбрать операцию с числами
     * (сложение, вычитание, умножение, деление)
     */
    public void subMenu() {
        Scanner cs = new Scanner(System.in);
        Text.chooseOperation();
        Text.allOperations();

        int oper = cs.nextInt();
//        cs.nextLine();

        switch (oper) {
            case 1 -> {

                Text.sumAB();
                Text.inputNumberA();
                double numA = cs.nextDouble();
                Text.inputNumberB();
                double numB = cs.nextDouble();
                logger.writeHistory(logger.dateTime() +
                        functions.sum(new ArrayList<>(Arrays.asList(numA, numB))));
                print.printResult(functions.sum(new ArrayList<>(Arrays.asList(numA, numB))));
                Text.loadedToHistory();
            }
            case 2 -> {
                Text.subtractionAB();
                Text.inputNumberA();
                double numA = cs.nextDouble();
                Text.inputNumberB();
                double numB = cs.nextDouble();
                logger.writeHistory(logger.dateTime() +
                        functions.subtraction(new ArrayList<>(Arrays.asList(numA, numB))));
                print.printResult(functions.subtraction(new ArrayList<>(Arrays.asList(numA, numB))));
                Text.loadedToHistory();
            }
            case 3 -> {
                Text.multiplicationAB();
                Text.inputNumberA();
                double numA = cs.nextDouble();
                Text.inputNumberB();
                double numB = cs.nextDouble();
                logger.writeHistory(logger.dateTime() +
                        functions.multiplication(new ArrayList<>(Arrays.asList(numA, numB))));
                print.printResult(functions.multiplication(new ArrayList<>(Arrays.asList(numA, numB))));
                Text.loadedToHistory();
            }
            case 4 -> {
                Text.divisionAB();
                Text.inputNumberA();
                double numA = cs.nextDouble();
                Text.inputNumberB();
                double numB = cs.nextDouble();
                logger.writeHistory(logger.dateTime() +
                        functions.division(new ArrayList<>(Arrays.asList(numA, numB))));
                print.printResult(functions.division(new ArrayList<>(Arrays.asList(numA, numB))));
                Text.loadedToHistory();
            }
            default -> Text.noThatNumber();
        }

    }

    /** subMenu() - Функция предоставляет выбрать операцию с комплексными числами
     * (сложение, вычитание, умножение, деление)
     */
    public void subMenuComplex() {
        Scanner cs = new Scanner(System.in);
        Text.chooseComplexOperation();
        Text.allOperations();

        int oper = cs.nextInt();
        int numA;
        int numB;
        int numA2;
        int numB2;
        switch (oper) {
            case 1 -> {
                Text.complexSumAB();
                Text.inputNumberA();
                numA = cs.nextInt();
                Text.inputNumberB();
                numB = cs.nextInt();
                Text.inputNumberA2();
                numA2 = cs.nextInt();
                Text.inputNumberB2();
                numB2 = cs.nextInt();
                logger.writeHistory(logger.dateTime() +
                        functions.sum(new ArrayList<>(Arrays.asList(numA, numB, numA2, numB2))));
                print.printResult(functions.sum(new ArrayList<>(Arrays.asList(numA, numB, numA2, numB2))));
                Text.loadedToHistory();
            }
            case 2 -> {
                Text.complexSubtractionAB();
                Text.inputNumberA();
                numA = cs.nextInt();
                Text.inputNumberB();
                numB = cs.nextInt();
                Text.inputNumberA2();
                numA2 = cs.nextInt();
                Text.inputNumberB2();
                numB2 = cs.nextInt();
                logger.writeHistory(logger.dateTime() +
                        functions.subtraction(new ArrayList<>(Arrays.asList(numA, numB, numA2, numB2))));
                print.printResult(functions.subtraction(new ArrayList<>(Arrays.asList(numA, numB, numA2, numB2))));
                Text.loadedToHistory();
            }
            case 3 -> {
                Text.complexMultiplicationAB();
                Text.inputNumberA();
                numA = cs.nextInt();
                Text.inputNumberB();
                numB = cs.nextInt();
                Text.inputNumberA2();
                numA2 = cs.nextInt();
                Text.inputNumberB2();
                numB2 = cs.nextInt();
                logger.writeHistory(logger.dateTime() +
                        functions.multiplication(new ArrayList<>(Arrays.asList(numA, numB, numA2, numB2))));
                print.printResult(functions.multiplication(new ArrayList<>(Arrays.asList(numA, numB, numA2, numB2))));
                Text.loadedToHistory();
            }
            case 4 -> {
                Text.complexDivisionAB();
                Text.inputNumberA();
                numA = cs.nextInt();
                Text.inputNumberB();
                numB = cs.nextInt();
                Text.inputNumberA2();
                numA2 = cs.nextInt();
                Text.inputNumberB2();
                numB2 = cs.nextInt();
                logger.writeHistory(logger.dateTime() +
                        functions.division(new ArrayList<>(Arrays.asList(numA, numB, numA2, numB2))));
                print.printResult(functions.division(new ArrayList<>(Arrays.asList(numA, numB, numA2, numB2))));
                Text.loadedToHistory();
            }
            default -> Text.noThatNumber();
        }
    }
}
