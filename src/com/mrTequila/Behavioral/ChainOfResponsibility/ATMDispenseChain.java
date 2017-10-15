package com.mrTequila.Behavioral.ChainOfResponsibility;

import java.util.Scanner;

public class ATMDispenseChain {

    private DispenseChain chain1;

    public ATMDispenseChain() {
        this.chain1 = new Dollar50Dispenser();
        DispenseChain chain2 = new Dollar20Dispenser();
        DispenseChain chain3 = new Dollar10Dispenser();

        chain1.setNextChain(chain2);
        chain2.setNextChain(chain3);
    }

    public static void main(String[] args) {
        ATMDispenseChain atmDispenseChain = new ATMDispenseChain();
        while(true) {
            int amount = 0;
            System.out.println("Enter amount to dispense");
            Scanner input = new Scanner(System.in);
            amount = input.nextInt();
            if(amount % 10 != 0) {
                System.out.println("Amount should be in multiple of 10s.");
                return;
            }
            atmDispenseChain.chain1.dispense(new Currency(amount));
        }
    }
}
