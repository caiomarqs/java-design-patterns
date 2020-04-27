
public class RespostaException extends Exception {

	private static final long serialVersionUID = 6801927602589598667L;

	public RespostaException(String errorMenssage, Throwable error) {
		super(errorMenssage, error);
	}
}
