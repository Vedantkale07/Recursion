package pattern;

public class Tringle2 {
    public static void main(String[] args) {

        tringle(5,0);
    }

    static void tringle(int r, int c){
        if(r==0){
            return;
        }
        if(c<r){
            tringle(r,c+1);
            System.out.println();
        }
        else {
            tringle(r-1,0);
            System.out.print("*");

        }
    }
}