// using sorting and hashSet
public int[] intersection(int[] nums1, int[] nums2) {
        HashSet<Integer> set = new HashSet<>();
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        int i = 0; 
        int j = 0;
        while(i < nums1.length && j < nums2.length){
            if(nums1[i] == nums2[j]){
                set.add(nums1[i]);
                i++;
                j++;
            }else if(nums1[i] > nums2[j]){
                j++;
            }else{
                i++;
            }
        }
        int[] arr = new int[set.size()];
        int k = 0;
        for(int x : set){
            arr[k++] = x;
        }
        return arr;
    }

// using two hashSet
public int[] intersection(int[] nums1, int[] nums2) {
        HashSet<Integer> set = new HashSet<>();
        HashSet<Integer> set1 = new HashSet<>();
  
        for(int x : nums1){
            set.add(x);
        }
//   count return the number of common element in the both array
        int count = 0;
        for(int x : nums2){
            if(set.contains(x)){
                set1.add(x);
                count++;
                set.remove(x);
            }
        }
        int[] arr = new int[set1.size()];
        int i = 0;
        for(int x : set1){
            arr[i++] = x;
        }
        return arr;
    }
