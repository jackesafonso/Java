package testjavaispassingbyvalue;

public class TestJavaIsPassByValue {
	
    public void swap(int x,int y)
    {
         int temp=0;
         temp = x;
         x=y;
         y=temp;
         
         System.out.println("LOCAL x: "+x);
         System.out.println("LOCAL y: "+y);
         System.out.println();
         
    }
    public static void main(String[] args) {

    	TestJavaIsPassByValue T = new TestJavaIsPassByValue();
         int x = 1;
         int y = 2;
         System.out.println("INITIAL x: "+x);
         System.out.println("INITIAL y: "+y);
         System.out.println();

         T.swap(x, y);
         
         System.out.println("FINAL x: "+x);
         System.out.println("FINAL y: "+y);
         System.out.println();

    }


}
