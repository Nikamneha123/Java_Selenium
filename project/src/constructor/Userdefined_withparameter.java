package constructor;

public class Userdefined_withparameter {
	//variable dec
	String Name;
	int Class;
	char Grade;
	float Percentage;
	//var dec for add
	int N1;
	int N2;
	int N3;
	String Name1;
	Userdefined_withparameter(int N1,int b){
		this.N1=N1;
		N2=b;
	}
	Userdefined_withparameter(int a,int b,int c){
		N1=a;
		N2=b;
		N3=c;
	}
	Userdefined_withparameter(String Name1){
		this.Name1=Name1;
		
	}
	public void Mult() {
		int multiplication=N1*N2*N3;
		System.out.println("multication="+multiplication);
	}
	Userdefined_withparameter(String Name,int Class,char Grade,float percentage){
		this.Name=Name;
		this.Class=Class;
		this.Grade=Grade;
		this.Percentage=percentage;
		
		
	}
	public static void main(String[] args) {
		//Userdefined_withparameter S1=new Userdefined_withparameter("Neha",8,"A",98.6);
		Userdefined_withparameter S2=new Userdefined_withparameter(10,10,10);
		S2.Mult();
		//System.out.println("Student details="+S1.Name+""+S1.Class+""+S1.Grade+""+S1.Percentage);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
