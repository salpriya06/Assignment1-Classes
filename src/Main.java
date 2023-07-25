import java.awt.font.LayoutPath;

public class Main {
    public static void main(String[] args) {
//        System.out.println("Comapny: " + Emp.company);

//        Emp e1 = new Emp(101, "AA", 1000);
//        Emp e2 = new Emp(202, "BB",3000);
//        Emp e3 = new Emp(303, "CC", 5000);

//        System.out.println(" Bank Name is " + BankAc.getBank_name());
//
//        BankAc b1 = new BankAc(01, "Thatte Nagar", 10000);
//        BankAc b2 = new BankAc(02, "Ashok Nagar", 30000);
//        BankAc b3 = new BankAc(03, "College Road", 9000);
//        BankAc b4 = new BankAc(04, "Savarkar Nagar", 15000);
//
//        b1.display();
//        b2.display();
//        b3.display();
//        b4.display();
//
//        System.out.println();
//
//        BankAc.setBank_name(" State Bank Of India ");
//
//        b1.display();
//        b2.display();
//        b3.display();
//        b4.display();

//        Product p1 = new Product("Laptop", 12700.40F);
//        Product p2 = new Product("Android Phone", 17500.30F);
//        Product p3 = new Product("Iphone", 112700.60F);
//
//        p1.display();
//        p2.display();
//        p3.display();

        Maths m1 = Maths.getInstance();
        System.out.println("Addition Is : " +m1.add(100,200));

        Maths m2 = Maths.getInstance();
        System.out.println("Addition Is : " +m1.sub(400,200));

        Maths m3 = Maths.getInstance();
        System.out.println("Addition Is : " +m1.add(800,200));

    }
}