import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	    Scanner SC = new Scanner(System.in);
	    int n = SC.nextInt();
	    int count = 0;
	    while(n>0){
	        n = n/10;
	        count = count + 1;
	    }
	    System.out.println(count);
    }
}
