package Utils;

public class Cliente {
	private String id;
	private String name;
	private String Dir;
	private String FechaNac;
	private String UserBD;
	private String PasswordBD;
	private String nameBD;
	private String UrlBD;
	
	public Cliente(String id, String name, String dir, String fechaNac, String userBD, String passwordBD,
			String nameBD, String urlBD) {
		super();
		this.id = id;
		this.name = name;
		this.Dir = dir;
		this.FechaNac = fechaNac;
		this.UserBD = userBD;
		this.PasswordBD = passwordBD;
		this.nameBD = nameBD;
		this.UrlBD = urlBD;
	}
	
	public void crear() {
		System.out.println("Estoy crando un cliente");
	}
	
	public void obtener() {
		System.out.println("Aqui estoy obteniendo a mi cliente");
	}
	
	public void actualizar() {
		System.out.println("De esta manera Actuaizo mi Base de Datos por cada ingreso de un cliente");
	}
	
	public void eliminar() {
		System.out.println("Aqui podemos eliminar a un cliente ");
		
	}

}
