import java.util.*;

public class PatternMatrix{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char ch = sc.next().toUpperCase().charAt(0);
        int n = sc.nextInt();
        int sum = 0, num = 1;
        int mid = n / 2;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++, num++) {
                boolean keep = false;

                if (ch == 'Z')
                    keep = (i == 0 || i == n - 1 || i + j == n - 1);
                else if (ch == 'D')
                    keep = (i == 0 || i == n - 1 || j == 0 || (j == n - 1 && i > 0 && i < n - 1));
                else if (ch == 'A')
                    keep = (i == 0 || i == mid || ((j == 0 || j == n - 1) && i > 0));
                else if (ch == 'X')
                    keep = (i == j || i + j == n - 1);

                if (keep) {
                    System.out.print(num + " ");
                    sum += num;
                } else {
                    System.out.print("0 ");
                }
            }
            System.out.println();
        }

        System.out.println(sum);
    }
}

