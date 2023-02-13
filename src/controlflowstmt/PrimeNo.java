package controlflowstmt;

public class PrimeNo {
    public static void main(String[] args) {
        int i,no, temp = 0;

        for (no = 1; no <= 100; no++) {
            for ( i = 2; i <= no - 1; i++) {
                if (no % i == 0) {
                    temp = temp + 1;
                }
            }
            if (temp == 0) {
                System.out.println(no);
            } else {
                System.out.println("no is not prime");
            }
        }

//        int i ,temp = 0,no;
//
//        for(no = 1;no<=100; no++)
//        {
//            for(i=2;i<=no-1;i++)
//            {
//                if(no%i==0)
//                {
//                    temp = temp+1;
//                }
//            }
//            if(temp ==0)
//            {
//                System.out.println("prime");
//            }
//            else
//            {
//                System.out.println("no is not prime");
//            }
        }
    }


