package anagrafica;

public class Automobile {
	
	private String targa;
	private String modello;
	private Persona proprietario;
	private int livellocarburante;
	private final int capacitamassima;
	private int numeroPasseggeri;
	private int capacitaPassegeri;
	
	public Automobile(String m, int maxCarburante, int maxPasseggeri) {
		this.modello = m;
		this.capacitamassima = maxCarburante;
		this.capacitaPassegeri = maxPasseggeri;
	}
	
	public String getTarga() {
		return this.targa;
	}
	
	public void setTarga(String t) {
		this.targa = t;
	}
	
	public Persona getProprietario() {
		return this.proprietario;
	}
	
	public void setProprietario(Persona p) {
		this.proprietario = p;
	}
	
	public String getModello() {
		return modello;
	}
	
	public int doRiforminento(int litri) {
	
		if(this.livellocarburante + litri >= this.capacitamassima) {
			//System.out.println("Capacità massima");
			this.livellocarburante= this.capacitamassima;
		}
		else{
			this.livellocarburante += litri;
		}
		return this.livellocarburante;
	
	}
	
	public int SaliPasseggeri() {
		if(this.numeroPasseggeri >= this.capacitaPassegeri){
			System.out.println("Mi dispiace ma non c'è più posto");
		}
		else {
			this.numeroPasseggeri++;
			System.out.println("Benvenuto a bordo");
		}
		return this.numeroPasseggeri;
	}
	
	public int ScendiPasseggeri() {
		if(this.numeroPasseggeri == 0){
			System.out.println("La macchina è vuota");
			}
		else {
			this.numeroPasseggeri--;
			System.out.println("Grazie per essere salito a bordo");
		}
		
		return this.numeroPasseggeri;
		
	}}
