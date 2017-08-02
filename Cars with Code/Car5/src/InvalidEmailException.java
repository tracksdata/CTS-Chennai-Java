
public class InvalidEmailException extends Exception {
	private static final long serialVersionUID = 1L;
	String msg;
    public InvalidEmailException(String msg){
    	this.msg=msg;
    }
    public String getMessage(){
    	return msg;
    }
}
