package com.designpatterns.singleton;

import com.designpatterns.factory.FileExporterFactory;

public class Run {
    public static void main(String[] args) {
        EagerInitializationSingleton.getINSTANCE().singletonTest();

        StaticBlockSingleton.getStaticBlockSingleton().singletonTest();

        LazySingleton.getLazySingleton().singletonTest();

        ThreadSafeSingleton.getThreadSafeSingleton().singletonTest();

        BillPughSingleton.getInstance().singletonTest();

        String file = FileExporterFactory.getInstance(FileExporterFactory.FileType.EXCEL).
                export("Test content");
        System.out.println(file);

//        com.designpatterns.factory.FileExporterFactory.getInstance(FileExporterFactory.FileType.EXCEL)
//                .export("Test content");
    }
}
