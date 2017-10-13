package com.mrTequila.Factory;

public class TestFactory {

    public static void main(String[] args) {
        Computer pc = ComputerFactory.getComputer("pc", "2 GB", "500 GB", "2.0 GHz");
        Computer server = ComputerFactory.getComputer("server", "1 GB", "1 TB", "2.9 GHz");

        System.out.println("Factory PC Config::" + pc);
        System.out.println("Factory Server Config::" + server);
    }
}
