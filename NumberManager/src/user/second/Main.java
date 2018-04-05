package user.second;

import user.first.Numbers;

public class Main {

	public static void main(String[] args) {
		final Numbers num = new Numbers(Math.random());
		
		boolean watcher = true; 
		int counter = 1;
		while(watcher){
			double tempNum = Math.random();
			System.out.println("tempNum: " + tempNum);
			if(num.isInTreshold(tempNum)){
				watcher = false;
			}
			counter++;
		}

		System.out.println("counter: " + counter);
		
	}

}
