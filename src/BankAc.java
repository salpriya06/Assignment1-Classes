public class BankAc {

    private int id;
    private String branch_name;
    private int bal;
    private static String bank_name = "Bank Of Maharashtra";

    public BankAc(int id, String branch_name, int bal){
        this.id = id;
        this.branch_name = branch_name;
        this.bal = bal;
//        this.bank_name = bank_name;
    }


    public int getId() {

        return id;
    }

    public void setId(int id) {

        this.id = id;
    }

    public String getBranch_name() {

        return branch_name;
    }

    public void setBranch_name(String branch_name) {

        this.branch_name = branch_name;
    }

    public int getBal() {

        return bal;
    }

    public void setBal(int bal) {

        this.bal = bal;
    }

    public static String getBank_name(){

        return bank_name;
    }

    public static void setBank_name(String bank_name)
    {

        BankAc.bank_name = bank_name;
    }

    public void display()
    {
        System.out.println("The " +id+ " Has Bank At " +branch_name+ " With Balance " +bal+ " And The Name Of Bank Is: " +bank_name);
    }
}
