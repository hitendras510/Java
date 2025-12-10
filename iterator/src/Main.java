import java.util.ArrayList;
import java.util.ListIterator;

class Main {
    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(8);
        list.add(3);
        list.add(12);
        list.add(5);
        list.add(7);
        list.add(2);

        int target = 12;   // find this target

        ListIterator<Integer> it = list.listIterator();

        // Step 1: Move forward until target is found
        while (it.hasNext()) {
            int val = it.next();
            if (val == target) {
                break;     // stop when target reached
            }
        }

        // Step 2: Move backward and remove elements smaller than target
        while (it.hasPrevious()) {
            int val = it.previous();
            if (val < target) {
                System.out.println("Removing smaller element: " + val);
                it.remove();
            } else {
                // Stop when we reach element >= target (excluding the target itself)
                it.next();   // move iterator forward again to target
                break;
            }
        }

        // Step 3: Remove the target
        if (it.hasNext()) {
            int val = it.next();
            if (val == target) {
                System.out.println("Removing target: " + val);
                it.remove();
            }
        }

        System.out.println("After all removals: " + list);
    }
}
