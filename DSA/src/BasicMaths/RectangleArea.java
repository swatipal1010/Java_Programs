package BasicMaths;
import java.util.Scanner;

public class RectangleArea {
	
	    public static int computeArea(int ax1, int ay1, int ax2, int ay2, int bx1, int by1, int bx2, int by2) {
	        int areaA = Math.abs(ax1 - ax2) * Math.abs(ay1 - ay2);
	        int areaB = Math.abs(bx1 - bx2) * Math.abs(by1 - by2);
	        
	        int intersectionWidth = Math.max(0, Math.min(ax2, bx2) - Math.max(ax1, bx1));
	        int intersectionHeight = Math.max(0, Math.min(ay2, by2) - Math.max(ay1, by1));
	        int intersectionArea = intersectionWidth * intersectionHeight;
	        
	        return areaA + areaB - intersectionArea;
	    }
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the x-coordinate of the left-bottom corner of 1st rectangle: ");
		int ax1 = sc.nextInt();
		
		System.out.println("Enter the y-coordinate of the left-bottom corner of 1st rectangle: ");
		int ay1 = sc.nextInt();
		
		System.out.println("Enter the x-coordinate of the right-top corner of 1st rectangle: ");
		int ax2 = sc.nextInt();
		
		System.out.println("Enter the y-coordinate of the right-top corner of 1st rectangle: ");
		int ay2 = sc.nextInt();
		
		System.out.println("Enter the x-coordinate of the left-bottom corner of 2nd rectangle: ");
		int bx1 = sc.nextInt();
		
		System.out.println("Enter the y-coordinate of the left-bottom corner of 2nd rectangle: ");
		int by1 = sc.nextInt();
		
		System.out.println("Enter the x-coordinate of the right-top corner of 2nd rectangle: ");
		int bx2 = sc.nextInt();
		
		System.out.println("Enter the y-coordinate of the right-top corner of 2nd rectangle: ");
		int by2 = sc.nextInt();
		
		System.out.println("Area covered by the 2 rectangles is: "+computeArea(ax1,ay1,ax2,ay2,bx1,by1,bx2,by2));
		
		

	}

}
