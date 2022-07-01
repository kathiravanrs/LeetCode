class Solution {

    public int maximumUnits(int[][] boxTypes, int truckSize) {
        Arrays.sort(
            boxTypes,
            new Comparator<int[]>() {

                public int compare(int[] a, int[] b) {
                    return Integer.compare(b[1], a[1]);
                }
            }
        );
        
        
        int box = 0;
        for (int[] a : boxTypes) {
            if(truckSize==0) break;
            if(a[0]<=truckSize){
                box += a[1] * a[0];
                truckSize -= a[0];
            }
            else{
                box += a[1] * truckSize;
                truckSize = 0;
            }
        }
        return box;
    }
}
