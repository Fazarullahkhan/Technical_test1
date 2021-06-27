package Project_test;
// Pattern Program

// class
public class Pattern {

//variable  	
	 int a = 65;	
	
// method 	
 public	void alpha()
	{
		for (int i = 0; i <=6; i++)
        {          
            for (int j = i; j >= 0; j--)
            {
                System.out.print((char) (a + j) + " ");
            }
            System.out.println();
        }		
	}
	
//main		
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Pattern obj = new Pattern();
		obj.alpha();
	        	
	}
}










//A
//B A
//C B A
//D C B A
//E D C B A
//F E D C B A
//G F E D C B A