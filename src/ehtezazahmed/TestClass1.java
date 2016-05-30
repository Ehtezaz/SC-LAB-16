package ehtezazahmed;

public class TestClass1 {

	private double englishMarks; 
	private double urduMarks;
	private double mathMarks;
	private double totalMarks;
	private double percentage;
	
	public TestClass1() {
		// TODO Auto-generated constructor stub
		englishMarks = 0.0;
		urduMarks = 0.0;
		mathMarks = 0.0;
		percentage = 0.0;
	}
	
	public void getMarks(double eng,double urdu,double math){
		englishMarks = eng;
		urduMarks = urdu;
		mathMarks = math;
	}
	
	public void calculatePercentage(){
		int total = 300;
		percentage = (totalMarks/total)*100;
		System.out.println("Hellow World..\n Percentage : " + percentage);
	}
	
	public void calculateMarks(){
		totalMarks = englishMarks + urduMarks + mathMarks;
		System.out.println("Total Marks.. "+ totalMarks);		
	}
	
	
}
