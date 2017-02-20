package com.natasha_mishuk.task3.util;

import com.natasha_mishuk.task3.matrix.MatrixParameters;


public class ReportPrinter {

     public void PrintMatrixResult(MatrixParameters localMatrix)
    {

        System.out.println("Matrix capacity : " + localMatrix.getMatrixCapacity());
        System.out.println("Matrix divisor : " + localMatrix.getMatrixDivisor());
        System.out.println("Initial matrix : " );

        for (int i=0; i<localMatrix.getMatrixCapacity(); i++)
        {
            System.out.print(" [" + localMatrix.getInitialMatrix()[i]+ "] ");
        }

        System.out.println("\nResult sum : " + localMatrix.getResultSum());


    }


    public void printWrongCapacityMesage()
    {
        System.out.println("Non expected capacity, please try again with correct capacity");
    }

    public void printWrongDivisorMesage()
    {
        System.out.println("Non expected divisor, please try again with correct divisor");
    }

    public void printWrongFormatMessage()
    {
        System.out.println("Non-digital value is entered. Try again");
    }

    public void askMatrixCapacityMessage()
    {
        System.out.println("Please, enter matrix capacity");
    }

    public void askMatrixDivisorMessage()
    {
        System.out.println("Please, enter matrix divisor");
    }


}