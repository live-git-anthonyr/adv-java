package com.cognixia.jump.fullstack.advanced.multithread;

public class Participant extends Thread {

	@Override
	public void run() {
		System.out.println("[Participant]: *The participant has arrived and is ready to learn.*");
		practice();
		System.out.println("[Participant]: Well that was exhausting...");
	}

	public void practice() {
		System.out.println("[Participant]: Ugh, this is gonna take a while....");
		System.out.println("[Participant]: Here I go!!");
		for (int i = 1; i <= 100; i++) {
			if (i == 50) {
				System.out.print("[Participant]: I can't keep this up any longer!! ");
				for (int j = 0; j < 1000; j++) {
					System.out.print("*cry* ");
				}
				System.out.println("[Participant]: " + i);
			} else {
				System.out.println("[Participant]: " + i);
			}
		}
		System.out.println("[Participant]: I'm done I'm done!!!");
	}

}
