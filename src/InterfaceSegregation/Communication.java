package InterfaceSegregation;

/* Clicklistener �rnek androidde bi uzun t�klama bi normal t�klama var ikisini farkl� interface olarak implement et ortak interface'in
 *  farkl� nethodlar� olarak de�il*/



public interface Communication {
	
	byte[] recieve();
	
	void send(byte[] data);
	

}
