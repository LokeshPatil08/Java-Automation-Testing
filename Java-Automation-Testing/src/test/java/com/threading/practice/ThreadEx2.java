package com.threading.practice;
class Threadprogram2 implements Runnable{
	public void run() {
		System.out.println("run method starts");
		for(int i=1; i<11; i++) {
			System.out.println("i="+i);
		}
		System.out.println("run method end");
	}
	
}

public class ThreadEx2 {
	public static void main(String[] args) {
		Threadprogram2 obj = new Threadprogram2();
		Thread t = new Thread(obj);
		t.start();
		for(int j=1; j<100; j++) {
			System.out.println("j="+j);
		}
	}

}
