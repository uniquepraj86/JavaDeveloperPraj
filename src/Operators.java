

    /**
     * Types of Operators in Java
     * 1. Unary Operator -> expr++,expr--,++expr,--expr,~,!
     * 2. Arithmetic Operator -> +,-,*,/,%
     * 3. Shift Operators ->  <<,>>
     * 4. Logical Operators -> Logical AND (&&),Logical OR (||)
     * 5. Bitwise Operators -> Bitwise AND (&),Bitwise OR(|)
     * 6. Ternary Operators -> ? :
     * 7. Assignment Operators -> = ,!=,+=,-=,*=,/=,%=,&=,^=,|=
     * 8. Relational Operators -> <,>,<=,>=
     */

    public class Operators {
        public static void main(String...args) {
            int a = 30;
            boolean flag = false;
            System.out.println(a++); //30
            System.out.println(--a); //30
            System.out.println(++a); //31
            System.out.println(a--); //31
            System.out.println(~a); //(-a)-1= -30-1 = -31
            System.out.println(!flag);
            int p =30;
            int r = 40;
            int s = 50;
            float f = 5/ 2;



            // Assignment Operators
            System.out.println(p+r); // 70
            System.out.println(s-p); // 20
            System.out.println( r*s);// 2000
            System.out.println(s/p); //1
            System.out.println(s%p); //0


            //shift Operators
            System.out.println(p<<2); // 30*2^2 = 30*4 = 120
            System.out.println(p<<3); // 30*2^3 = 30*8 = 240
            System.out.println(p>>2); // 30/2^2 = 30/4 = 7
            System.out.println(p>>3); // 30/2^3 = 30/8 = 3


            //logical & Bitwise Operator
//
            System.out.println(p < r && r > s);
            System.out.println(p < r & r > s);
            System.out.println(s < r || r > p);
            System.out.println(s < r | r > p);

            //Ternary operator
            System.out.println(p > r ? "x is max" : "y is max");

        }
    }



