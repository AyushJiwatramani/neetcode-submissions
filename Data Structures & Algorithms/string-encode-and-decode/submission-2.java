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
        for (int i = 0; i < str.length(); i++) {
            for (int j = i; j < str.length(); j++) {
                if (str.charAt(j) == '#') {
                    int length = Integer.parseInt(str.substring(i, j));

                    res.add(str.substring(j+1, j+1+length));
                    i = j + length;
                    break;
                }
            }
        }
        return res;
    }
}
