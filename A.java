//method overloading
class A
{
    public void add(int a,int b)
    {
        System.out.println(a+b);
    }
    public void add(float a,float b)
    {
        System.out.println(a+b);
    }
    public void add(int a)
    {
        System.out.println(a+a);
    }
}
public class B
{
    public static void main(String [] args)
    {
        A obj=new A();
        A.add(10,15);
        A.add(9.0f,1.0f);
        A.add(10);
    }
}