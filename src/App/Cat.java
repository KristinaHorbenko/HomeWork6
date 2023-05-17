package App;

public class Cat extends Animals {
    private static int count = 0;
    public Cat(String name) {
        super(name);
        this.maxRun = 200;
        this.type = "Кіт";
        count++;
        }

    public static int getCount() {
        return count;
    }

    @Override
        public void swim(int distance) {
            System.out.println("Кіт не може плавати!");
        }
    }

