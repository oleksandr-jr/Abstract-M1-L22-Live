package org.example.stackTrace;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        try {
            class1.method1();
        }catch (RuntimeException e){
            StackTraceElement[] stackTrace = e.getStackTrace();
//            StackTraceElement[] stackTrace = Thread.currentThread().getStackTrace();

            for (StackTraceElement stackTraceElement : stackTrace) {
                System.out.println("================================");
                System.out.println(stackTraceElement.getClassName());
                System.out.println(stackTraceElement.getMethodName());
                System.out.println(stackTraceElement.getLineNumber());
                System.out.println("--------------------------------");
            }
        }

    }
}
