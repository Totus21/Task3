package com.natasha_mishuk.task3.main;



import com.natasha_mishuk.task3.util.InputReader;
import com.natasha_mishuk.task3.util.ReportPrinter;

import com.natasha_mishuk.task3.matrix.MatrixParameters;
import com.natasha_mishuk.task3.matrix.MatrixUtil;
import com.natasha_mishuk.task3.matrix.MatrixCalculation;


    public class Runner {
        public static void main(String[] args) {

            InputReader objectReader = new InputReader();
            ReportPrinter objectPrinter = new ReportPrinter();
            MatrixParameters objectMatrix=new MatrixParameters();
            MatrixUtil objectMatrixUtil=new MatrixUtil();
            MatrixCalculation objectMatrixCalculation=new MatrixCalculation();

            //В массив A [N] занесены натуральные числа. Найти сумму тех элементов, которые кратны данному К
            objectPrinter.askMatrixCapacityMessage();
            objectReader.readMatrixCapacityFromConsole(objectMatrix);
            objectMatrixUtil.generateMatrix(objectMatrix);
            objectPrinter.askMatrixDivisorMessage();
            objectReader.readMatrixDivisor(objectMatrix);
            objectMatrixCalculation.calculateMatrixSum(objectMatrix);
            objectPrinter.PrintMatrixResult(objectMatrix);
        }
    }


