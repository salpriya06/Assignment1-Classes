public class Emp {
    private int id;
    private String name;
    private int sal;
    public static String company;

    public Emp(int id, String name, int sal){
        this.id = id;
        this.name = name;
        this.sal = sal;
    }

    public int getId() {
        return id;
    }

//    public int setId(){
//        this.setId = Id;
//    }

    public int getSal(){
        return sal;
    }

    public void setSal(int sal) {
        this.sal = sal;
    }

    public String getName() {
        return name;
    }

    public void setName(){
        this.name = name;
    }


}
