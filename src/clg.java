import java.util.Random;

public class clg {
    private int roll_no;
    private String st_name;
    private String st_class;
    private static String st_clg ;
//
    private static int nxtr;

    static {

        System.out.println("Static Block Worked");

        nxtr = 1;
        st_clg = " JESITMR, Nashik ";

    }

    public clg(String st_name, String st_class)
    {
        this.roll_no = nxtr;
        nxtr++;
        this.st_name = st_name;
        this.st_class = st_class;
    }

    public int getRoll_no() {
        return roll_no;
    }

    public void setRoll_no(int roll_no) {
        this.roll_no = roll_no;
    }

    public String getSt_name() {
        return st_name;
    }

    public void setSt_name(String st_name) {
        this.st_name = st_name;
    }

    public String getSt_class() {
        return st_class;
    }

    public void setSt_class(String st_class) {
        this.st_class = st_class;
    }

    public static String getSt_clg(){
        return st_clg;
    }

    public void setSt_clg(){
        clg.st_clg = st_clg;
    }

    public void display(){
        System.out.println(" The Roll No " + roll_no + " Has Assigned To Student " + st_name + " Who Is In " + st_class + " Class And College Is: " + st_clg );

    }
}
