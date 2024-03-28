package Task1;

import java.util.Scanner;
public class Test1 {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        System.out.println("Enter Student Details :");
        System.out.println("Enter Student name: ");
        String sname= scanner.nextLine();
        System.out.println("Enter Student address: ");
        System.out.print("City : ");
        String scity= scanner.nextLine();
        System.out.print("Country : ");
        String scountry= scanner.nextLine();
        System.out.println("Enter Student program: ");
        String sprogram= scanner.nextLine();
        System.out.println("Enter Student year: ");
        int syear= scanner.nextInt();
        System.out.println("Enter Student fee: ");
        double sfee= scanner.nextDouble();

        Student student = new Student(sname, new Address(scity, scountry), sprogram, syear, sfee);

        System.out.println("Enter Staff Details :");
        System.out.println("Enter Staff name: ");
        String stname= scanner.next();
        System.out.println("Enter Staff address: ");
        System.out.print("City : ");
        String stcity= scanner.next();
        System.out.print("Country : ");
        String stcountry= scanner.next();
        System.out.println("Enter Staff pay: ");
        double stpay= scanner.nextDouble();

        Staff staff = new Staff(stname, new Address(stcity, stcountry), stpay);

        System.out.println(student);
        System.out.println(staff);

        scanner.close();

    }
}