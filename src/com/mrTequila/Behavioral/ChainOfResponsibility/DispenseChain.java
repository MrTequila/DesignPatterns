package com.mrTequila.Behavioral.ChainOfResponsibility;

public interface DispenseChain {

    void setNextChain(DispenseChain nextChain);

    void dispense(Currency currency);
}
