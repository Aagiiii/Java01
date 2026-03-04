

public class Main {
    public static void main(String[] args) {
        int[] a  ={1,4,6,7,8};
        int[] b  =new int[a.length +2];
        for (int i = 0; i < a.length; i++) {
          b[i]=a[i];

        //   System.out.println(b[i]);
        }
        b[b.length-2]=10;
        b[b.length-1]=11;

        a = new int[b.length];
        for (int i = 0; i < b.length; i++) {
            a[i] = b[i];
        }

            System.out.print("[");
        for (int i = 0; i < a.length; i++) {
            if (i<a.length-1 ) {
                System.out.print(a[i] + ", ");
            } else{
                System.out.print(a[i]);
            }
            
        }
        System.out.println("]");
       System.out.println("=======");
        a[2]=3;
      
        // int[] c = {0};
        int[] c = new int[a.length +1];
        System.out.println(c.length);
        System.out.println(a.length);
         c[0] =0;
        for (int i = 1; i <c.length; i++) {
             
            c[i] =a[i-1];
        }

           System.out.print("[");
        for (int i = 0; i < c.length; i++) {
            if (i<c.length-1 ) {
                System.out.print(c[i] + ", ");
            } else{
                System.out.print(c[i]);
            }
            
        }
        System.out.println("]");

        int removeIndex = 5;
         int[] reducedArray = new int[c.length-1];
         for (int i = 0; i < removeIndex; i++) {
            reducedArray[i] =c[i];
         }

         for (int i = removeIndex; i < reducedArray.length; i++) {
            reducedArray[i] =c[i+1];
            
         }

         for (int i = 0; i < reducedArray.length; i++) {
            System.out.println(reducedArray[i]);
         }

    }

   
    
}
