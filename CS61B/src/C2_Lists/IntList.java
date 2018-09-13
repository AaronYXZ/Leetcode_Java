package C2_Lists;

// https://joshhug.gitbooks.io/hug61b/content/chap2/chap21.html

public class IntList {
    public int first;
    public IntList rest;

    public IntList(int f, IntList r){
        this.first = f;
        this.rest = r;
    }
    public int size(){
        // The key thing to remember about recursive code is that you need a base case.
        // In this situation, the most reasonable base case is that rest is null, which results in a size 1 list.

        // We cannot use if (this == null) return 0; Think about what happens when you call size.
        // You are calling it on an object, for example L.size().
        // If L were null, then you would get a NullPointer error!
        if (this.rest == null) return 1;
        return 1 + this.rest.size();
    }

    public int iterativeSize(){
        IntList p = this;
        int totalSize = 0;
        while (p != null){
            totalSize ++;
            p = p.rest;
        }

        return totalSize;
    }

    public int get(int i){
       if (i == 0) return this.first;
       return rest.get(i-1);
    }

    public int iterativeGet(int i){
        IntList p = this;
        while (i >0){
            p = p.rest;
            i--;
        }
        return p.first;
    }
    public static void main(String[] args) {
        IntList L = new IntList(5, null);
        L.rest = new IntList(10, null);
        L.rest.rest = new IntList(15, null);

        System.out.println(L.size());
        System.out.println(L.iterativeSize());
        System.out.println(L.get(2));
        System.out.println(L.iterativeGet(2));
    }
}
