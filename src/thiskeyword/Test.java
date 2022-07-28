package thiskeyword;

public class Test {
   int i;
   void setValues(int i)
   {

      this.i=i;
   }
   void show()
   {
      System.out.println(i);
   }
}
class TestImpl
{
   public static void main(String[] args) {
      Test t = new Test();
      t.setValues(10);
      t.show();
   }
}