package fundamentos;

public class ConversaoTipoPrimitivoNumerico {
  public static void main(String[] args) {
    
    double a = 1; // implicita
    System.out.println(a);
    
    float b = (float) 1.123987928799; // explicita (Cast)
    System.out.println(b);
    
    float c = (float) b;
    System.out.println(c);

    int d = 128;
    byte e = (byte) d; // explicita (Cast)
    System.out.println(e);
  }  
}
