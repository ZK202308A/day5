package org.example.bmi;

import java.util.Scanner;

public class BMIUI {

    public void inputInfo(){
        System.out.println("키를 입력하세요 180 - 1.8");
        Scanner scanner = new Scanner(System.in);
        double height = scanner.nextDouble();

        System.out.println("몸무게를 입력하세요");
        double weight = scanner.nextDouble();

        double bmi = BMICalculator.calc(height,weight);

        System.out.println(bmi);
    }

}
