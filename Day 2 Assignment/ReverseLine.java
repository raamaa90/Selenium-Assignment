package week1.day2;

public class ReverseLine {
	
	public static String reverseWord(String str){  
	    String words[]=str.split(" ");  
	    String reverseWord=" ";  
	    for(String w:words){  
	        StringBuilder sb=new StringBuilder(w);  
	        sb.reverse();  
	        reverseWord+=sb.toString()+" ";  
	    }  
	    return reverseWord.trim();  
	}  

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ReverseLine reverse = new ReverseLine();
		System.out.println(reverse.reverseWord("I am a software tester"));

	}

}
