

class Main {
    // Function to check if a substring
    // s[i..j] is a palindrome
    static boolean isPalindrome(String s, int i, int j) {
        while (i < j) {
            if (s.charAt(i) != s.charAt(j)) return false;
            i++;
            j--;
        }
        return true;
    }
    static int countPS(String s) {
        int n = s.length();
        // Consider all possible substrings of lengths
        // more than 1
        int res = 0;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                // If substring from i to j is palindrome
                // increment the result
                if (isPalindrome(s, i, j))
                    res++;
            }
        }
        return res;
    }
    public static void main(String[] args) {
        String s = "abaab";
        System.out.println(countPS(s));
    }
}




public class Main {
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


public class Main {
    public static void main(String[] args) {
        int[] arr = {1, 9, 23, 84, 72, 82, 73, 97};
        int target = 72;

        int index = findIndex(arr, target);

        if (index != -1) {
            System.out.println("Element " + target + " found at index: " + index);
        } else {
            System.out.println("Element " + target + " not found.");
        }
    }

    static int findIndex(int[] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target)
                return i;
        }
        return -1; // Return -1 if not found
    }
}


public class Main {
    public static boolean isValid(String s) {
        int balance = 0;

        for (char c : s.toCharArray()) {
            if (c == '(') {
                balance++;
            } else if (c == ')') {
                balance--;
            }

            // If balance goes negative, there's an unmatched closing parenthesis
            if (balance < 0) {
                return false;
            }
        }

        // If balance is zero, parentheses are matched
        return balance == 0;
    }

    public static void main(String[] args) {
        System.out.println(isValid("()")); // true
        System.out.println(isValid("(()())")); // true
        System.out.println(isValid("())")); // false
        System.out.println(isValid("(()")); // false
    }
}

class Main{
    public static void main(String[] args) {
        int n=369,rev=0;
        while(n!=0){
            int digit=n%10;
            rev=rev*10+digit;
            n=n/10;
        }
        System.out.println(rev);
    }
}


public class Main {
    public static void main(String[] args) {
        String s="chocolate";
        char[] ar1=s.toCharArray();
        char[] ar2=s.toCharArray();

        for (int i = 0; i < ar1.length; i++) {
            int count=0; char c=ar1[i];
            for (int j = 0; j < ar2.length; j++) {
                if(ar2[j]==c){
                    count++;
                    ar2[j]='\0';
                }
            }
            if(count>0){
                System.out.println(c+"-"+count);
            }
        }

    }
}



class Main {
    static boolean areAnagrams(String s1, String s2) {
        // Handle null cases
        if (s1 == null || s2 == null) {
            return false;
        }

        // Convert to lowercase and sort
        char[] s1Array = s1.toLowerCase().toCharArray();
        char[] s2Array = s2.toLowerCase().toCharArray();
        Arrays.sort(s1Array);
        Arrays.sort(s2Array);

        return Arrays.equals(s1Array, s2Array);
    }

    public static void main(String[] args) {
        String s1 = "Listen";
        String s2 = "Silent";
        System.out.println(areAnagrams(s1, s2));  // true (case-insensitive check)
    }
}

class Main{
    static int fact(int a){
        if(a==0||a==1){
            return 1;
        }
        else{
            return a*fact(--a);
        }
    }
    public static void main(String[] args) {
        int num=40585,cpnum=num,sum=0;
        while(num!=0){
            sum=sum+(fact(num%10));
            num=num/10;
        }
        System.out.println(sum==cpnum);
    }
}



public class Main {
    public static void main(String[] args) {
        String s1 = "345351";
        char[] c1 = s1.toCharArray();
        Arrays.sort(c1);
        String big = new StringBuilder().append(c1).reverse().toString();
        System.out.println(big);
    }
}



palindrome substring
subset of an array
bubble sort
return index of a specific element
bracket balancing

character frequency
staircase pattern
shift/rotate an array 2 places left


strong
Armstrong
digitcount
digit sum
fact
fib



