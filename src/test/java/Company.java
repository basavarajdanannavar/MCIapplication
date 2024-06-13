
public class Company 
{
  int cid;
  String cname;
  char grad;
  void printCompanyData()
  
  {
	  System.out.println(cid + " " +cname+ " " + grad); 
  }
  
	void setCompanyData(int id, String name , char gr) // local variables
	
	{
		cid=id;
		cname=name;
		grad=gr;
	}
	
	Company(int id, String name , char gr)
	
	{
		cid=id;
		cname=name;
		grad=gr;
	}
}
