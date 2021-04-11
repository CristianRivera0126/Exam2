package Exercise3;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Target {
	private String NumT;

	public Target(String numT) {
		super();
		this.setNumT(numT);
	}

	public String getNumT() {
		return NumT;
	}

	public void setNumT(String numT) {
		Pattern pat=Pattern.compile("\\d+(\\*)*([\\*(0-9)]{13,16})$");
		Matcher mat=pat.matcher(numT);
		if(mat.matches()) {
			System.out.println("La tarjeta "+numT+" Esta enmascarada");
		}else {
			numT=null;
			System.out.println("Numero de tarjeta no enmascarado, introduzcalo de nuevo");
		}
		NumT = numT;
	}
	
	

}
