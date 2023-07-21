package constructor;

public class Userdfine2 {
	String Name;
	String Model;
	int prize;
	String Engine;


public Userdfine2 (String Name1,String Model1,int prize1,String Engine1) {
	Name=Name1;
		Model=Model1;
		prize=prize1;
		Engine=Engine1;
		
}
public static void main(String[] args) {
	Userdfine2 UD1=new Userdfine2("city","honda",1200000,"manual");
	System.out.println(UD1.Name+"  "+UD1.Model+" "+UD1.prize+" "+UD1.Engine);
}
	
}