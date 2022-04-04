class Solution {
    public String[] findRestaurant(String[] list1, String[] list2) {
        int idx = list1.length + list2.length;
        List<String> res = new ArrayList<>();
        for(int i = 0; i<list1.length;i++){
            for(int j = 0; j<list2.length;j++){
                if(list1[i].equals(list2[j])){
                    if(i+j> idx) continue;
                    if(i+j<idx){
                        res = new ArrayList<>();
                    }
                        res.add(list1[i]);
    
                    idx = i+j;
                }
            }
        }
        return res.toArray(new String[res.size()]);
    }
}