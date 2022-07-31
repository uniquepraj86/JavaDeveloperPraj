package superkeyword;

class A
{
    void m1()
    {
        System.out.println("I m in class A");
    }
}
class B1 extends A
{
void m1()
{
    System.out.println("I m in class A");
}
void show1()
{
    m1();
    super.m1();
}

    public static void main(String[] args) {
        B1 ob = new B1();
        ob.show1();
    }
}

