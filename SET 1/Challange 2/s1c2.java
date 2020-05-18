import java.io.*; 
import java.util.*;
public class s1c2 {

    
    public static String xor(String a, String b){
        StringBuilder sb = new StringBuilder();
        for(int k=0; k < a.length(); k++)
           sb.append((a.charAt(k) ^ b.charAt(k + (Math.abs(a.length() - b.length()))))) ;
           return sb.toString();
    } 
    public static void main(String[] args) {
        String input1 = "1c0111001f010100061a024b53535009181c";
        String input2 = "686974207468652062756c6c277320657965";
        String str = input1;
        byte[] val = new byte[str.length() / 2];
        for (int i = 0; i < val.length; i++) {
           int index = i * 2;
           int j = Integer.parseInt(str.substring(index, index + 2), 16);
           val[i] = (byte) j;
        }
        System.out.println(val); 
        String str1 = input1;
        byte[] val1 = new byte[str1.length() / 2];
        for (int i = 0; i < val1.length; i++) {
           int index = i * 2;
           int j = Integer.parseInt(str.substring(index, index + 2), 16);
           val1[i] = (byte) j;
        }
        System.out.println(val1);
        String out1 = Arrays.toString(val);
        String out2 = Arrays.toString(val1);
        String ednd = s1c2.xor(out1, out2);
        System.out.print("\n"+ednd);


        
      //  System.out.println(output1+"\n"+output2);
    }
}