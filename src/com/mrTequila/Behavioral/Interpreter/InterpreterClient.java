package com.mrTequila.Behavioral.Interpreter;

public class InterpreterClient {

    public InterpreterContext interpreterContext;

    public InterpreterClient(InterpreterContext interpreterContext) {
        this.interpreterContext = interpreterContext;
    }

    public String interpret(String string) {
        Expression expression = null;

        if(string.contains("Hexadecimal")) {
            expression = new IntToHexExpression(Integer.parseInt(string.substring(0, string.indexOf(" "))));
        } else  if(string.contains("Binary")) {
            expression = new IntToBinaryExpression(Integer.parseInt(string.substring(0, string.indexOf(" "))));
        } else return string;
        return expression.interpret(interpreterContext);
    }

    public static void main(String[] args) {
        String str1 = "28 in Binary";
        String str2 = "28 in Hexadecimal";

        InterpreterClient ec = new InterpreterClient(new InterpreterContext());
        System.out.println(str1+"= "+ec.interpret(str1));
        System.out.println(str2+"= "+ec.interpret(str2));
    }

}
