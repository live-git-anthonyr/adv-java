package com.cognixia.jump.fullstack.advanced.streams;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class DataStreamLab {
	// Reading and Writing to files using java.io
	public static void main(String[] args) throws IOException, ClassNotFoundException {
		File dataFile = new File("persondata.dat");
		File arrayFile = new File("peopledata.dat");
		Person person = new Person(12332, 23, 1400);
		Person[] people = { new Person(0, 19, 15), new Person(1, 21, 17), new Person(2, 47, 26), new Person(3, 24, 26),
				new Person(4, 21, 26) };

		dataOutputStream(person, dataFile);
		dataInputStream(dataFile);

		arrayOutput(people, arrayFile);
		arrayInput(arrayFile);

	}

	// Writes an array of person objects to a file
	public static void arrayOutput(Person[] people, File arrayFile) throws IOException {
		FileOutputStream outputStream = new FileOutputStream(arrayFile);
		ObjectOutputStream oos = new ObjectOutputStream(outputStream);
		oos.writeObject(people);

		oos.close();
		outputStream.close();
		System.out.println("Done!");
	}

	// Reads a file and creates person objects
	public static void arrayInput(File arrayFile) throws IOException, ClassNotFoundException {
		FileInputStream inputStream = new FileInputStream(arrayFile);
		ObjectInputStream ois = new ObjectInputStream(inputStream);
		Person[] thePople = (Person[]) ois.readObject();

		ois.close();
		inputStream.close();

		for (Person person : thePople) {
			System.out.print(person.toString() + " ");
		}
	}

	// Writes a single person object to a file
	public static void dataOutputStream(Person person, File dataFile) throws IOException {
		FileOutputStream outputStream = new FileOutputStream(dataFile);
		DataOutputStream dos = new DataOutputStream(outputStream);
		dos.writeInt(person.getId());
		dos.writeInt(person.getAge());
		dos.writeFloat(person.getSalary());

		dos.close();
		outputStream.close();

		System.out.println("Done.");
	}

	// Reads a single person object to a file
	public static void dataInputStream(File dataFile) throws IOException {
		FileInputStream inputStream = new FileInputStream(dataFile);
		DataInputStream dis = new DataInputStream(inputStream);
		int person2Id = dis.readInt();
		int age = dis.readInt();
		float salary = dis.readFloat();

		dis.close();
		inputStream.close();

		Person person2 = new Person(person2Id, age, salary);
		System.out.println(person2);
	}

}
