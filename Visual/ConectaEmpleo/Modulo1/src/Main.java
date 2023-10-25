public class Main {
    /**
     * @param args
     */
    public static void main(String[] args) {

        int i=0, a=0, b=4;
        a = b++;
        System.out.println(a);
        System.out.println(b);

        while(i++<10){
        
        if (++i%3!=0) continue;
        
        System.out.print (" El numero es "+i);
        int[ ] miArray = new int[3];
        System.out.println(miArray);
        int[ ] miArrayb = {1,2,3};
        System.out.println(miArrayb);
        int[ ] miArrayc = new int[ ]{1,2,3};
        System.out.println(miArrayc);
        }
    
    }
  
} 