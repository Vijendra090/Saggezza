package collection;

import java.util.EnumSet;

enum Gfg{
    CODE, LEARN, CONTRIBUTE, QUIZ, MCQ
};

public class Test {

    public static void main(String[] args){
        EnumSet<Gfg> set1,set2,set3,set4;

        set1= EnumSet.of(Gfg.CODE, Gfg.CONTRIBUTE, Gfg.LEARN, Gfg.QUIZ);
        set2= EnumSet.complementOf(set1);
        set3= EnumSet.allOf(Gfg.class);
        set4= EnumSet.range(Gfg.CODE, Gfg.QUIZ);

        System.out.println("set1: "+set1);
        System.out.println("set2: "+set2);
        System.out.println("set3: "+set3);
        System.out.println("set4: "+set4);
    }
}
