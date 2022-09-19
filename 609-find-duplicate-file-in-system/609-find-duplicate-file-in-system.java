class Solution {
    public List<List<String>> findDuplicate(String[] paths) {
        List<List<String>> ans = new ArrayList<>();
        Map<String, List<String>> map = new HashMap<>();
        for(String p: paths){
            String[] arr = p.split(" ");
            String path = arr[0];
            for(int i=1;i<arr.length;i++){
                String[] file = arr[i].split("[(]");
                String fileName = file[0];
                String content = file[1];
                String fullPath = (path+"/"+ fileName);
                if(!map.containsKey(content)){
                    map.put(content, new ArrayList<>());
                }
                List<String> l = map.get(content);
                l.add(fullPath);
            }            
        }
        System.out.println(map);
        for(List<String> l: map.values()){
            if(l.size()>1) ans.add(l);
        }
        
        return ans;
    }
}