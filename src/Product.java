import java.util.Random;

public class Product {

    private int srNo;
    private String title;
    private float price;
    private static String vendor;
    private static int NxtSrn;

    static {
        System.out.println("Block is executed...");

//        Random random = new Random();
//        int randomInt = random.nextInt();
//        NxtSrn = Math.abs(randomInt);
        NxtSrn = Math.abs(new Random().nextInt());
        vendor = "Bitcode Tech";
    }

    public Product(String title, float price){
        this.srNo = NxtSrn;
        NxtSrn++;
        this.title = title;
        this.price = price;
    }

    public int getSrNo() {
        return srNo;
    }

    public void setSrNo(int srNo) {
        this.srNo = srNo;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public static String getVendor() {
        return vendor;
    }

    public static void setVendor(String vendor) {
        Product.vendor = vendor;
    }

    public void display(){
        System.out.println(" " + srNo + " " + title + " " + price + " " + vendor);
    }
}
