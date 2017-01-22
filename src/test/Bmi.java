package test;

public class Bmi {
	private String uid ;
	private double weight, height ;
	
	public void setUid(String uid){
		this.uid = uid ;
	}
	public String getUid(){
		return uid ;
	}
	public void setWeight(double weight){
		this.weight = weight;
	}
	public double getWeight(){
		return weight ;
	}
	
	public void setHeight(double height){
		this.height = height;
	}
	public double getHeight(){
		return height;
	}
	
	// setter를 생략하면, readOnly 파일( 수정할수 없고, 읽을수만 있는!!! )
	public String calcBmi(double weight, double height){
	    String bmiResult = "";
		double bmi = weight / (height * height) ;
		if (bmi > 30.0) {
			bmiResult = "고도비만";
		} else if (bmi > 25.0) {
			bmiResult = "비만";
		} else if (bmi > 23.0) {
			bmiResult = "과체중";
		} else if (bmi > 18.5) {
			bmiResult = "정상";
		} else {
			bmiResult = "저체중";
		}
		return bmiResult ;
	}
}