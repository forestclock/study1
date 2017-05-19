package com.test;

public class Spike {
	
	 public static void main(String[] args)
	    {
	        Counter a = new Counter();
	        System.out.println(a.increment());
	        System.out.println(a.anotherIncrement());
	        Counter b = new Counter();
	        System.out.println(b.increment());
	        
	        String s = "hello";
	        String t = "hello";
	        char c[] = {'h', 'e', 'l', 'l', 'o'};
	        System.out.println(s==t);
	        System.out.println(s.equals(t));
	        System.out.println(t.equals(c));
	        System.out.println(t.equals(new String("hello")));
	    }
}

class Counter
{
    private static int count = 0;
    public int increment()
    {
        return count++;
    }
    public int anotherIncrement()
    {
        return ++count;
    }
}
