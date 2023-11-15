package hashingTechnique;
// NOTE- Math.pow() has some over head and also it words in 'double' so make your own function if need be. Mostly no issue in this case.

public class learningHashFunction {

    // A prime base for the hash function. (Basically number to use as base/start point.)
	// And since prime numbers are only divisible by 1 and itself. it is most safe to avoid collision. 
    private static final int PRIME_BASE = 101;
        
    public static void rabinKarp(String text, String pattern) {
        int textLen = text.length();
        int patternLen = pattern.length();
        // Calculate the hash value of the pattern.
        long patternHash = hash(pattern, patternLen);
        // Calculate the initial hash value of the first substring in the original-text.
        long textHash = hash(text.substring(0, patternLen), patternLen);

        // Iterate through the text to find pattern matches.
        // Basically logic here is that, numbers can be easily compared, then strings.
        for(int i = 0; i <= textLen - patternLen; i++) {
            // Check if the hash values match and verify the substring for equality. (only when hash match, we will search string).
            if (patternHash == textHash && checkEquality(text, i, pattern)) {
                System.out.println("Pattern found at index " + i);
            }
            // Update the rolling hash for the next substring. (we are moving to next substring while, all while 'i' is still zero.)
            if (i < textLen - patternLen) {
                textHash = updateHash(textHash, patternLen, text.charAt(i), text.charAt(i + patternLen));
            }
        }
    }

    // Hash function for a substring of specified length
    private static long hash(String str, int length) {
        long hashValue = 0;
        for (int i = 0; i < length; i++) {
            // 1. multiplying hash value with prime_base helps widen the number and remove chances of collision.
        	// 2. Now every iteration we introduce ASCI value of each char to above value.
        	// 3. Our entire hash value is then taken modulus with max integer value. This is done to keep range within limits of 'int'. 
            hashValue = (hashValue * PRIME_BASE + str.charAt(i)) % Integer.MAX_VALUE;
        }
        return hashValue;
    }

    // Update the rolling hash for the next substring. (Instead of calculating new hash every time, we remove old and add new ).
    private static long updateHash(long hashValue, int length, char oldChar, char newChar) {
        // 1. 'hashValue' is our pre-calculated hash value.
    	// 2. 'oldChar * pow(PRIME_BASE, length - 1)' <- to find hash we used to multiple hash value with prime_base.
    	//				       similarly to remove a char from, we have to multiply char we want to remove with prime_base^length of pattern.
    	// 3. Finally we multiply by prime_base, as pow(primebase, len-1) removed space, we have to create new space to add newChar.
    	// 4. In the end new char is added. 
        long updatedHash = (hashValue - oldChar * (long)Math.pow(PRIME_BASE, length - 1)) * PRIME_BASE + newChar;

        // 1. Adding max_value just shifts any number to +ve side.
        // 2. As we know taking modulus Ensure the hash value remains within range of 'int'.
        return (updatedHash + Integer.MAX_VALUE) % Integer.MAX_VALUE;

    }

    // This is better then using equals, as this means we can avoid using 2 built in functions. (.equals() & .substring())
    private static boolean checkEquality(String str1, int start, String str2) {
        for (int i = 0; i < str2.length(); i++) {
            // Compare characters of the two substrings
            if (str1.charAt(start + i) != str2.charAt(i)) {
                return false;
            }
        }
        return true;
    }

    // Main method for testing the Rabin-Karp algorithm
    public static void main(String[] args) {
        String text = "abcabcababcabcabc"; // 17
        String pattern = "abc"; // 3

        // Run the Rabin-Karp algorithm
        rabinKarp(text, pattern);
    }
}