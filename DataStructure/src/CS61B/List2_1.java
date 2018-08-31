package CS61B;

public class List2_1 {

    public static class Walrus{
        double size;
        int weight;

        public Walrus(int weight, double size){
            this.size = size;
            this.weight = weight;
        }
    }

    public static void main(String[] args) {
        int x = 2;
        int y = x;
        y = 5;
        System.out.println(x);
        System.out.println(y);

        Walrus w1 = new Walrus(2, 10.0);
        Walrus w2 = w1;

        System.out.println(w1.weight);
        w2.weight = 3;

        System.out.println(w1.weight);
        System.out.println(w2.weight);


    }
}
