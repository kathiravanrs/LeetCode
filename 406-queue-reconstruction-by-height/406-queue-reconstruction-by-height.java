class Solution {

    public int[][] reconstructQueue(int[][] people) {
        
        Arrays.sort(people, new Comparator<int[]>(){
            public int compare(int[] o1, int[] o2){
                return o1[0]==o2[0]?o1[1] - o2[1] :o2[0] - o1[0];
            }
        });
        
        List<int[]> l = new LinkedList<>();
        for(int[] p:people){
            l.add(p[1],p);
        }        
        int[][] res = new int[people.length][2];
        return l.toArray(res);
//         Set<Integer> set = new HashSet<>();
//         for (int j = 0; j < people.length; j++) {
//             int min = Integer.MAX_VALUE;
//             int pos = -1;
//             int init = -1;
//             for (int i = 0; i < people.length; i++) {
//                 if (people[i][0] == -1) continue;
//                 min = Math.min(min, people[i][0]);
//                 if (min == people[i][0]) {
//                     pos = people[i][1];
//                     init = i;
//                 }
//             }
//             if (pos != -1) {
                
//                 res[pos][0] = min;
//                 res[pos][1] = pos;
//                 people[init][0] = -1;
//             }
//         }
        // return res;
        // // int[][] res =         
        // return people;
    }
}
