package garbagecollectiondemo;

import java.util.ArrayList;

import threadingdemo.Utils;

public class GarbageCollectionDemo {
	
	public static void main(String[] args) {
//		ArrayList<House> houses = new ArrayList<>();
		for(int i=1; i<=100000; i++) {
			new House(i);
		}
//		for(int i=1; i<=100000; i++) {
//			
//		}
	}

}


class House{
	int id;
	House(int id){
		this.id=id; 
		Utils.printmessage("House Created "+id);
	}
	
	@Override
	protected void finalize() throws Throwable{
		Utils.printmessage("House Destroyed "+id);
	}
}