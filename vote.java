import java.util.Scanner;

public class vote {
    public static void main(String[] args) {
        Scanner s1 = new Scanner(System.in);
        System.out.print("ENTER THE NAME: ");
        String name = s1.nextLine();

        System.out.print("ENTER THE AGE: ");
        int age = s1.nextInt();

        if (age >= 18) {
            System.out.println(name + " eligible for vote: ");
        } else {
            System.out.println(name + " not eligible for vote: ");
        }
        s1.close();
    }

}
