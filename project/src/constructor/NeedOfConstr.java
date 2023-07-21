package constructor;

public class NeedOfConstr{
	public NeedOfConstr(){
System.out.println("Default Constr");
}

String Name;
int RollNo;
public static void main(String[] args) {
	NeedOfConstr S1=new NeedOfConstr();
	NeedOfConstr S2=new NeedOfConstr();
	NeedOfConstr S100=new NeedOfConstr();
	
}
public void M1() {
	System.out.println(Name+" "+RollNo);
}
public void M2() {
	System.out.println(Name+" "+RollNo);
}
}
