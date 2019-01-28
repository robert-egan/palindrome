import java.util.Scanner;

public class Loop{
	int start;
	
	public void getStart() {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the starting step: ");
		start = scan.nextInt();
		
	}
	public void makePalindrome(){
		System.out.println("Step = " + start);
		long step = 1;
		for(int i=0; i < 8; i++) {
			//System.out.println(step);
			long num = step * step;
			if(i>=start-1) {
				for(int h=0;h < 8-i;h++) {
					System.out.print(" ");
				}
				System.out.println(num);
			}
			step *= 10;
			step ++;
		}
		
	}
	public void run() {
		do {
			getStart();
			makePalindrome();
		}while(start >0 && start <9);
	}
	
	public static void main (String[] args) {	
		Loop myLoop = new Loop();
		myLoop.run();

	}
}
	