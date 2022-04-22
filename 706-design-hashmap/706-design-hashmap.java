class MyHashMap {

    int[] key;
    int[] val;
    public MyHashMap() {
        key = new int[10000000];
        val = new int[10000000];
    }
    
    public void put(int k, int value) {
        key[k] = 1;
        val[k] = value;
    }
    
    public int get(int k) {
        if(key[k]==1) return val[k];
        return -1;
    }
    
    public void remove(int k) {
        val[k] = 0;
        key[k] = 0;
    }
}

/**
 * Your MyHashMap object will be instantiated and called as such:
 * MyHashMap obj = new MyHashMap();
 * obj.put(key,value);
 * int param_2 = obj.get(key);
 * obj.remove(key);
 */