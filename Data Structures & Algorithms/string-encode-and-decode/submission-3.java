class Solution {

    public String encode(List<String> strs) {
        StringBuilder res = new StringBuilder();
        for (String s : strs) {
            res.append(s.length()).append('#').append(s);
        }
        return res.toString();
    }

    public List<String> decode(String str) {
        List<String> res = new ArrayList<>();
        int i = 0;

    while (i < str.length()) {
        int delimiterIndex = str.indexOf('#', i);
        int length = Integer.parseInt(str.substring(i, delimiterIndex));

        // Read the exact substring using the length
        res.add(str.substring(delimiterIndex + 1, delimiterIndex + 1 + length));

        // Advance index past the word
        i = delimiterIndex + 1 + length;
    }
        return res;
    }
}
