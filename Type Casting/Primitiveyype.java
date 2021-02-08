class Primitiveyype{
public static void main(String arg[]){
       //byte>>short>>int>>float>>long>>double
       //char>>byte>>short>>int>>long>>float>>double
       bytetype();
       shorttype();
       inttype();
       longtype();
       floattype();
       doubletype();
}
static void bytetype()
      {
       //Byte To another
       byte b=1;
       short c=b; //byte To short
       int a=b;
       float d=b;
       long l=b;
       double e=b;
       System.out.println("Into byte Type "+c+" "+a+" "+d+" "+l+" "+e);
       // Short To Another
      }
     static void shorttype()
      {
       //short To another
       short b=1;

       byte c= (byte)b; //Short To byte

       int a=b;
       float d=b;
       long l=b;
       double e=b;
       System.out.println("in to short "+c+" "+a+" "+d+" "+l+" "+e);
       // Short To Another
      }

      static void inttype()
      {
       //int  To another
       int b=1;

       byte c= (byte)b; //int To byte
      
        short a=(byte)b; //Int to Short
       float d=b;
       long l=b;
       double e=b;
       System.out.println("in to int "+c+" "+a+" "+d+" "+l+" "+e);
       // Short To Another
      }
       static void longtype()
      {
       //long  To another
       long b=11;

       byte c= (byte)b; //long To byte
      
        short a=(byte)b; //long to Short
       int d=(int)b;
       float l=b;
       double e=b;
       System.out.println("in to long "+c+" "+a+" "+d+" "+l+" "+e);
       // Short To Another
      }

       static void floattype()
      {
       //float  To another
       float b= 1.1f;

       byte c= (byte)b; //float To byte
      
        short a=(byte)b; //float to Short
       int d=(int)b;
       long l=(long)b;
       double e=b;
       System.out.println("in to float byte"+c+" sho "+a+" int "+d+" Lo "+l+" Do "+e);
       // Short To Another
      }

      static void doubletype()
      {
       //float  To another
       double b= 1.1d;
       
       byte c= (byte)b; //float To byte
      
        short a=(byte)b; //float to Short
       int d=(int)b;
       long l=(long)b;
       float e=(float)b;
       System.out.println("in to float float"+b+"byte-"+c+" sho "+a+" int "+d+" Lo "+l+" float- "+e);
       // Short To Another
      }
      
}