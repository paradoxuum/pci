package agregacao;

import java.util.ArrayList;

public class Time {

	private String nomeAtleta;
	private ArrayList<Atleta> Atleta;
	
	public Time() {
		Atleta = new ArrayList<Atleta>();
	}
	
	public void add(Atleta umAtleta) {
		Atleta.add(umAtleta);
	}
}
