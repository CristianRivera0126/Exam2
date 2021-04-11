package Exercise2;

import java.util.ArrayList;
import java.util.List;

public class StringManagement {
	private String nameT;
	private String id;
	private int PosicionI;
	private int PosicionF;
	private int size;
	private String descrip;
	
	List<Rule> rules;
	
	public StringManagement(String nameT,String id,int size,int PosicionI,int PosicionF, String descrip) {
		super();
		this.setNameT(nameT);
		this.setId(id);
		this.setSize(size);
		this.PosicionI=PosicionI;
		this.PosicionF=PosicionF;
		this.descrip = descrip;
		this.rules=new ArrayList<Rule>();
	}

	public int getSize() {
		size=25;
		return size;
	}

	public void setSize(int size) {
		if(size<=25) {
			System.out.println("Tamaño permitido de 0-25 valores; el valor de esta trama es de: "+size+" valores");
		}else {
			System.out.println("Tamaño no permitido; el tamaño debe ser menor o igual a 25");
		    System.exit(0); 
		}
		this.size = size;
	}

	public String getNameT() {
		return nameT;
	}

	public void setNameT(String nameT) {
		this.nameT = nameT;
	}
	
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public void AsignarRule(Rule nueva_rule) {
		this.rules.add(nueva_rule);
	}
	
	public void Obtener_Valor_Trama(String nombre) {
		System.out.println("Nombre de la trama: "+this.nameT+"\n");
		System.out.println("Posicion de inicio: "+this.PosicionI+"\n");
		System.out.println("Posicion Final: "+this.PosicionF+"\n");
		System.out.println("Descricion: "+this.descrip+"\n");
	}
	
	public void ImprimirRules() {
		for(Rule r : this.rules) {
		System.out.println("Rule\t\t\t\tValor");
		System.out.println(r.nombre+"\t\t\t"+this.nameT);
		System.out.println("Posicion Inicio"+"\t\t\t"+this.PosicionI);
		System.out.println("Posicion Final"+"\t\t\t"+this.PosicionF);
		System.out.println(r.Descrip+"\t\t\t"+this.descrip+"\n");
		}
	}
}
