package pattern;

public class Tringle {
    public static void main(String[] args) {
        tringle(5,0);

    }

    static void tringle(int r, int c){
        if(r==0){
            return;
        }
        if(c<r){
            System.out.print("*");
            tringle(r,c+1);
        }else{
            System.out.println();
            tringle(r-1,0);
        }
    }
}
