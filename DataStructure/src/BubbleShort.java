public class BubbleShort {
    public static void main(String[] arg ){

        int[] array = {10,20,30,-10,-11,30};
          for(int endpoint= array.length-1; endpoint>0; endpoint--)
          {
              for(int i=0; i<endpoint;i++)
              {
                  if(array[i]>array[i+1])
                  {
                      bubbleShort(array,i,i+1);
                  }
              }
              for(int i=0; i< array.length;i++)
              {
                  System.out.print(array[i]);
              }
              System.out.println(" ");
          }

    }
  static   void bubbleShort(int[] array, int i, int j)
    {
           if(i==j){
               return;
           }
           int temp    = array[i];
            array[i] = array[j];
            array[j] = temp;
    }

}
