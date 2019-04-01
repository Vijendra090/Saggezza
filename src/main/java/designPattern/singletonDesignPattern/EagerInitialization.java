package designPattern.singletonDesignPattern;

public class EagerInitialization {

    private static EagerInitialization obj = new EagerInitialization();

    private EagerInitialization(){System.out.println("Object created");}

    public static EagerInitialization getInstance(){
        return obj;
    }
}
