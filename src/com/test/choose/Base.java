package com.test.choose;

public class Base
{
    private String baseName = "base";
    static final int i =1;
    final float j = 3.14f;
    public Base()
    {
        callName();
    }
 
    public void callName()
    {
        System.out.println(baseName);
    }
 
    static class Sub extends Base
    {
        private String baseName = "sub";
        public void callName()
        {
            System.out.println (baseName) ;
        }
    }
    public static void main(String[] args)
    {
        Base b = new Sub();
    }
}
