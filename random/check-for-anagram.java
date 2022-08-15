
public class anagram {
    static boolean method1(String s1, String s2){
        // base case if length of both string is not same
        if(s1.length() != s2.length()){
            return false;
        }
        char[] arr1 = new char[s1.length()];
        char[] arr2 = new char[s2.length()];
        for(int i = 0; i < s1.length(); i++){
            arr1[i] = s1.charAt(i);
            arr2[i] = s2.charAt(i);
        }
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        for(int j = 0; j < s1.length(); j++){
//            System.out.println("first array is : " + arr1[j]);
            if(arr1[j] != arr2[j]){
                return false;
            }
        }
        return true;
    }
    // method 2
    static boolean method2(String s1, String s2){
        int[] count = new int[256];
        for(int i = 0; i < s1.length(); i++){
            count[s1.charAt(i)]++;
            count[s2.charAt(i)]--;
        }
        for(int i = 0; i < 256; i++){
            if(count[i] != 0){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args){
        String s1 = "listen";
        String s2 = "silent";
        System.out.println(method1(s1,s2));
        System.out.println(method2(s1,s2));
    }
}
