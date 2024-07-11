package org.example;

import org.example.bmi.BMIUI;
import org.example.lotto.LottoBall;
import org.example.lotto.LottoMachine;

import java.util.ArrayList;
import java.util.Arrays;


public class Main {
    public static void main(String[] args) {

        ArrayList<LottoBall> list = new ArrayList<>();

        for (int i = 1; i <= 45; i++) {
            LottoBall ball = new LottoBall(i);
            list.add(ball);
        }

        LottoMachine lottoMachine = new LottoMachine(list);

        System.out.println(Arrays.toString(lottoMachine.selectBalls()));
        System.out.println(Arrays.toString(lottoMachine.selectBalls()));
        System.out.println(Arrays.toString(lottoMachine.selectBalls()));


//        BMIUI ui = new BMIUI();
//        ui.run();

    }
}