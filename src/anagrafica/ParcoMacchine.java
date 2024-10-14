package anagrafica;

public class ParcoMacchine {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Automobile jeep = new Automobile("Jeep Renegade", 100, 4);
		Automobile panda = new Automobile("Fiat Panda", 45, 4);
		
		Persona Francesco = new Persona("Francesco" , "Tedesco");
		
		jeep.setTarga("GTH35JK");
		jeep.setProprietario(Francesco);
		
		System.out.println(jeep.getTarga());
		System.out.println(jeep.getProprietario().getCognome() + " " + jeep.getProprietario().getNome());
		
		System.out.println(jeep.doRiforminento(20));
		System.out.println(jeep.doRiforminento(90));
	
		System.out.println(panda.SaliPasseggeri());
		System.out.println(panda.SaliPasseggeri());
		System.out.println(panda.SaliPasseggeri());
		System.out.println(panda.SaliPasseggeri());
		
		System.out.println(panda.ScendiPasseggeri());
		System.out.println(panda.SaliPasseggeri());
		System.out.println(panda.SaliPasseggeri());
	}

}
