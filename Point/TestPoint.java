package Point;
import java.util.Scanner;

public class TestPoint {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter How many Points you :");
		int n;
		n = sc.nextInt();
		for(int i =0;i<n;i++){
		System.out.println("Enter The First Co-ordinate : ");
		
		Point2D p1 = new Point2D(sc.nextInt(),sc.nextInt());
		Point2D [] p = new Point2D;
		System.out.println("Enter The Second Co-ordinate : ");
		
		Point2D p2 = new Point2D(sc.nextInt(),sc.nextInt());
		System.out.println("The Co0ordinates of First points Are : "+p1.show());
		System.out.println("The Co0ordinates of Second points Are : "+p2.show());
		System.out.println(p1.isEqual(p2) ? "Same" : "Differnet");
		System.out.println("Enter points which you want to calculate Distance : ");
		Point2D p3 = new Point2D(sc.nextInt(),sc.nextInt());
		System.out.println("The Distance Between two Points Are : "+p1.calcDistance(p2));
		
		for(Point2D p : )
		
		//Sye
	}

}
