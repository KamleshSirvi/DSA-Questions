public static int NumberofElementsInIntersection(int a[], int b[], int n, int m) {
        // Your code here
        // put array a into hash set
        HashSet<Integer> h = new HashSet<>();
        for(int x : a){
            h.add(x);
        }
        int count = 0;
        for(int x : b){
        // if element is found then we remove that element from hash Table 
        // because if we didn't remove that element and that element repeatedly present in array b then it counts that element multiple times 
            if(h.contains(x)){
                count++;
                h.remove(x);
            }
        }
        return count;
    }
