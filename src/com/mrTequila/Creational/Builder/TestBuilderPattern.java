package com.mrTequila.Creational.Builder;

public class TestBuilderPattern {

    public static void main(String[] args) {
        Computer computer = new Computer.ComputerBuilder("700 GB", "4 GB")
                .setBluetoothEnabled(true).setGraphicsCardEnabled(true).build();

        Computer computer2 = new Computer.ComputerBuilder("700 GB", "4 GB")
                .setBluetoothEnabled(true).build();

        System.out.println(computer.toString());
        System.out.println(computer2.toString());
    }
}
