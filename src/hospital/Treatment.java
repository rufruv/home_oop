package hospital;

public class Treatment extends Bmi{

	@Override
	public String calcBmi(double weight, double height) {
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
	@Override
	public String toString() {
		return String.format("BMI: %s", calcBmi(weight, height));
	}
}