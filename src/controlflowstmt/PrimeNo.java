package controlflowstmt;

public class PrimeNo {
    public static void main(String[] args) {
        int no;

        for (no = 1; no <= 100; no++) {
            int temp = 0;
            for (int i = 2; i <= no - 1; i++) {
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
    }
}

