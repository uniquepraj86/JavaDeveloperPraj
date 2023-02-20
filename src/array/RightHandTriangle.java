package array;

public class RightHandTriangle {
    public static void main(String[] args) {

        int i,n=8;
        int j;


        for (i = 1; i <= n; i++) {
            for (j = 1; j <i; j++) {
                System.out.print( " "+i);
            }
            System.out.println();
        }
    }

}
