class Solution {
    public boolean isAlphanumeric(Character c) {
        if (('A' <= c && c <= 'Z') ||
            ('a' <= c && c <= 'z') ||
            ('0' <= c && c <= '9'))
            return true;
        
        return false;
    }

    public boolean isPalindrome(String s) {
        int i = 0, j = s.length() - 1;
        while(i <= j) {
            while(i < j && !isAlphanumeric(s.charAt(i)))
                i++;
            while(i < j && !isAlphanumeric(s.charAt(j)))
                j--;

            if (Character.toLowerCase(s.charAt(i)) != Character.toLowerCase(s.charAt(j))) {
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
}
