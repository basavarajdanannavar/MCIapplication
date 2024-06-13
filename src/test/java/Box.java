
public class Box {

	double width, heigth,depth;
	Box()   //1
	
	{
//		width=0;
//		heigth=0;
//		depth=0;
		
		width=heigth=depth=0;
				
	}
	
	Box (double w, double h, double d)   //2
	{
		width=w;
		heigth=h;
		depth=d;
	}
	Box(double len)     //3
	{
	width=heigth=depth=len;	
		
	}
	  double volume()
	  {
		  return (width*heigth*depth);
		  
	  }
    
	}
