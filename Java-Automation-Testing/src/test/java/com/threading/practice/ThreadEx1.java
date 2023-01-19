package com.threading.practice;
class ThreadProgram1 extends Thread {
	public void run(){
		try {
			Thread.sleep(10);
		}catch(InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("run method starts");
		for(int i=1; i<11; i++) {
			System.out.println("i="+i);
		}
		System.out.println("run method end");
	}
}

public class ThreadEx1{
	public static void main(String[] args) throws InterruptedException {
		ThreadProgram1 obj = new ThreadProgram1();
		obj.start();
		for(int j=1; j<11000; j++) {
			System.out.println("j="+j);
		}
		
	}

}
//inbuild thread 
//run() & start()