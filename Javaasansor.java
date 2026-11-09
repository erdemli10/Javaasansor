
import java.util.Scanner;


public class Javaasansor {

    public static void main(String[] args) {
  
        Scanner sc = new Scanner (System.in);
        
        System.out.println("mevcut katiniz nedir:");
        
        int mevcut = sc.nextInt();
        
        System.out.println("Hedef katiniz:");
        
        int hedef = sc.nextInt();
        
        int mesafe =  Math.abs(hedef - mevcut);
        if (mevcut > 10 || 0 > mevcut || hedef > 10 || 0 > hedef)   { 
            System.out.println("yanlis bir sayi girdiiniz");
            
           } else if (hedef > mevcut) { 
            System.out.println("asansor " + mesafe + " kat yukariya gidecektir.");  
              } else if (mevcut > hedef) { 
                  System.out.println("asansor " + mesafe + " kat asagiya gidecektir.");
                  } else { 
                  System.out.println("asansor hareket etmeyecektir.");
               
           }
           
            
            
        }
        
        
        
        
        
        
        
        
    }

