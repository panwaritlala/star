import java.util.Scanner;

public class homework {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);

        int[] number = new int[3];
        // System.out.println(number.length);

        for (int i = 0; i < number.length; i++) {
            System.out.print("Enter Number : ");
            number[i] = kb.nextInt();
        }
        System.out.print("{");
        int sum = 0;
        for (int i : number) {
            if (sum<=i) {
                System.out.print(i+",");
            } else {
                System.out.print(i);
                
            }
            sum = sum + i;           
        }
        System.out.println("}");
        System.out.println(sum);
        kb.close();
    }
}

    