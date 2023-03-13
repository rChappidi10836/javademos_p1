package com.lockedMe;

import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class Origin {

	public static void main(String[] args) {

		System.out.println("			 LockedME			 ");
		System.out.println("\t\t\t\t-- By C.Raja EMPID: 10836"); 	 	 
		Set<String> Files = new TreeSet<String>();

		Files.add("Details.pdf");
		Files.add("Bio.xlsx");
		Files.add("Photo.jpeg");
		Files.add("Metadata.docx");

		menuDis(Files);

	}

	private static void menuDis(Set<String> Files) {
		int choice=3;
		try (Scanner read = new Scanner(System.in)) {
			while (true) {
				System.out.println("\n\tMAIN MENU\n\t1. Print Files\n\t2. Handle Files\n\t3. Exit");
				System.out.println("\nEnter the choice : ");
				 try {
					choice = read.nextInt();
				} catch (Exception e) {
					e.getMessage();
				}
				switch (choice) {
				case 1:
					System.out.println();
					for (String i : Files)
						System.out.println(i);
					break;
				case 2:
					manu(Files);
					break;
				case 3:
					System.exit(0);
				default:
					System.out.println("Enter valid Input");
				}
			}
		}
	}

	protected static void manu(Set<String> Files) {
		String s ="";
		int ch =4;
		try (Scanner reader = new Scanner(System.in)) {
			while (true) {
				System.out.println("\n\t1. ADD File\n\t2. DELETE File\n\t3. SEARCH File\n\t4. Exit to main");
				System.out.println("\nEnter the choice : ");
				try {
					ch = reader.nextInt();
				} catch (Exception e2) {
					e2.getMessage();
				}
				switch (ch) {
				case 1:							//add file
					System.out.print("Enter File with extention to add : ");
					try {
						s = reader.next();
					} catch (Exception e1) {
						e1.getMessage();
					}
					if(Files.add(s))
					System.out.println(s + " file is added");
					else
					System.out.println(s + " is already present in directory");
					break;
				case 2:							//delete file
					System.out.print("Enter File with extention to delete : ");
					try {
						s = reader.next();
					} catch (Exception e) {
						e.getMessage();
					}
					boolean status = Files.remove(s);
					if(status){ System.out.println(s + " file is deleted");}
					else{System.out.println(s + " File not found");}
					break;
				case 3:							//search file
					System.out.print("Enter file to search :");
					try {
						s = reader.next();
					} catch (Exception e) {
						e.getMessage();
					}
					if(Files.contains(s)) {
						System.out.println("File is found and Accessed");
					}else {
						System.out.println("File no present");
					}
					break;
				case 4:
					menuDis(Files);
					break;
				default:
					System.out.println("Enter valid Input");
				}
			}
		}catch(Exception e) {
			e.getMessage();
		}

	}

}
