import java.util.Scanner;

public class Assignment3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int id;
        String title, price, desc, category;

        System.out.print("Enter ID : ");
        id = input.nextInt();
        input.nextLine();
        System.out.print("Enter Title : ");
        title = input.nextLine();
        System.out.print("Enter Price : ");
        price = input.nextLine();
        System.out.print("Enter Description : ");
        desc = input.nextLine();
        System.out.print("Enter Category : ");
        category = input.nextLine();

        input.close();

        System.out.println("ID : " + id);
        System.out.println("Title : " + title);
        System.out.println("Price : " + price);
        System.out.println("Description : " + desc);
        System.out.println("Category : " + category);

    }
}