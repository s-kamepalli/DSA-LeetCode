class MyHashSet {
    boolean[] myset;   
    public MyHashSet() {
        myset = new boolean[1000001];
    }
    
    public void add(int key) {
        myset[key] =true;
    }
    
    public void remove(int key) {
        myset[key] =false;
    }
    
    public boolean contains(int key) {
       return myset[key]; 
    }
}