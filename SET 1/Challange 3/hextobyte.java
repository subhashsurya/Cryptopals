import java.util.Base64;

public class hextobyte {
    static String hextoascii(String hexstr) {
        StringBuilder output = new StringBuilder();
        for(int i=0;i<hexstr.length();i=i+2){
            String str = hexstr.substring(i,i+2);
             output.append((char)Integer.parseInt(str,16));
           
        }
        return output.toString();
          }
public static String xor(String a, String b){
            StringBuilder sb = new StringBuilder();
            for(int k=0; k < a.length(); k++)
               sb.append((a.charAt(k) ^ b.charAt(k + (Math.abs(a.length() - b.length()))))) ;
               return sb.toString();
        }


    public static void main(String[] args) {
        String input1 = "1c0111001f010100061a024b53535009181c";
        String input2 = "686974207468652062756c6c277320657965";
       String str1 =hextobyte.hextoascii(input1);    
       String str2 =hextobyte.hextoascii(input2);
       Base64.Encoder encoder = Base64.getUrlEncoder();  
       String b641 = encoder.encodeToString(str1.getBytes()); 
       String b642 = encoder.encodeToString(str2.getBytes()); 
       System.out.print("\n"+b641);
       System.out.println("\n"+b642);
     String fin = hextobyte.xor(str1,str2);
     System.out.println(fin);
       

    }
}