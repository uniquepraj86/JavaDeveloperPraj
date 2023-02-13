package aaaaa;

public class Continue {
    public static void main(String[] args) {

        for(int i=0; i<10; i++) {

            System.out.println("Value of "+ i);

            if(i == 5) {

                System.out.println("Before continue = "+ (i + i));

             continue;
//             break;

            }

        }

        System.out.println("outside loop");

    }
}
