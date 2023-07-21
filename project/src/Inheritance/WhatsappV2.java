package Inheritance;

public class WhatsappV2 extends WhatsappV1  {

	public void Audiocalling() {
		System.out.println("audiocalling");
	}
	public static void main(String[] args) {
		//WhatsappV1 V1=new WhatsappV1();
		WhatsappV2 V2=new WhatsappV2();
		V2.Textmsg();
		V2.Audiocalling();
		
		
		
	}
}
