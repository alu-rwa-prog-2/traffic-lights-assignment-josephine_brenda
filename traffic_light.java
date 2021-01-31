/**
 * 
/**
 * @author Brenda & Josephine
 *
 */
import java.util.*;
public class traffic_light {

	public static void main(String[] args) {
		Random car_value = new Random();
		
		ArrayList<Integer> cars_rd = new ArrayList<Integer>();
		
		while (cars_rd.size() < 100) {
			
			Integer cr = car_value.nextInt(100);
			if (cars_rd.contains(cr)) {
				;
			}
			else {
				cars_rd.add(cr);
			}
		}
		
		
		while (true) {
			// red
			// 0 cars - 20 secs
			System.out.println("STOP: Red Light Flickering now.");
			try {
				Thread.sleep(20000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			
			// yellow
			System.out.println("\nCAUTION : Move slow. Yellow light flickering.");
			// move 1 car every 2 secs - 10 secs
			Timer y_timer = new Timer();
			int startC = 0;
			int everyC = 2000;
			y_timer.schedule(new TimerTask() {
			  int move = 0;  
			   @Override
			   public void run() {
			       //call the method
				   // move car
				   //
				   if (cars_rd.size() != 0) {
					   System.out.println("Car: " + cars_rd.get(0) + ", crossing");
					   cars_rd.remove(0); // removes cars out of the initial collection
				       move ++;
				       if (move >= 5){
				         y_timer.cancel();
				       }
				   }
				   else {
					   y_timer.cancel();
				   }
			   }
			}, startC, everyC);
			try {
				Thread.sleep(10000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println("\nRemaining cars: " + cars_rd.size());
			
			
			// green
			System.out.println("\nSAFE: Green Light. Move");
			Timer g_timer = new Timer();
			int startG = 0;
			int everyG = 1000;
			g_timer.schedule(new TimerTask() {
			  int move = 0;
			   @Override
			   public void run() {
			       //call the method
				   // move car
				   if (cars_rd.size() != 0) {
					   System.out.println("Car: " + cars_rd.get(0) + ", crossing");
					   cars_rd.remove(0);
				       move ++;
				       if (move == 30){
				         g_timer.cancel();
				       }
				   }
				   else {
					   g_timer.cancel();
				   }
			   }
			}, startG, everyG);
			try {
				Thread.sleep(30000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println("\nCars remaining: " + cars_rd.size());
			
			if (cars_rd.size() < 30) {
				final Integer sizeM = cars_rd.size();
				System.out.println("SAFE");
				Timer g2_timer = new Timer();
				int startG2 = 0;
				int everyG2 = 1000;
				g2_timer.schedule(new TimerTask() {
				  int move = 0;
				   @Override
				   public void run() {
				       //call the method
					   // move car
					   if (cars_rd.size() != 0) {
						   System.out.println("Car: " + cars_rd.get(0) + ", crossing");
						   cars_rd.remove(0);
					       move ++;
					       if (move == sizeM){
					         g2_timer.cancel();
					       }
					   }
					   else {
						   g2_timer.cancel();
					   }
				   }
				}, startG2, everyG2);
				try {
					Thread.sleep(30000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				System.out.println("\nRemaining cars: " + cars_rd.size());
				
				
				}
			if (cars_rd.size() == 0) {
				break;
			}
			
			
		}
		
			
			
		
				
			

	}

}

