package App;

import Exercise2.Rule;
import Exercise2.StringManagement;
import Exercise3.Target;
import Utils.Cliente;
import Utils.Producto;

public class Principal {
	public static void main(String[] args) {
		//Ejercicio1
		System.out.println("Ejercicio1");
		System.out.println("\t\t\tMostramos los metodos del cliente\n");
		Cliente c1=new Cliente("20191004778", "Cristian", "Col. Cerro Grande", "26 de enero 2001", "RiveraCristian659", "CrisRiver0126", "INFORMIXSERVER", "WWW.InformixServer.com");
		c1.crear();
		c1.obtener();
		c1.actualizar();
		c1.eliminar();
		System.out.println("\n\t\t\tMostramos los metodos del producto\n");
		Producto p1=new Producto("0001", "Pinesol", "4500", "25 de febrero de 2021", "RiveraCristian659","CrisRiver0126" ,"INFORMIXSERVER", "WWW.InformixServer.com", "30 de abril de 2021");
		p1.crear();
		p1.obtener();
		p1.actualizar();
		p1.eliminar();
		
		//Ejercicio2
		System.out.println("\nEjercicio2\n");
		//Trama 1
		StringManagement T1=new StringManagement("Cristian Rivera","0801200103042",20,0,20,"Ingeniero Industrial");
		Rule R1=new Rule("Numeros Enteros",21,35,"Solo se pueden ingresar numero enteros");
		T1.AsignarRule(R1);
		T1.ImprimirRules();
		//Obteniendo valores de la trama ingresando el nombre de la rule
		System.out.println("\t\t\tObteniendo valores de la trama con nombre de la rule");
		T1.Obtener_Valor_Trama("Numeros Enteros");
		
		//Trama2
		StringManagement T2=new StringManagement("Kimberly Raudales","0901200065789",10,21,31,"Piloto Aviador");
		Rule R2=new Rule("No Celulares a bordo",21,31,"No son permitidos celulares en el avion");
		T2.AsignarRule(R2);
		T2.ImprimirRules();
		//Obteniendo valores de la trama ingresando el nombre de la rule
		System.out.println("\t\t\tObteniendo valores de la trama con nombre de la rule");
		T2.Obtener_Valor_Trama("No celulares a bordo");
		
		//Trama3
		StringManagement T3=new StringManagement("Daniela Michelle","0801200774690",30,31,61,"Maestra");
		Rule R3=new Rule("No copiar en clase",31,61,"No es permitido copiar en clase");
		T3.AsignarRule(R3);
		T3.ImprimirRules();
		//Obteniendo valores de la trama ingresando el nombre de la rule
		System.out.println("\t\t\tObteniendo valores de la trama con nombre de la rule");
		T3.Obtener_Valor_Trama("No celulares a bordo");
	
		
		//Ejercicio 3
		System.out.println("\n\t\tEjercicio3");
		Target t1=new Target("53900*****873988");
		t1.getNumT();
	}

}
