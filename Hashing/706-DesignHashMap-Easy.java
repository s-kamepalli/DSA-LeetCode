class MyHashMap {

    int[] mymap;
    public MyHashMap() {
        mymap = new int[1000001];
        Arrays.fill(mymap, -1);
    }
    
    public void put(int key, int value) {
        mymap[key] = value;;
    }
    
    public int get(int key) {
        return mymap[key];
    }
    
    public void remove(int key) {
        mymap[key] = -1;
    }
}