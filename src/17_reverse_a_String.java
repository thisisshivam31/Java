public class Main
{
	public static void main(String[] args) {
	    String name = "Shivam";
	    int lang = name.length();
	    String rev = ""; 
	    for(int i=lang - 1; i>=0; i--){
	        rev = rev+name.charAt(i);
	    }
		System.out.println(rev);
	}
}
