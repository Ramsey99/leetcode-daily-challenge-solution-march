class Solution {
    public String customSortString(String order, String s) {
        Character[] cO = new Character[s.length()];

        for (int i = 0; i < s.length(); i++) {
            cO[i] = s.charAt(i);
        }

        Arrays.sort(cO, new Comparator<Character>() {
           
        public int compare(Character c1, Character c2) {
            return order.indexOf(c1) - order.indexOf(c2);
            }
        });

        StringBuilder res = new StringBuilder();
        for (char c : cO) {
            res.append(c);
        }

        return res.toString();     
    }
}