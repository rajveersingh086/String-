public class wordpattern {
    
    public boolean wordPattern(String pattern, String s) {
        String[] words = s.split(" ");
        if (pattern.length() != words.length) return false;

        Map<Character, String> map1 = new HashMap<>();
        Map<String, Character> map2 = new HashMap<>();

        for (int i = 0; i < pattern.length(); i++) {
            char ch = pattern.charAt(i);
            String word = words[i];

            // Check
            if (map1.containsKey(ch) && !map1.get(ch).equals(word)) return false;
            if (map2.containsKey(word) && map2.get(word) != ch) return false;

            // Add new mappings
            map1.put(ch, word);
            map2.put(word, ch);
        }
        return true;
    }

    public static void main(String[] args) {
        Solution sol = new Solution();
        System.out.println(sol.wordPattern("abba", "dog cat cat dog")); // Output: true
        System.out.println(sol.wordPattern("abba", "dog cat cat fish")); // Output: false
        System.out.println(sol.wordPattern("aaaa", "dog cat cat dog")); // Output: false
        System.out.println(sol.wordPattern("abba", "dog dog dog dog")); // Output: false
    }
}
