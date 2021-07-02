package com.company.OOPS;


import java.util.*;

class SavingAmount {
    private int savings;

    public void setInitialSaving(int savings){
        this.savings = savings;
    }

    public int getCurrentSaving(){
        return this.savings;
    }

    public void incrementSaving(){
        this.savings += 1000;
    }
    public void decrementSaving(){
        this.savings -= 100;
    }

    public String checkSaving(){

        if(this.savings >= 1000){
            return "Congratulations! You have saved a good amount";
        }
        else if(this.savings <1000 && this.savings >= 0){
            return "Insufficient saving!";
        }
        else if(this.savings < 0){
            return "You are in debt";
        }

        return "";
    }
//write your code here
}

public class Source {
    public static void main(String[] args) {

        SavingAmount obj = new SavingAmount();
        Scanner in = new Scanner(System.in);
        obj.setInitialSaving(in.nextInt());
        obj.decrementSaving();
        obj.incrementSaving();
        obj.checkSaving();
        System.out.println("Your current savings are Rs " + obj.getCurrentSaving());
    }
}


