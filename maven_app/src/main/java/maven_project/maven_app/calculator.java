package maven_project.maven_app;

public class calculator {
	

		int num1;
		int num2;
			
		public calculator (int num1,int num2) {
		
			this.num1 = num1;
			this.num2 = num2;
		}
	public int add(){
		int result = num1 + num2;
		return result;
	}
		public int substraction() {
			int result = num1-num2;
			return result;
			}
		public double divide() {
			double result = (double)num1/num2;
			return result;
			}
		public int multiplication() {
			int result = num1*num2;
			return result;
			}
		
		
		
	

}
