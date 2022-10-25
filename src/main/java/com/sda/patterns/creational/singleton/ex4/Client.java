package com.sda.patterns.creational.singleton.ex4;

import com.sda.patterns.creational.singleton.ex1.EagerInitializedSingleton;
import com.sda.patterns.creational.singleton.ex2.StaticBlockSingleton;
import com.sda.patterns.creational.singleton.ex3.LazyInitializedSingleton;
import com.sda.patterns.creational.singleton.ex5.BillPughSingleton;

public class Client {

    public static void main(String[] args) {
        ThreadSafeSingleton threadSafeSingleton = ThreadSafeSingleton.getInstance();
        System.out.println(threadSafeSingleton);
        ThreadSafeSingleton threadSafeSingleton2 = ThreadSafeSingleton.getInstanceUsingDoubleLocking();
        System.out.println(threadSafeSingleton2);
    }
}
