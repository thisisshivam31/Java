public class factorial {
public static void main(String args []){
    int fact = 1;
    int number = 5;
    for(int i = 1; i<=number; i++){
        fact *= i;
    }
    System.out.println(fact);
}
}
