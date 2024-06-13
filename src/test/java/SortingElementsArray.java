import java.util.Arrays;

public class SortingElementsArray {

	public static void main(String[] args) {
		int a[]= {100,300,700,600,700,800,400,200};
		System.out.println("Before sorting....");
		
		System.out.println(Arrays.toString(a)); // all list of array
		//for(int value:a)
		//{
		//	System.out.println(value);
		//}
		
		Arrays.sort(a);  //sort element in arrays
		System.out.println("After Sorting...");
		System.out.println(Arrays.toString(a)); // sort list  
	}

}
