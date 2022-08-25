public boolean canConstruct(String ransomNote, String magazine) {
        HashMap<Character, Integer> map = new HashMap<>();
        char[] a1 = ransomNote.toCharArray();
        for(char x : a1){
            map.put(x, map.getOrDefault(x, 0) + 1);
        }
        for(int i = 0; i < magazine.length(); i++){
            char c = magazine.charAt(i);
            if(map.containsKey(c)){
                map.put(c, map.getOrDefault(c,0) - 1);
                if(map.containsValue(0)){
                    map.remove(c);
                }
            }
        }
        return map.isEmpty();
    }
