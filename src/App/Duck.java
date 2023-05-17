package App;

public class Duck extends Animals {
    private static int count = 0;
    public Duck (String name) {
        super(name);
        this.maxRun = 5;
        this.maxSwim = 20 ;
        this.type = "Качка";
        count++;
    }
    public static int getCount() {
        return count;
    }
}
