package departamentosEmpleados;

public class Empleado {

	private String codigo = "";
	private String dni = "";
	private String nss = "";
	private int telefono;
	private String nombre = "";
	private String direccion="";
	
	public Empleado(String codigo,String dni, String nss,int telefono, String nombre, String direccion) {
		this.telefono = telefono;
		this.nombre = nombre;
		this.direccion = direccion;
		this.codigo=codigo;
		this.dni=dni;
		this.nss=nss;
	}
	
	
}
