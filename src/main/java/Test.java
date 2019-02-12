public class Test{
    static int i;
    static int j;
    static int k;
    static {
        System.out.println("Inside static block");
        i=10;
    }

    Test(int j){
        this.j=j;
    }

    public void assign(){
        k=20;
    }

    void display(){
        System.out.println("i= "+i+" j= "+j+" k= "+k);
    }
    public static void main(String[] args){
        Test obj = new Test(5);
        obj.assign();
        obj.display();
    }
}
