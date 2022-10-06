class TimeMap {
    Map<String, TreeMap<Integer, String>> map;
    public TimeMap() {
         map = new HashMap<>();
    }
    
    public void set(String key, String value, int timestamp) {
        TreeMap<Integer, String> cur = map.getOrDefault(key, new TreeMap<>());
        cur.put(timestamp, value);
        map.put(key, cur);
    }
    
    public String get(String key, int timestamp) {
        if(!map.containsKey(key)) return "";
        TreeMap<Integer, String> cur = map.get(key);
        Integer low = cur.floorKey(timestamp);
        return low==null? "":cur.get(low);
    }
}

/**
 * Your TimeMap object will be instantiated and called as such:
 * TimeMap obj = new TimeMap();
 * obj.set(key,value,timestamp);
 * String param_2 = obj.get(key,timestamp);
 */