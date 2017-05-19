package com.test.choose;

public class Test0516 {

	public static Test0516 t1 = new Test0516();
	static{
		System.out.println("blockA");
	}
	static{
		System.out.println("blockB");
	}
	public static void main(String[] args) {
		Test0516 t2 = new Test0516();
		System.out.println("-----" + getValue());
	}
	
	public static int getValue() {
        try {
            return 0;
        } finally {
            return 1;
        }
    }
}
