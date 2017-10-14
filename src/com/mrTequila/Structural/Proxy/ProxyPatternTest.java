package com.mrTequila.Structural.Proxy;

public class ProxyPatternTest {

    public static void main(String[] args) {
        CommandExecutor executor = new CommandExecutorProxy("Misiek", "nonpass");
        try {
            executor.runCommand("cmd cd");
            executor.runCommand("rm -rf abc.pdf");
        } catch (Exception e) {
            System.out.println("Exception Message::"+e.getMessage());
        }
    }
}
