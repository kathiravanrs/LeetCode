class Solution {
    public int maxArea(int[] height) {
//         Map<Integer, Integer> map = new TreeMap<>();
//         for(int i=0; i<height.length;i++){
//             map.put(i, height[i]);
//         }
//         System.out.println(map);
        
//         return 0;
        // int area = 0;
        // for(int i=0;i<height.length-1;i++){
        //     for(int j = i+1; j<height.length;j++){
        //         area = Math.max(Math.min(height[i], height[j])*(j-i), area);
        //     }
        // }
        // return area;
        
        int l = 0;
        int r = height.length-1;
        int h;
        int area = 0;
        while(l<r){
            h = Math.min(height[l], height[r]);
            area = Math.max(area, h * (r-l));
            if(h==height[l]){
                l++;
            }
            else r--;
        }
        return area;
    }
}