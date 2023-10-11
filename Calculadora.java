  public class Calculadora {
    public Calculadora() {
    }
    
    public static float calcular_dias(int index, float tempo_total) {  
    	float dias_adc = tempo_total/24;
    	float dias_totais = Malha.planetas.get(index).getDiasTotais()+dias_adc;
    	Malha.planetas.get(index).setDiasTotais(dias_totais);
    	return dias_adc;
    }
    
    public static float verifica_orbita(int index) {
    	int delta_x = Malha.planetas.get(index).getMaxX()- Malha.planetas.get(index).getMinX();
    	int delta_y = Malha.planetas.get(index).getMaxY()- Malha.planetas.get(index).getMinY();
    	
    	int orbita = 2*(delta_x+delta_y);
    	return orbita;
    }
    
   public static float calcular_anos(int index) {
	   float anos = (Malha.planetas.get(index).mover(Malha.planetas.get(index).getVelocidadeTranslacao()))/(verifica_orbita(index));
	   Malha.planetas.get(index).setAnosJavaLar(anos);
	   anos = Malha.planetas.get(index).getAnosJavaLar();
	   return anos;
   }
   
    public static int calcular_deslocamento_total(int index) {
       Malha.planetas.get(index).setDeslocamentoTotal(Malha.planetas.get(index).getDeslocamentoTotal()+1);
       return Malha.planetas.get(index).getDeslocamentoTotal();
    }
    
    public static float calcular_horas_totais(int index) {
    	float hr_p_inst = Malha.planetas.get(index).getHorasPorInstante();
    	float hrs_totais = hr_p_inst * Rodadas.getInstantesTotais();
    	return hrs_totais;
    }
    
    public static float calcular_dias_totais(int index) {
    	float dias_totais = calcular_horas_totais(index)/24;
    	return dias_totais;
    }
    
    public static float calcular_anos_totais(int index) {
 	   Malha.planetas.get(index).setAnosTotais(Malha.planetas.get(index).getAnosTotais()+calcular_anos(index));
 	   float anos_totais = Malha.planetas.get(index).getAnosTotais();
 	   return anos_totais;
    }
    
    public static float calcular_vel_media(int index) {
    	int vel_transl = Malha.planetas.get(index).getVelocidadeTranslacao();
    	int deslocamento_total = Malha.planetas.get(index).mover(vel_transl);
    	int instantes_totais = Rodadas.getInstantesTotais();
    	float v_med = deslocamento_total/instantes_totais;
    	return v_med;
    }
    
    public static int calcular_num_planetas_mortos() {
    	int planetas_explodidos = 0;
    	for(int i = 0; i < Malha.planetas.size();i++) {
    		if(Malha.planetas.get(i).isVivoMorto()==false) {
    			planetas_explodidos++;
    		}
    	}
    	return planetas_explodidos;
    }
    
}
