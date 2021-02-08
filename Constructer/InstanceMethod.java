class InstanceMethod{
    public static void main(String arg[])
{
             Dog d=new Dog();
             d.display(10,"gabbar"); //This Is Instance Method ecause Its Need A Reff To Execute
}
}

class Dog
{
    String name;
    int id;
  void  display(int id, String name)
    {
         name=name;
         id=id;
         System.out.println("this Is Show Of Dog Class");
    }
}