package com.designpatterns.singleton;


//Not recomended
// Not thread safe
public class EagerInitializationSingleton {
    private static final EagerInitializationSingleton INSTANCE = new EagerInitializationSingleton();

    private EagerInitializationSingleton(){

    }

    public static EagerInitializationSingleton getINSTANCE() {
        return INSTANCE;
    }
    public void singletonTest(){
        System.out.println("Eager Singleton method works");
    }
}
