package com.cognixia.jump.fullstack.advanced.multithread;

public class Coordinater {

	public static void main(String[] args) throws InterruptedException {
		// Multi-Threading FILO demonstration
		System.out.println("[Coordinater]: *The coordinator has arrived and is ready to begin...*");
		System.out.println("[Coordinater]: *Envites everyone to join*");

		// Creating threads
		Trainer trainer = new Trainer();
		Participant participant = new Participant();

		// Start running the threads
		trainer.start();
		participant.start();

		// Waiting for the participant to finish
		participant.join();
		System.out.println("[Participant]: *The participant has left the chat.*");

		// Waiting for the trainer to finish
		trainer.join();
		System.out.println("[Trainer]: *The trainer has left the chat.*");

		System.out.println("[Coordinater]: *The coordinator has left the chat.*");
	}

}
