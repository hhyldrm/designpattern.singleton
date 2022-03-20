package com.designpatterns.singleton;

//Loadin time dan kazandirir
//thred safe olmasi icin
public class BillPughSingleton {

    private BillPughSingleton(){

    }
    public static BillPughSingleton getInstance(){
        return SingletonHelper.INSTANCE;
    }
    //BillPughSingleton  class ina ne zamn ihtiyac duyulursa o zaman JVM e yuklenir
    private static class SingletonHelper {
        private static final BillPughSingleton INSTANCE = new BillPughSingleton();
    }
    public void singletonTest(){

        System.out.println("BillPugh singleton works");
    }
}
