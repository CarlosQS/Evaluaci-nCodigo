
/**
 * @author Carlos Quiles Serrano
 * @version 1.0.0
 */

public class EntradaBlogCQS {
		
	public static char separador=':';
	private int id;
	private String texto;
	private String autor;
	
	/**
	 * Entrada del blog
	 * @param id ID
	 * @param autor Autor
	 * @param texto Texto
	 * @throws IllegalArgumentException El ID no puede ser negativo o = 0
	 */
	
	public EntradaBlogCQS(int id,String autor,String texto)throws IllegalArgumentException{
		if(id<=0) throw new IllegalArgumentException("El id no puede ser negativo");
		this.id=id;
		this.autor=autor;
		this.texto=texto;
	}
	
	/**
	 * Método toString()
	 */
	
	@Override
	public String toString(){
		String cad="";
		cad+="\nENTRADA DE"+separador+autor;
		cad+="\n "+texto;
		return cad;
	}
	
	/**
	 * Devuelve la ID
	 * @return Devuelve la id
	 */
	
	public int getId(){
		return this.id;
	}

	
	/**
	 * Devuelve el texto
	 * @return Devuelve el texto
	 */
	public String getTexto(){
		return this.texto;
	}
	
	/**
	 * Devuelve el Autor en mayusculas
	 * @return Devuelve el autor e mayusculas
	 */
	
	public String getAutor(){
		return this.autor.toUpperCase();
	}
	
	/**
	 * Devuelve el Autor
	 * @return Devuelve el autor
	 */
	
	public String devuelveAutor(){
		return this.autor;
	}
	
	/**
	 * Main
	 * @param args ARGS del compilador
	 */
	
	public static void main(String[] args) {
		EntradaBlogCQS e1=new EntradaBlogCQS (3,"ana","Últimas noticias, está disponible BixBy 2.0");
		System.out.println(e1);
	}
	
}
