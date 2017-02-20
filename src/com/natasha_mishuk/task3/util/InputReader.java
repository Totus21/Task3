package com.natasha_mishuk.task3.util;

import com.natasha_mishuk.task3.matrix.MatrixParameters;
import com.natasha_mishuk.task3.matrix.ParameterValidator;


import java.util.Scanner;

public class InputReader {


    public void readMatrixCapacityFromConsole(MatrixParameters localMatrix) {

        Scanner objectReader = new Scanner(System.in);
        ReportPrinter objectPrinter=new ReportPrinter();
        ParameterValidator objectValidator = new ParameterValidator();
        if (objectReader.hasNextInt()) {

            int tempCapacity=objectReader.nextInt();

            if(objectValidator.checkIfPositive(tempCapacity))  {
                localMatrix.setMatrixCapacity(tempCapacity);
            } else {
                objectPrinter.printWrongCapacityMesage();
                objectPrinter.askMatrixCapacityMessage();
                readMatrixCapacityFromConsole(localMatrix);

            }


        }
        else {
            objectPrinter.printWrongFormatMessage();
            objectPrinter.askMatrixCapacityMessage();
            readMatrixCapacityFromConsole(localMatrix);
        }


    }

    public void readMatrixDivisor(MatrixParameters localMatrix){
        Scanner objectReader = new Scanner(System.in);
        ReportPrinter objectPrinter=new ReportPrinter();
        ParameterValidator objectValidator = new ParameterValidator();
        if (objectReader.hasNextInt()) {
            int tempDivisor=objectReader.nextInt();
            if(objectValidator.checkIfPositive(tempDivisor)){
                localMatrix.setMatrixDivisor(tempDivisor);
            }else{
                objectPrinter.printWrongDivisorMesage();
                objectPrinter.askMatrixDivisorMessage();
                readMatrixDivisor(localMatrix);
            }
        } else{
            objectPrinter.printWrongFormatMessage();
            objectPrinter.askMatrixDivisorMessage();
            readMatrixDivisor(localMatrix);

        }


    }
}
