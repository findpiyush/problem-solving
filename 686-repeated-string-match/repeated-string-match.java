class Solution {
    public int repeatedStringMatch(String a, String b) {
        int count = 0;
        StringBuilder temp = new StringBuilder();

        while(temp.length()<b.length())
        {
            temp.append(a);
            count++;
        }
        if(temp.toString().contains(b))
        {
            return count;
        }
        if(temp.append(a).toString().contains(b))
        {
            return count+1;
        }
        return -1;
    }
}