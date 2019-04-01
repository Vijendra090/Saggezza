package designPattern;

import designPattern.singletonDesignPattern.DoubleLockInitialization;
import designPattern.singletonDesignPattern.EagerInitialization;
import designPattern.singletonDesignPattern.LazyInitialization;

public class Test {
    public static void main(String[] args) {
        EagerInitialization obj = EagerInitialization.getInstance();

        //Testing LazyInitialization
        LazyInitialization obj1 = LazyInitialization.getInstance();
        LazyInitialization obj2 = LazyInitialization.getInstance();
        System.out.println("Obj1: "+obj1.hashCode() + " Obj2: "+obj2.hashCode());

        //Testing LazyInitialization
        DoubleLockInitialization obj3 = DoubleLockInitialization.getInstance();
        DoubleLockInitialization obj4 = DoubleLockInitialization.getInstance();
        //DoubleLockInitialization obj5 = (DoubleLockInitialization) obj3.clone();
        System.out.println("Obj3: "+obj3.hashCode() + " Obj4: "+obj4.hashCode());
    }
}
