package Inheritance;

public class Type {
	public static void main(String[] args) {
		WhatsappV1 V1=new WhatsappV1();
		V1.Textmsg();
		System.out.println();
		
		WhatsappV2 V2=new WhatsappV2();
		V2.Textmsg();
		V2.Audiocalling();
		System.out.println();
		
		WhatsappV3 V3=new WhatsappV3();
		V3.Textmsg();
		V3.Audiocalling();
		V3.Videocalling();
		System.out.println();
		
		WhatsappV4 V4=new WhatsappV4();
		V4.Textmsg();
		V4.Audiocalling();
		V4.Videocalling();
		V4.Payment();
		
		
		
		
	}

}
