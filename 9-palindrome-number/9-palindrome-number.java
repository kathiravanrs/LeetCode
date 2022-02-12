class Solution {
    public boolean isPalindrome(int x) {
        boolean result = true;
        if(x<0) result = false;
        else{
            List<Integer> arr = new ArrayList<>();
            while(x>=10){
                int a = x%10;
                arr.add(a);
                x = x/10;
            }
            arr.add(x);
            
            for(int i=0;i<arr.size()/2;i++){
                if(arr.get(i)!=arr.get(arr.size()-1-i))
                {
                    result = false;
                    break;
                }
            }
            
        }
        return result;       
    }
}