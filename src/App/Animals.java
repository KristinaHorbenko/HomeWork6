package App;

public class Animals {
    protected String name;
        protected String type;
        protected int maxRun;
        protected int maxSwim;

        public Animals(String name){
            this.name = name;
        }
        public void run(int distance) {
            if (this.maxRun >= distance) {
                System.out.println(this.type + " " + this.name + " пробіг " + maxRun + " метрів.");
            } else {
                System.out.println(this.type + " " + this.name + " більше ніж " + maxRun + " метрів не біжить.");
            }
        }
        public void swim(int distance) {
            if (this.maxSwim >= distance) {
                System.out.println(this.type + " " + this.name + " проплив " + maxSwim + " метрів.");
            } else {
                System.out.println(this.type + " " + this.name + " більше ніж " + maxSwim + " метрів плавати не може.");
            }
        }

    }




