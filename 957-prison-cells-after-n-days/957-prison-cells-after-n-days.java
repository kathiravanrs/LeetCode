class Solution {

    public int[] prisonAfterNDays(int[] cells, int n) {
        HashMap<String, Integer> map = new HashMap<>();
        for(int i=0;i<n;i++) {
            String s = str(cells);
            if(map.containsKey(s)){
                int diff = (i-map.get(s));
                while(i+diff<n) i+=diff;
            }
            else{
                map.put(s,i);
            }
            cells = nextDay(cells);
        }
        return cells;
    }

    public int[] nextDay(int[] cells) {
        int[] res = new int[cells.length];
        res[0] = 0;
        for (int i = 1; i < cells.length - 1; i++) {
            if (cells[i - 1] == cells[i + 1]) res[i] = 1; else res[i] = 0;
        }
        res[cells.length - 1] = 0;
        return res;
    }
    
    public String str(int[] cells){
        StringBuilder b= new StringBuilder();
        for(int a:cells){b.append(a);}
        return b.toString();
    }
}
