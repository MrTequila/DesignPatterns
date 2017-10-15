package com.mrTequila.Behavioral.Interpreter;

public class IntToBinaryExpression implements Expression {

   private int i;

    public IntToBinaryExpression(int i) {
        this.i = i;
    }

    @Override
    public String interpret(InterpreterContext interpreterContext) {
        return interpreterContext.getBinaryFormat(this.i);
    }
}
