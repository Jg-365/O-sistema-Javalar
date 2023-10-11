
public class Rodadas {
	private static int instantes;
	private static int numero_de_devs;
	private static int numero_de_bugs;
	private static int numero_de_rodadas;
	private static int rodadas_totais;	
	private static int instantes_totais;
	
	public Rodadas() {
	}
	
	public static void setInstantes(int valor) {
		instantes = valor;
	}
	
	public static int getInstantes() {
		return instantes;
	}
	
	public static void setNumeroDeDevs(int valor) {
		numero_de_devs = valor;
	}
	
	public static int getNumeroDeDevs() {
		return numero_de_devs;
	}
	
	public static void setNumeroDeBugs(int valor) {
		numero_de_bugs = valor;
	}
	
	public static int getNumeroDeBugs() {
		return numero_de_bugs;
	}
	
	public static void setNumeroDeRodadas(int valor) {
		numero_de_rodadas = valor;
	}
	
	public static int getNumeroDeRodadas() {
		return numero_de_rodadas;
	}
	
	public static void setInstantesTotais(int valor) {
		instantes_totais = valor;
	}
	
	public static int getInstantesTotais() {
		return instantes_totais;
	}
	

	public static void setRodadasTotais(int valor) {
	    rodadas_totais = valor;
	}
	
	public static int getRodadasTotais() {
		return rodadas_totais;
	}

	public static void iterador_de_instantes(int instantes_adc){
		setInstantesTotais(getInstantesTotais()+instantes_adc);
		System.out.println("\n\n");
		System.out.println("--> Instante de Numero: " + getInstantesTotais()+"\n");
	}
	
	public static void iterador_de_rodadas() {
		setRodadasTotais(getNumeroDeRodadas()+1);
        System.out.println("\n\n");
		System.out.println("--> Rodada de Numero: " + getRodadasTotais()+"\n");
	}
}
