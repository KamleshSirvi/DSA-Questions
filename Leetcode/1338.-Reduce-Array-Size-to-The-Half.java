public int minSetSize(int[] arr) {
        HashMap<Integer, Integer> map = new HashMap<>();
        ArrayList<Integer> list = new ArrayList<>();
        for(int x : arr){
            map.put(x, map.getOrDefault(x,0) + 1);
        }
        for(Map.Entry<Integer, Integer> e : map.entrySet()){
            list.add(e.getValue());
        }
        Collections.sort(list);
        Collections.reverse(list);
        
        int sum = 0;
        for(int i = 0; i < list.size(); i++){
            sum = sum + list.get(i);
            if(sum >= arr.length/2){
                return i + 1;
            }
        }
        return 0;
    }
