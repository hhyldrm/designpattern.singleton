package com.designpatterns.factory;

public class Run {
    public static void main(String[] args) {
       String file = FileExporterFactory.getInstance(FileExporterFactory.FileType.PDF).
                export("Test content");
        System.out.println(file);
    }
}
