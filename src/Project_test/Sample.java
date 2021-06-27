package Project_test;
// Given a number whose sum of cubes of its digit is equal to that number

//class
public class Sample {
	
// method 	
public void cube()
{
//variable  	
		 int count=0,j,i, n=409;
// condition		 
	   i=n;  
while(n>0)  
	 {  
	    j=n%10;	    
	    n=n/10;
	    
	    count=count+j*j*j;  
	  }  
	    if(i==count) 
	    {
	    	 System.out.println("Given Number is Equal");   
	    }
	   
	    else 
	    {
	        System.out.println("Given Number is not Equal");   
	   } 
	    
} 
//main	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Sample obj = new Sample();
		obj.cube();
		
		
	}

}
