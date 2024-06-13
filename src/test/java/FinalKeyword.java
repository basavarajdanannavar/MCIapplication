
class Test 
   {
	final int x= 100;
   }

     public class FinalKeyword {

	 public static void main(String[] args) {
		
      Test t =new Test();
      t.x=200;   // incoorect ,becoz x is final varibles so we can not change the value
      System.out.println(t.x);
	}

}
