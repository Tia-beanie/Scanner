import java.util.Scanner;

public class D3_ScannerTut{
    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);

        System.out.println("What's your first name: ");
        String name = scan.next(); //next() scans one word before space

        System.out.println("What's your age: ");
        int age = scan.nextInt();

        //scan.nextLine() reads entire line until \n 'enter key' is entered

        System.out.println("What's your senior quote: ");
        String quote = scan.next(); //next() scans one word before space
        quote += scan.nextLine();

        System.out.println("Thank you " + name + ", you are " + age + " old, and your quote is: " + quote);
       
    }
}
