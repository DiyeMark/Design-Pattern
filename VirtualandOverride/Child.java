package VirtualandOverride;

class Child extends Parent
{
    private void m1() { System.out.println("From child m1()");}

    @Override
    public void m2() { System.out.println("From child m2()");}

}