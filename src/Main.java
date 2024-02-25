import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        int n, r, result=1;  //define integer value

        Scanner doa = new Scanner(System.in); //define scanner

        System.out.print("Enter the main set for the combination: "); //get main set from user
        n = doa.nextInt();

        System.out.print("Enter the subset for the combination:: ");//get subset from user
        r = doa.nextInt();
        if(n>=r){ //set condition for combination
            for (int i = 1; i <= r; i++) {
                result *= (n - i + 1); //combination calculation
                result /= i;           //combination calculation
            }

            System.out.println("C(" + n + "," + r + ") = " + result);
        }else{
            System.out.println("Main set must be larger than subset!"); //can't make a combination
        }

    }
}
