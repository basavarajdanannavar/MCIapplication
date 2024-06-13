
public class PassingParamstoMainMethod {

	public static void main(String[] args) {
		
		System.out.println(args.length);
		
		for(String value:args)
		{
			System.out.println(value);
		}
	}

}
