public abstract class  Astros{
	
    //atributos:
	private String nome;
	private int velocidade_translacao;
    private float hrs_por_instante;
    private String biografia;
    private boolean vivo_morto;
    private int x;
    private int y;
    private int max_x;
    private int min_x;
    private int max_y;
    private int min_y;
    private int deslocamento;
    private int deslocamento_total;
    private float anos_javaLar;
    private float dias_totais;
    private float anos_totais;
    
    //construtores/get-set:
    public Astros() {
    }
 
    public String getNome() {
    	return nome;
    }
    public void setNome(String nome) {
    	this.nome = nome;
    }
    public int getVelocidadeTranslacao() {
        return velocidade_translacao;
    }

    public void setVelocidadeTranslacao(int velocidade_translacao) {
        this.velocidade_translacao = velocidade_translacao;
    }

    public float getHorasPorInstante() {
        return hrs_por_instante;
    }

    public void setHrsPorInstante(float tempo_de_rotacao) {
        this.hrs_por_instante = tempo_de_rotacao;
    }

    public String getBiografia() {
        return biografia;
    }

    public void setBiografia(String biografia) {
        this.biografia = biografia;
    }

    public boolean isVivoMorto() {
        return vivo_morto;
    }

    public void setVivoMorto(boolean vivo_morto) {
        this.vivo_morto = vivo_morto;
    }
    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getMaxX() {
        return max_x;
    }

    public void setMaxX(int max_x) {
        this.max_x = max_x;
    }

    public int getMinX() {
        return min_x;
    }

    public void setMinX(int min_x) {
        this.min_x = min_x;
    }

    public int getMaxY() {
        return max_y;
    }

    public void setMaxY(int max_y) {
        this.max_y = max_y;
    }

    public int getMinY() {
        return min_y;
    }

    public void setMinY(int min_y) {
        this.min_y = min_y;
    }
    
    public int getDeslocamento() {
    	return deslocamento;
    }
    
    public void setDeslocamento(int deslocamento) {
    	this.deslocamento = deslocamento;
    }
    
    
    public int getDeslocamentoTotal() {
    	return deslocamento_total;
    }
    
    public void setDeslocamentoTotal(int deslocamento_total) {
    	this.deslocamento_total = deslocamento_total;
    }
    public float getAnosJavaLar() {
    	return anos_javaLar;
    }
    
    public void setAnosJavaLar(float anos_javaLar) {
    	this.anos_javaLar = anos_javaLar;
    }
    public float getDiasTotais() {
    	return dias_totais;
    }
    
    public void setDiasTotais(float dias_totais) {
    	this.dias_totais = dias_totais;
    }
    public float getAnosTotais() {
        return anos_totais;
    }

    public void setAnosTotais(float anos_totais) {
        this.anos_totais = anos_totais;
    }
  
    //metodos de funcionalidade
    
    public float rotacionar(int index) {
        float tempo_total = Malha.planetas.get(index).getHorasPorInstante()* Rodadas.getInstantes();
        System.out.println("Passaram-se "+tempo_total+" horas em " + getNome());
        System.out.printf("%.2f dias.\n",Calculadora.calcular_dias(index,tempo_total));
        System.out.printf("%.2f anos.\n\n",Calculadora.calcular_anos(index));
        
    	return tempo_total;
    }
    
    public boolean verify_explodir() {
    if(nome!="Java") {
    	if (velocidade_translacao == 0) { 
    		System.out.println("O planeta explodiu!");
    		return false;
    	}
    	else {
    		return true;
    	}
    }
    else {
    	return true;
    }
    }
    
    public int mover(int velocidade_translacao) {
    	int deslocamento = velocidade_translacao * Rodadas.getInstantes();
    	return deslocamento;
    }
    
}
