package Arrays;

public class Jewels_Stones {
    public static void main(String[] args) {
        System.out.println(numJewelsInStones("B" , "aAAbbbb"));
    }

    public static int numJewelsInStones(String jewels, String stones) {
        int count = 0;
        if(jewels.length() < 1 || stones.length() > 50)
            return 0;
        else{

            for (int i = 0; i < jewels.length(); i++) {
                char type = jewels.charAt(i);
               for (int j = 0; j < stones.length(); j++){
                    char stone   =stones.charAt(j);
                    if(type == stone){
                        count++;
//                        break;
                    }
               }
            }
        }
        return count;
    }
}
