class MyHashSet {
    int[] ar;
    public MyHashSet() {
        ar = new int[10000000];
        
    }
    
    public void add(int key) {
        ar[key] = 1;
    }
    
    public void remove(int key) {
        ar[key] = 0;
    }
    
    public boolean contains(int key) {
        return ar[key]==1;
    }
}

/**
 * Your MyHashSet object will be instantiated and called as such:
 * MyHashSet obj = new MyHashSet();
 * obj.add(key);
 * obj.remove(key);
 * boolean param_3 = obj.contains(key);
 */