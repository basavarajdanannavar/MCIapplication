
public class NumberofDuplicationofArray {

	public static void main(String[] args) {
		int a[]= {100,200,300,100,300,400,400,400,500,500,100,100,100};
		int num=500;
		int count =0;
		
		for(int value:a)
		{
			if(value==num)
			{
			count++; 
		}
	}

	System.out.println(count);
    }
  }