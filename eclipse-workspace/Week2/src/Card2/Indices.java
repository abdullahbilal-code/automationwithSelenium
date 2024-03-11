package Card2;

public class Indices {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      
		
		 try{    
			 //Outer Try
             int a[]=new int[5];   
             a[5]=30/0;    
           //  System.out.println(a[10]);  
          
              try {
            	  //Inner Try
        	    String s= null;
        	    System.out.println(s.length());
               }
              catch(Exception e) { 
            	  //Inner catch
                 System.out.println("Parent Exception occurs");  
              }
   
            }    
            catch(ArithmeticException e)  
               {  
            	//Outer Catch
                System.out.println("Arithmetic Exception occurs");  
               }    
            catch(ArrayIndexOutOfBoundsException e)  
               {  
                System.out.println("ArrayIndexOutOfBounds Exception occurs");  
               }    
                         
		 finally {  
			 System.out.println("finally block is always executed");  
			 }    
		
	}

}
