package CS61B;

public class List2_1TestPassByValue {

    public static class Dog {

        String name;

        public Dog(String name) {
            this.name = name;
        }

        public String getName() {
            return this.name;
        }
    }

    public static void main(String[] args) {
        Dog aDog = new Dog("Max");
        foo(aDog);

        System.out.println(aDog.getName().equals("Max")); // true

        System.out.println(aDog.getName().equals("Fifi")); // false

    }

    public static void foo(Dog d) {
        d.getName().equals("Max");
        d = new Dog("Fifi");
        d.getName().equals("Fifi");
    }
}
