import java.util.Base64;

 

public class s1c1 {
       static String hextoascii(String hexstr) {
    StringBuilder output = new StringBuilder();
    for(int i=0;i<hexstr.length();i=i+2){
        String str = hexstr.substring(i,i+2);
         output.append((char)Integer.parseInt(str,16));
       
    }
    return output.toString();
    


    }
    public static void main(String[] args) {
        String input = "49276d206b696c6c696e6720796f757220627261696e206c696b65206120706f69736f6e6f7573206d757368726f6f6d";
       String out= s1c1.hextoascii(input);
      System.out.print("\n"+out);
      Base64.Encoder encoder = Base64.getUrlEncoder();  
      String eStr = encoder.encodeToString(out.getBytes());  
      System.out.print("\n"+eStr);

    }
}