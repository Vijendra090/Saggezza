package designPattern.singletonDesignPattern;

public class DoubleLockInitialization {
    private static DoubleLockInitialization obj;

    private DoubleLockInitialization(){}

    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    public static DoubleLockInitialization getInstance(){
        if(obj==null){
            synchronized (DoubleLockInitialization.class){
                if(obj==null)
                    obj= new DoubleLockInitialization();
            }
        }
        return obj;
    }
}
