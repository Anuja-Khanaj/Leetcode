public class String_Compression {
    public int compress(char[] chars) {
        StringBuilder sb = new StringBuilder();

        int count = 0;
        for(int i = 0;i<chars.length;i++){
            for(int j = i+1;j<chars.length;j++){
                if(chars[i]== chars[j]){
                    count++;
                }else{
                    sb.append(chars[i]);
                }
            }
        }

       return sb.toString().toCharArray().length;
    }
}
