package org.example;

public class Account {

    private int balance; //멤버변수는 무조건 private

    //조회는 getter
    //변경 setter

    //불변객체 - Integer, Double, Float, String, Boolean
    public Account(int value){
        this.balance = value;
    }

    public int getBalance() {
        return balance;
    }

    public void changeBalance(Account newbie){
        newbie.balance = 100000000;
    }

    public static void main(String[] args) {

        Account a1 = new Account(10);
        Account a2 = new Account(20);

        a1.changeBalance(a2);
        System.out.println(a2.getBalance());

    }


}
