package designPattern.singletonDesignPattern;

public class LazyInitialization {
    private static LazyInitialization obj;

    private LazyInitialization(){}

    public static LazyInitialization getInstance(){
        if(obj==null) {
            synchronized (LazyInitialization.class) {
                obj = new LazyInitialization();
            }
        }
        return obj;
    }
}
