package com._520.lambda;

public class LambdaDemo {
    public static void main(String[] args) {

        Runnable runnable1 = new Runnable() {
            @Override
            public void run() {
                System.out.println("run1.............................");
            }
        };
        runnable1.run();

        Runnable runnable2 = () -> System.out.println("run2......................");
        runnable2.run();

        Runnable runnable3 = () -> {
            System.out.println("----------------------------------");
        };
        runnable3.run();


        new Thread(() -> System.out.println("thread1..................")).run();

        new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("thread2.......................");
            }
        }).run();




        
    }
}
