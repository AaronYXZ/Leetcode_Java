package C2_Lists;

public class AList {

    int[] nums;
    int size;
    /** Creates an empty list. */
    public AList() {
        nums = new int[100];
        size = 0;
    }

    /** Inserts X into the back of the list. */
    public void addLast(int x) {
        nums[size] = x;
        size++;
    }

    /** Returns the item from the back of the list. */
    public int getLast() {
        return nums[size-1];
    }
    /** Gets the ith item in the list (0 is the front). */
    public int get(int i) {
        return nums[i];
    }

    /** Returns the number of items in the list. */
    public int size() {
        return size;
    }

    /** Deletes item from back of the list and
     * returns deleted item. */
    public int removeLast() {
        int last = getLast();
        size--;
        return last;
    }
}
