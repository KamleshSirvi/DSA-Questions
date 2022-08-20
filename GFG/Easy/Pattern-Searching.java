int search(String text, String pat) {
        // code here
        int pos = text.indexOf(pat);
        if(pos >= 0){
            return 1;
        }
        return 0;
    }
