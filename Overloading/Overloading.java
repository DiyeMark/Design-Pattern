package Overloading;

public class Overloading {

    public void display(String name)
    {
        System.out.println(name);
    }
    public void display(String name, int age)
    {
        System.out.println(name + " "+age);
    }
}
class OverloadingTest
{
    public static void main(String args[])
    {
        Overloading obj = new Overloading();
        obj.display("Abel");
        obj.display("Abel",18);
    }
}
