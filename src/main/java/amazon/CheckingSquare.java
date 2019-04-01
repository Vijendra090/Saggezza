package amazon;

public class CheckingSquare {

    static class Point{
        int x;
        int y;
        Point(int x, int y){
            this.x=x;
            this.y=y;
        }
    }

    static int distSq(Point p, Point q){
        return (p.x-q.x)*(p.x-q.x) + (p.y-q.y)*(p.y-q.y);
    }

    static boolean isSquare(Point p1, Point p2, Point p3, Point p4){
        int d2= distSq(p1,p2);
        int d3= distSq(p1,p3);
        int d4= distSq(p1,p4);

        if(d2==d4 && 2*d2==d3 && 2*d2 == distSq(p2,p4)){
            int d= distSq(p2,p3);
            return (d==distSq(p3,p4) && d==d2);
        }

        if(d2==d3 && 2*d2==d4 && 2*d2==distSq(p2,p3)){
            int d=distSq(p2,p4);
            return (d==distSq(p3,p4) && d==d2);
        }

        if(d3==d4 && 2*d3==d2 && 2*d3==distSq(p3,p4)){
            int d=distSq(p2,p3);
            return (d==distSq(p2,p4) && d==d3);
        }
        return true;
    }

    public static void main(String[] args){
        //Given four points need to check if they are forming the square
        Point p1= new Point(10,10);
        Point p2= new Point(20,10);
        Point p3= new Point(20,20);
        Point p4= new Point(10,20);

        if(isSquare(p1,p2,p3,p4)==true)
            System.out.println("Yes");
        else
            System.out.println("No");
    }
}
