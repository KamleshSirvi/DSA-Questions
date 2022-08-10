int  select(int arr[], int i)
	{
        // code here such that selectionSort() sorts arr[]
        int temp = Integer.MAX_VALUE;
        // int res = 0;
        for(int k = i; k < arr.length; k++){
            temp = Math.min(temp, arr[k]);
        }
        // System.out.println(temp);
        // return the index of minimum element in the array = 
        return temp;
	}
	
	void selectionSort(int arr[], int n)
	{
	    //code here
	    
	    int index = 0;
	    for(int i = 0; i < n-1; i++){
	        int min = select(arr, i);
	       // int index;
	        for(int j = 0; j < arr.length; j++){
	        if(arr[j] == min){
	            index = j;
	        }
	    }
	       // int z = arr[index];
	        // swap the ith element with index element 
	        int temp = arr[i];
	        arr[i] = arr[index];
	        arr[index] = temp;
	    }
	}
