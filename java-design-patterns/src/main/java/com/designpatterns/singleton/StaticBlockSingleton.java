package com.designpatterns.singleton;

//static oldugu icin herseyden once yukleniyor. kullanmasak bile yuklenir
//multi tread kullanmayacagim her halukarda cagiracagim diyorsa en dogru implementsayon bu

// thread sorunu var yine

public class StaticBlockSingleton {
    private static StaticBlockSingleton staticBlockSingleton;

    static {
        try{
            staticBlockSingleton = new StaticBlockSingleton();
        }catch (Exception e){
        }


        }
    private StaticBlockSingleton() {
    }
        public static StaticBlockSingleton getStaticBlockSingleton(){

        return staticBlockSingleton;
        }
        public void singletonTest(){

        System.out.println("Static Block singleton works");
        }
    }

