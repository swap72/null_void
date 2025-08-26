package Practice2;

public class SubsetArray {
    public static void main(String[] args) {
        int[] array1 = {1, 5};  // Test case
        int[] array2 = {8, 1, 5, 12, 37, 11, 41, 19};
        boolean isSubset = true;

        for (int i : array1) {
            boolean found = false;

            for (int j = 0; j < array2.length; j++) {
                if (i == array2[j]) {
                    found = true;
                    break;
                }
            }

            if (!found) {
                isSubset = false;
                break;
            }
        }

        System.out.println(isSubset ? "Subset Array" : "Not a Subset Array");
    }
}
