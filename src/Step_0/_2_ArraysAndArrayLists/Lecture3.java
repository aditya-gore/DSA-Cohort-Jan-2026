package Step_0._2_ArraysAndArrayLists;

import java.util.*;

/**
 * ARRAYLIST DSA QUICK REFERENCE
 * ---------------------------------
 * Covers:
 * 1. Creation
 * 2. Add / Get / Set
 * 3. Traversal methods
 * 4. Remove (index vs value)
 * 5. Common mistakes
 * 6. Iterators
 * 7. Conversion
 * 8. Time complexity notes
 */
public class Lecture3 {

    public static void main(String[] args) {

        // ===============================
        // 1️⃣ CREATION
        // ===============================

        ArrayList<Integer> list = new ArrayList<>();      // default capacity (10)
        ArrayList<Integer> listWithCap = new ArrayList<>(20); // custom capacity

        // ArrayList<int> ❌ (primitive not allowed)
        // ArrayList<Integer> ✅ (wrapper class)

        // ===============================
        // 2️⃣ ADD ELEMENTS
        // ===============================

        list.add(10);   // O(1) amortized
        list.add(20);
        list.add(30);

        list.add(1, 15); // insert at index → O(n)

        System.out.println("After add: " + list);

        // ===============================
        // 3️⃣ GET & SET
        // ===============================

        int first = list.get(0);    // O(1)
        list.set(2, 99);            // replace value at index → O(1)

        System.out.println("After set: " + list);

        // ===============================
        // 4️⃣ SIZE & CONTAINS
        // ===============================

        System.out.println("Size: " + list.size());
        System.out.println("Contains 20? " + list.contains(20));

        // ===============================
        // 5️⃣ TRAVERSAL METHODS
        // ===============================

        // a) Index-based loop (BEST for DSA)
        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i) + " ");
        }
        System.out.println();

        // b) Enhanced for-loop
        for (int x : list) {
            System.out.print(x + " ");
        }
        System.out.println();

        // ===============================
        // 6️⃣ REMOVE ELEMENTS (VERY IMPORTANT)
        // ===============================

        list.remove(1); // removes element at index 1

        // To remove value, not index
        list.remove(Integer.valueOf(99));

        System.out.println("After remove: " + list);

        // ===============================
        // 7️⃣ COMMON MISTAKE (DON'T DO THIS)
        // ===============================

        // ❌ Removing while iterating forward causes skipping
        /*
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) == 20) {
                list.remove(i); // BUG
            }
        }
        */

        // ✅ Correct way: iterate backwards
        for (int i = list.size() - 1; i >= 0; i--) {
            if (list.get(i) == 20) {
                list.remove(i);
            }
        }

        System.out.println("After safe removal: " + list);

        // ===============================
        // 8️⃣ ITERATOR (SAFE REMOVAL)
        // ===============================

        list.add(40);
        list.add(50);

        Iterator<Integer> it = list.iterator();
        while (it.hasNext()) {
            int val = it.next();
            if (val == 40) {
                it.remove(); // safe
            }
        }

        System.out.println("After iterator removal: " + list);

        // ===============================
        // 9️⃣ CONVERSIONS
        // ===============================

        // Array → ArrayList
        Integer[] arr = {1, 2, 3};
        ArrayList<Integer> fromArray = new ArrayList<>(Arrays.asList(arr));
        System.out.println("From array: " + fromArray);

        // ArrayList → Array
        Integer[] backToArray = fromArray.toArray(new Integer[0]);
        System.out.println("Back to array length: " + backToArray.length);

        // ===============================
        // 🔟 CLEAR & EMPTY CHECK
        // ===============================

        fromArray.clear();
        System.out.println("Is empty? " + fromArray.isEmpty());

        // ===============================
        // 📌 TIME COMPLEXITY SUMMARY
        // ===============================
        /*
         * get(index)      → O(1)
         * set(index)      → O(1)
         * add(end)        → O(1) amortized
         * add(middle)    → O(n)
         * remove(index)  → O(n)
         * contains       → O(n)
         */
    }
}
