package test;

public class Bmi {
	String name, result ; // instance variable 반드시 initialize하지 않는다
	int age ;
	double weight, height, bmi ;
	
	public String getResult(double weight, double height){
		bmi = weight / (height * height);
		if (bmi > 30.0) {
			result = "고도비만";
		} else if (bmi > 25.0) {
			result = "비만";
		} else if (bmi > 23.0) {
			result = "과체중";
		} else if (bmi > 18.5) {
			result = "정상";
		} else {
			result = "저체중";
		}
		return String.format("%s의 BMI 결과는 %s/n", name, result);
	}
/*	public static void main(String[] args) { // local variable 반드시 initialize
		Scanner scanner = new Scanner(System.in);
		Bmi[] patients = new Bmi[3]; 
					
		for(int i=0 ; i<patients.length ; i++){
		System.out.println("이름, 주민번호, 몸무게, 키?");
		patients[i] = new Bmi();
		patients[i].name = scanner.next();
		patients[i].age = scanner.nextInt();
		patients[i].weight = scanner.nextDouble();
		patients[i].height = scanner.nextDouble()/100;
		System.out.printf("%s의 BMI 결과는 %s\n", patients[i].name, (patients[i].getResult(patients[i].weight / (patients[i].height * patients[i].height))));
		}
		double bmi = kim.weight / (kim.height * kim.height) ;
		double bmi2 = Hong.weight / (Hong.height * Hong.height) ;
		double bmi3 = Song.weight / (Song.height * Song.height) ;
		System.out.println("BMI: " + bmi);
		
		String result = ;
		String result2 = Hong.getResult(bmi);
		String result3 = Song.getResult(bmi);
		
		kim.bmiResult = kim.getResult(bmi) ; 
		Hong.bmiResult = result2 ; 
		Song.bmiResult = result3 ;*/
	
}