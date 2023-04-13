package org.example.stackTrace;

public class class2 {
    public static void method2(){
//        StackTraceElement[] stackTrace = Thread.currentThread().getStackTrace();
//
//        for (StackTraceElement stackTraceElement : stackTrace) {
//                System.out.println(stackTraceElement.getClassName());
//                System.out.println(stackTraceElement.getMethodName());
//                System.out.println(stackTraceElement.getLineNumber());
//                System.out.println("--------------------------------");
//            }

        throw new RuntimeException();
    }
}
