package org.opentutorials.javatutorials.exception;

class A{
	private int[] arr = new int[3];
	A() {
		arr[0] =0;
		arr[1] =10;
		arr[2] =20;
	}
	public void z(int first, int second) {
		try {
			System.out.println(arr[first] / arr[second]);
		}catch (Exception e) {
			e.printStackTrace();
		}
	}
}

public class ExceptionDemo1 {
	public static void main(String[] args) {
		A a = new A();
		a.z(10, 1);
	}
}
