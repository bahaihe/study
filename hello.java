public class hello
{
	public static void main(String[] args) {
	    
	    try{
		    while(true){
		        System.out.println("hello");
		        java.lang.Thread.sleep(10000);
		    }
		} catch (InterruptedException e) { } 
	}
}