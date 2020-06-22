package com.cognixia.jump.fullstack.advanced.multithread;

public class Trainer extends Thread {

	@Override
	public void run() {
		System.out.println("[Trainer]: *The trainer has arrived and is ready to teach*");
		lecture();
		System.out.println("[Trainer]: *Perfect! Let's review this again tomorrow d(^-^o)*");
	}

	public void lecture() {
		System.out.println("[Trainer]: Let's practice counting to 100!");
		System.out.println("[Trainer]: Everyone together now!!");
		for (int i = 1; i <= 100; i++) {
			System.out.println("[Trainer]: " + i);
		}
		System.out.println("[Trainer]: Done!!!");
	}

}
