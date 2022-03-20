package com.designpatterns.singleton;

//dezavantaji performans cunku secronized olarak calistigi icin
// static oldugu icin bu problem
public class ThreadSafeSingleton {

    private static ThreadSafeSingleton threadSafeSingleton;
    private ThreadSafeSingleton(){

    }
    public static synchronized ThreadSafeSingleton getThreadSafeSingleton(){

        if (threadSafeSingleton==null)
            threadSafeSingleton=new ThreadSafeSingleton();
        return threadSafeSingleton;
    }
    public void singletonTest(){

        System.out.println("ThreadSafe singleton works");
    }
}
