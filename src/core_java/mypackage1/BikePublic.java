package core_java.mypackage1;

public class BikePublic {
    int a = 10;
    public int b = 20;
    protected int c = 30;
    private int d = 40;

    public BikePublic() {
        System.out.println("BikePublic Constructor called");
    }

    public int getD() {
        return d;
    }

//    public void setD(int d) {
//        this.d = d;
//    }
}

//class Honda extends Bike
//  {
//    int f = a + a;
//  Honda h = new Honda();

//public static void main(String[] args) {
//  Honda h = new Honda();
//System.out.println(h.f);


//}
//  }
