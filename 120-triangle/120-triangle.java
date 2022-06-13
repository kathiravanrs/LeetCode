class Solution {
    public int minimumTotal(List<List<Integer>> triangle) {
        for(int i = 1;i<triangle.size();i++){
            for(int j = 0;j<triangle.get(i).size();j++){
                int cur = triangle.get(i).get(j);
                int min = Integer.MAX_VALUE;
                try{
                    min = Math.min(min, triangle.get(i-1).get(j-1));
                }
                catch(Exception e){
                    
                }
                try{
                    min = Math.min(min, triangle.get(i-1).get(j));
                }
                catch(Exception e){
                    
                }
//                 try{
//                     min = Math.min(min, triangle.get(i-1).get(j+1));
//                 }
//                 catch(Exception e){
                    
//                 }
                triangle.get(i).set(j, min+cur);
            }
        }
        int min = Integer.MAX_VALUE;
        for(int a: triangle.get(triangle.size()-1)){
            min = Math.min(min, a);
        }
        return min;
    }
}