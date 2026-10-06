class Solution {
    public String reverseOnlyLetters(String s) {
        char[] arr= s.toCharArray();
        int left=0;
        int right=arr.length-1;

        while(left<right){
            while(left<right && !isletter(arr[left])){
                left++;
            }
                        while(left<right && !isletter(arr[right])){
                right--;
            }
            char ch;
            ch=arr[left];
            arr[left]=arr[right];
            arr[right]=ch;
            left++;
            right--;
        }
        return new String(arr);
    }
            private boolean isletter(char c){
        if((c>='a' && c<='z') || (c>='A' && c<='Z')){
            return true;
        }else{
            return false;
        }
}
}