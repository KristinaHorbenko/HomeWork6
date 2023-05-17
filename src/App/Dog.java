package App;

public class Dog extends Animals {
    private static int count = 0;
    public Dog(String name) {
        super(name);
        this.maxRun = 500;
        this.maxSwim = 10;
        this.type = "Пес";
        count++;
    }
        public static int getCount() {
            return count;
    }
}


