class Solution {
    public int calPoints(String[] operations) {
        ArrayList<Integer> list=new ArrayList<>();
        for(String s:operations)
        {
            int n=list.size();
            if(s.equals("C"))
            list.remove(n-1);
            else if(s.equals("D"))
            list.add(list.get(n-1)*2);
            else if(s.equals("+"))
            list.add(list.get(n-1)+list.get(n-2));
            else
            list.add(Integer.parseInt(s));
        }
        int sum=0;
        for(int n:list)
        {
            sum+=n;
        }
        return sum;
    }
}