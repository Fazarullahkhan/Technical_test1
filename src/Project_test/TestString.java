package Project_test;
//program to remove special characters and numbers in given string

//class
public class TestString {

//variable  	
	
	String str="Au!t14o#m45a%*tion Tes?#te8r";  
	String result;
	
// method 	

	public void special()
	{
		result = str.replaceAll("[^a-zA-Z]", "");

     System.out.println(result);
	}
	

//main		
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TestString obj = new TestString();
		obj.special();
		
	}

}
