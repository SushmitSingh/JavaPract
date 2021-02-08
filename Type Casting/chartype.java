class chartype{
public static void main(String args[])
{
 chartype();
    
} 
static void chartype()
      {
       //float  To another
       char b= 'M';
       
       byte c= (byte)b; //float To byte
      
        short a=(byte)b; //float to Short
       int d=(int)b;
       long l=(long)b;
       float e=(float)b;
       System.out.println("in to float float"+b+"byte-"+c+" sho "+a+" int "+d+" Lo "+l+" float- "+e);
       // Short To Another

       //byte to char
       byte x=55;
       char y = (char)x;
       System.out.println(y);
       //short to char
         short p=7777;
         char q=(char)p;
         System.out.println(q);
       //Char TO String
         char m='A';
         System.out.println(l);

      }
}