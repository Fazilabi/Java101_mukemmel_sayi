import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        System.out.print("enter any number : ");
        int n = input.nextInt();
        int sum = 0;
        for (int i =1 ; i<n ; i++){
            if (n%i==0){
                System.out.println(i);
                sum+=i;
            }

        }
        if (sum==n){
            System.out.println(n + " mukemmel sayidir");
        }else {
            System.out.println(n + " mukemmel sayi degildir");
        }
    }
}