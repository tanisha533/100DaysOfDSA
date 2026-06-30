class Solution {
    public int minLength(String s) {
        //String target = "abc";
// int start = sb.indexOf(target);
// if (start != -1) {
//     sb.delete(start, start + target.length());
// }   
    StringBuilder sb=new StringBuilder();
    for(int i=0; i<s.length(); i++){
        sb.append(s.charAt(i));
    }
    while(sb.indexOf("AB") != -1 || sb.indexOf("CD") != -1 ){
        if(sb.indexOf("AB") != -1){
        int start = sb.indexOf("AB");
         sb.delete(start, start+2);
        }
        if(sb.indexOf("CD") != -1){
            int nstart = sb.indexOf("CD");
         sb.delete(nstart, nstart+2);
        }
    }
     return sb.length();
    }
}