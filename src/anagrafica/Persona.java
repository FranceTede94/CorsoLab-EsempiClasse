package anagrafica;

public class Persona {
	
	private String nome;
	private String cognome;
	private String codicefiscale;
	private boolean HasPatente;
	
	
	public Persona(String nom, String cogn) {
		
		this.nome = nom;
		this.cognome = cogn;
		
	}


	public String getCodicefiscale() {
		return codicefiscale;
	}


	public void setCodicefiscale(String codicefiscale) {
		this.codicefiscale = codicefiscale;
	}


	public boolean isHasPatente() {
		return HasPatente;
	}


	public void setHasPatente(boolean hasPatente) {
		HasPatente = hasPatente;
	}


	public String getNome() {
		return nome;
	}


	public String getCognome() {
		return cognome;
	}
	

}
