package org.example;

import org.example.bmi.BMIUI;
import org.example.lotto.LottoBall;
import org.example.lotto.LottoMachine;
import org.example.lotto.LottoUI;

import java.util.ArrayList;
import java.util.Arrays;


public class Main {
    public static void main(String[] args) {

        int[] scores = {74,32,45,25,78,89,45,59};

        int[] num2 = Ex1.choiceTwo(scores);

        System.out.println(Arrays.toString(num2));




//        ArrayList<LottoBall> list = new ArrayList<>();
//        for (int i = 1; i <= 45; i++) {
//
//            list.add(new LottoBall(i));
//        }
//        LottoMachine lottoMachine = new LottoMachine(list);
//
//        LottoUI lottoUI = new LottoUI(lottoMachine);
//
//        lottoUI.run();



//        BMIUI ui = new BMIUI();
//        ui.run();

    }
}