import java.util.*;

public class CaesarCipher {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        char[] letters = in.next().toCharArray();
        int key = in.nextInt();
        in.close();
        
        key = keyCleaner(key);
        for(int i = 0; i < n; i++){
            if((int)letters[i] < 123 && (int)letters[i] >96){
                if((int)letters[i] > (122 - key)){
                    letters[i] = (char)(((int)letters[i] + key) - 122 + 96);
                }else{
                    letters[i] = (char)((int)letters[i] + key);
                }
            }
            if((int)letters[i] < 91 && (int)letters[i] > 64){
                if((int)letters[i] > (90 - key)){
                    letters[i] = (char)(((int)letters[i] + key) - 90 + 64);
                }else{
                    letters[i] = (char)((int)letters[i] + key);
                }
            }
        }
        for(char word : letters){
            System.out.print(word);
        }
    }
    
    static int keyCleaner(int key){
        while(key > 26){
            key -= 26;
        }
        return key;
    }
}
