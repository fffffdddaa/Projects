import java.util.Scanner;

public class FindPItoN{
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int N = s.nextInt();
        double result = (int)(Math.PI*(int)Math.pow(10, N-1))/Math.pow(10, N-1);
    
        System.out.println(result);
        s.close();
    }
}