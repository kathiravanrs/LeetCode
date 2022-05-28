class Solution {
    public List<String> fizzBuzz(int n) {
        List<String> l = new ArrayList<>();
        for(int i = 1;i<=n;i++){
            boolean by3 = (i%3==0);
            boolean by5 = (i%5==0);
            String s = String.valueOf(i);
            if(by3) s = "Fizz";
            if(by5) s = "Buzz";
            if(by3 && by5) s = "FizzBuzz";
            l.add(s);
        }
        return l;
    }
}