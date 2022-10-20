class Solution {
    public String intToRoman(int num) {
        if(num==0) return "";
        TreeMap<Integer, String> map = new TreeMap<>(Collections.reverseOrder());
        map.put(1,"I");
        map.put(2,"II");
        map.put(3,"III");
        map.put(4,"IV");
        map.put(5,"V");
        map.put(6,"VI");
        map.put(7,"VII");
        map.put(8,"VIII");
        map.put(9,"IX");
        map.put(10,"X");
        
        map.put(50,"L");
        map.put(100,"C");
        map.put(500,"D");
        map.put(1000,"M");
        
        map.put(40,"XL");
        map.put(90,"XC");
        map.put(400,"CD");
        map.put(900,"CM");
        
        if(map.containsKey(num)) return map.get(num);
        StringBuilder b = new StringBuilder();
        for(int i: map.keySet()){
            if(num>=i){
                b.append(map.get(i));
                num -= i;
                return b.append(intToRoman(num)).toString();
            }
        }
        return b.toString();
    }
}