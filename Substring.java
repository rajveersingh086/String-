package String;

class Substring {
    // Function to check if A is a subsequence of B
    public static boolean isSubSequence(String A, String B) {
        int n = A.length();
        int m = B.length();     
        int j = 0;  // Pointer for A

        for (int i = 0; i < m && j < n; i++) {  // Loop through B (main string)
            if (B.charAt(i) == A.charAt(j)) {
                j++;  // Move pointer in A when characters match
            }
        }
        return j == n;  // If j reaches n, A is a subsequence of B
    }

    public static void main(String[] args) {
        Substring ob = new Substring();
        String A = "abc";
        String B = "ahbgdc";

        boolean ans = ob.isSubSequence(A, B);
        System.out.println(ans ? "Yes" : "No"); // Expected Output: Yes
    }
}

