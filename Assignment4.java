package week1.day1;

public class Assignment4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num = 13;
        boolean flag = false;
        for(int i = 2; i <= num/2; i++)
        {
        	      	
        	if(num % i == 0)
            {
            	
            	flag = true;
                break;
            }
        }

        if (flag == false)
        {
            System.out.println(num + " is a prime number.");
        }
            else
            {
            	System.out.println(num + " is not a prime number.");
            }
	}

}
