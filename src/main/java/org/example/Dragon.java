package org.example;

public class Dragon {

    private boolean hungry;

    public void makeFire() {
        if(hungry == true){
            System.out.println("I'm hungry..I cannot make fire ㅠㅠ");
            return;
        }
        System.out.println("~~~~~~~~~~~~~");
        hungry = true;
    }


}
