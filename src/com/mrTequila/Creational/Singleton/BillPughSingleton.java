package com.mrTequila.Creational.Singleton;

// more efficient way of initializing safe with multithreaded apps
public class BillPughSingleton {

    private BillPughSingleton(){}

    private static class SingletonHelper{
        private static final BillPughSingleton SINGLETON = new BillPughSingleton();
    }

    public static BillPughSingleton getInstance() {
        return SingletonHelper.SINGLETON;
    }
}
