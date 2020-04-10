import java.lang.Math;

public class PopularAspectRatios {
	
	public static void main(String[] args) {
		double[] size1 = new double[] {1080, 1920, 19.59};
		double[] size2 = new double[] {750, 1334, 15.67};
		double[] size3 = new double[] {720, 1280, 14.39};
		double[] size4 = new double[] {1440, 2960, 8.85};
		double[] size5 = new double[] {1440, 2560, 5.89};
		double[] size6 = new double[] {1125, 2436, 4.6};
		double[] size7 = new double[] {640, 1136, 3.84};
		double[] size8 = new double[] {1080, 2160, 3.51};
		double[] size9 = new double[] {540, 960, 2.74};
		double[] size10 = new double[] {720, 1440, 2.25};
		
		double[][] sizes = new double[][] {size1, size2, size3, size4, 
			size5, size6, size7, size8, size9, size10};
		
		for(double[] size: sizes) {
			printScreenInfo(size);
		}
	}
	public static void printScreenInfo(double[] size) {
		double width = size[0];
		double height = size[1];
		System.out.println("Screen size: " + (int)width + "x" + (int)height 
			+ "; Aspect ratio: " + Math.round(height/width*100)/100.0
			+ "; Popularity: " + size[2] + "%");
	}
	
}