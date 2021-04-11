package Utils;

public class Producto extends Cliente {
    private String FechaCrea;
    private String FechaVence;
    
	public Producto(String id, String name, String dir, String fechaNac, String userBD, String passwordBD,
			String nameBD, String urlBD,String FechaVence) {
		super(id, name, dir, fechaNac, userBD, passwordBD, nameBD, urlBD);
		this.FechaVence=FechaVence;
	} 
	
	public void crear() {
		System.out.println("Estoy crando un nuevo producto");
	}
	
	public void obtener() {
		System.out.println("Aqui estoy obteniendo los detalles de mi producto");
	}
	
	public void actualizar() {
		System.out.println("De esta manera Actuaizo mi Base de Datos por cada ingreso de un nuevo producto");
	}
	
	public void eliminar() {
		System.out.println("Aqui podemos eliminar un producto");
		
	}
	
}
