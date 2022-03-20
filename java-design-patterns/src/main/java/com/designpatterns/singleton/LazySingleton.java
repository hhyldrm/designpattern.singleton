package com.designpatterns.singleton;

//thread safe degil
//multi tread yapi kullanmiyorsan en dogru yapi bu
//fakat bunun sorunu
public class LazySingleton {
    private static LazySingleton lazySingleton;

    // Instance disari kapatmak icin constructor ini olusturmaliyiz
    private LazySingleton(){

    }
    public  static LazySingleton getLazySingleton(){
        if (lazySingleton==null)
            lazySingleton=new LazySingleton();
        return lazySingleton;
    }
    public void singletonTest(){

        System.out.println("Lazy singleton works");
    }
}
