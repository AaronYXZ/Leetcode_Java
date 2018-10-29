package C4_InheritanceImplements;

import C2_Lists.SLList;

public class RotateList<Item> extends SLList<Item>{
    /** To do: Implement RotatingSLList such that code compiles and outputs correct result. */

    /** Rotates list to the right. */
    public void rotateRight() {
        Item x = removeLast();
        addFirst(x);
    }

    public static void main(String[] args) {
        RotateList<Integer> rsl = new RotateList<>();
        /* Creates SList: [10, 11, 12, 13] */
        rsl.addLast(10);
        rsl.addLast(11);
        rsl.addLast(12);
        rsl.addLast(13);

        /* Should be: [13, 10, 11, 12] */
        rsl.rotateRight();
        rsl.print();
    }
}
