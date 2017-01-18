package test;

public class ReportCard {
	private int total, average, score, count ; 
	private String grade, name ; 
	 
	public void setTotal(int total){
		this.total = total ;
	}
	public int getTotal(){
		return total;
	}
	
	public void setAverage(int average){
		this.average = average ;
	}
	public int getAverage(){
		return average;
	}
	
	public void setScore(int score){
		this.score = score ;
	}
	public int getScore(){
		return score;
	}
	
	public void setCount(int count){
		this.count = count ;
	}
	public int getCount(){
		return count;
	}
	
	public void setName(String name){
		this.name = name ;
	}
	public String getName(){
		return name;
	}
	
	public void calcGrade() {
		
		if (average >= 90) {
			grade = "A";
		} else if (average >= 80) {
			grade = "B";
		} else if (average >= 70) {
			grade = "C";
		} else {
			grade = "D";
		}
	}
	
/*	public void calcGrade(int average) {
		
		if (average >= 90) {
			grade = "A";
		} else if (average >= 80) {
			grade = "B";
		} else if (average >= 70) {
			grade = "C";
		} else {
			grade = "D";
		}
		setGrade(grade);
	}*/
	
	public String getGrade(){
		return grade ;
	}
}