class Chaining{

    Chaining()
    
    {
        
        System.out.println("This Is default Cunstructer");
    }
    Chaining(String s)
    {
         this();
        System.out.println("This Is Second Cunstructer With String"+s);
    }
    Chaining(int a, String s)
    {
       this("Hello");
       
        System.out.println("This Is Third With Number and String");
    }
         
    public static void main(String ar[])
    {
        Chaining c=new Chaining(10,"Hello");
    }
}