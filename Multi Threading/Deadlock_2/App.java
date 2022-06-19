package Deadlock_2;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class App {
	public static void main(String[] args) {

		Lock lock1 = new ReentrantLock();
		Lock lock2 = new ReentrantLock();

		Thread thread1 = new Thread(new Runnable() {

			@Override
			public void run() {
				boolean flaglock1 = false;
				boolean flaglock2 = false;
				boolean doneflag1 = false;
				boolean doneflag2 = false;

				while (true) {
					try {
						flaglock1 = lock1.tryLock();
						flaglock2 = lock2.tryLock();

					} finally {
						if (flaglock1 && !doneflag1) {
							System.out.println("Inside Thread 1 on lock 1");
							lock1.unlock();
							doneflag1 = true;
						}
						if (flaglock2 && !doneflag2) {
							System.out.println("Inside Thread 1 on lock 2");
							lock2.unlock();
							doneflag2 = true;
						}
						if (flaglock1 && flaglock2) {
							break;
						}
					}
				}
			}
		});

		Thread thread2 = new Thread(new Runnable() {

			@Override
			public void run() {
				boolean flaglock1 = false;
				boolean flaglock2 = false;
				boolean doneflag1 = false;
				boolean doneflag2 = false;

				while (true) {
					try {
						flaglock1 = lock1.tryLock();
						flaglock2 = lock2.tryLock();

					} finally {
						if (flaglock1 && !doneflag1) {
							System.out.println("Inside Thread 2 on lock 1");
							lock1.unlock();
							doneflag1 = true;
						}
						if (flaglock2 && !doneflag2) {
							System.out.println("Inside Thread 2 on lock 2");
							lock2.unlock();
							doneflag2 = true;
						}
						if (flaglock1 && flaglock2) {
							break;
						}
					}
				}
			}
		});

		thread1.start();
		thread2.start();

		try {
			thread1.join();
			thread2.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		System.out.println("INSIDE MAIN METHOD");

	}

}
