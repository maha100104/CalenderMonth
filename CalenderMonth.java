import java.util.Scanner;
public class CalenderMonth{
  public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String[] S=sc.next().split("-");
        int N=Integer.parseInt(S[1]);
        String[] arr=new String[]{"January", "February", "March", "April", "May", "June",
                "July","August", "September", "October", "November","December"};
        System.out.println(arr[N-1]);
    }
}
/*output:
30-04-2024
  April
  */
