public class Can_Place_Flowers {
    public static boolean positions(int flowerbed[],int n){
        int zero = 0;
        for(int i=0;i<flowerbed.length;i++){
           if(flowerbed[i]==0){
            boolean emptyRight = (i==0 || flowerbed[i-1]==0);
            boolean emptyLeft = (i==flowerbed.length-1 || flowerbed[i+1]==0);

            if(emptyLeft  && emptyRight){
                flowerbed[i] = 1;
                zero++;
            }
           }
        }

        if(zero>=n)
      return true;
      else return false;
    }
    public static void main(String[] args) {
        int flowerbed[] = {1,0,0,1};
        int n = 1;
       System.out.println( positions(flowerbed, n));
    }
}
