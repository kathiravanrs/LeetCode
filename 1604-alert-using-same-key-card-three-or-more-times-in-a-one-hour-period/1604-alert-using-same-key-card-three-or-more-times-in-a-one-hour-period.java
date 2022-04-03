class Solution {

    public List<String> alertNames(String[] keyName, String[] keyTime) {
        HashMap<String, List<String>> map = new HashMap<>();
        List<String> res = new ArrayList<>();
        for (int i = 0; i < keyName.length; i++) {
            String n = keyName[i];
            String t = keyTime[i];

            List<String> l;

            if (map.containsKey(n)) {
                l = map.get(n);
            } else {
                l = new ArrayList<>();
            }
            l.add(t);
            map.put(n, l);
        }
        // System.out.println(map);
//         List<String> d = Arrays.asList("11:00","11:01","11:02");

//         System.out.println(checkList(d));
        for(Map.Entry<String,List<String>> e: map.entrySet()){
            if(checkList(e.getValue())) res.add(e.getKey());
        }
        Collections.sort(res);
        return res;
    }

    public boolean checkList(List<String> s) {
        Collections.sort(s);
        for (int i = 0; i < s.size()-1; i++) {
            int count = 1;
            for (int j = i+1; j < s.size(); j++) {
                if (check(s.get(i), s.get(j))) {
                    // System.out.println(s.get(i)+"---"+s.get(j));
                    count++;
                    if (count > 2) return true;
                }
                else break;
            }
        }
        return false;
    }

    public boolean check(String f, String s) {
        String[] ff = f.split(":");
        int h1 = Integer.valueOf(ff[0]);
        int m1 = Integer.valueOf(ff[1]);

        String[] ss = s.split(":");
        int h2 = Integer.valueOf(ss[0]);
        int m2 = Integer.valueOf(ss[1]);

        int hd = h2 - h1;

        if (hd == 0) return true; else {
            if (hd == 1) {
                return m2 <= m1;
            }
            if (hd == -1) {
                return m1 <= m2;
            }
        }
        return false;
    }
}
