import java.awt.font.LayoutPath;

public class Main {
    public static void main(String[] args) {

        System.out.println(" College Name : " + clg.getSt_clg());

        clg c1 = new clg("AA", "Fourth Year");
        clg c2 = new clg("BB", "Second Year");
        clg c3 = new clg("CC", "First Year");
        clg c4 = new clg("DD", "Fourth Year");

        c1.display();
        c2.display();
        c3.display();
        c4.display();

    }
}