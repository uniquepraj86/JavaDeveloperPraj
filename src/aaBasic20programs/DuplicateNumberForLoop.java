package aaBasic20programs;

public class DuplicateNumberForLoop {
    public static void main(String[] args) {

        int a[] = {1,2,3,4,4,3,2,5,4,3,6,5,7,8,};
        for(int i=0;i<=a.length-1;i++){
            for(int j=i+1;j<=a.length;j++){
                if(a[i]==a[j] && i!=j){
                    System.out.println(a[j]);
                }
            }
        }
    }
}
