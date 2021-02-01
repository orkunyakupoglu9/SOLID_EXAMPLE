package InterfaceSegregation;

/* Clicklistener örnek androidde bi uzun týklama bi normal týklama var ikisini farklý interface olarak implement et ortak interface'in
 *  farklý nethodlarý olarak deðil*/



public interface Communication {
	
	byte[] recieve();
	
	void send(byte[] data);
	

}
