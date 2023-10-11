import java.util.Scanner;
public class Menu {
	
	Scanner scanner = new Scanner(System.in);
	Malha malha = new Malha();
	Sorteio sorteio = new Sorteio();
	
	public Menu() {
	}
	
	public void escolhas_1(){
		int instantes;
		int num_devs;
		int num_bugs;
		
		System.out.println("Digite a quantidade de instantes: ");
		instantes = scanner.nextInt();
		Rodadas.setInstantes(instantes);
		
		System.out.println("Digite o numero de desenvolvedores: ");
		num_devs = scanner.nextInt();
		Rodadas.setNumeroDeDevs(num_devs);
		
		System.out.println("Digite o numero de bugs: ");
		num_bugs = scanner.nextInt();
		Rodadas.setNumeroDeBugs(num_bugs);
		scanner.nextLine();
		}
	
	public void mostrar_velocidades() {
		System.out.println("\n\n");
		System.out.println("||======================================||\n"
				         + "||VELOCIDADE DE TRANSLAÇÃO DOS PLANETAS:||\n"
				         + "||======================================||\n");
		for(int i=1;i<Malha.planetas.size();i++) {
			
			System.out.println("O planeta " + Malha.planetas.get(i).getNome() + " orbita com velocidade de: " + Malha.planetas.get(i).getVelocidadeTranslacao()+" unidades/instante");
	}
}
	
	public int escolhas_2() {
		String escolha;
		System.out.println("Deseja continuar simulando?: (S/N)");
		escolha = scanner.next();
		
		if(escolha.equalsIgnoreCase("s")) {
			Rodadas.setNumeroDeRodadas(Rodadas.getNumeroDeRodadas()+1);
			return -1;
		}
		else {
			mostrar_relatório();
			return 0;
		}
	}
	
	public void letreiro() {
	System.out.println("\n \n                       SEJA BEM-VINDO AO SISTEMA:                     ");	
	System.out.println("//============================================================\\");	
	System.out.println("|| ######   #####   ####  ####   #####   ####    #####  ####   ||");
	System.out.println("||   ##     ## ##    ###  ###    ## ##    ##     ## ##  ## ##  ||");
	System.out.println("||   ##     #####     ##  ##     #####    ##     #####  ####   ||");
	System.out.println("|| # ##     ## ##      ####      ## ##    ## #   ## ##  ## ##  ||");
	System.out.println("|| ###      ## ##       ##       ## ##    ####   ## ##  ##  ## ||");
	System.out.println("\\============================================================//");
	System.out.println("                    APERTE ENTER PARA COMEÇAR:                      ");
	scanner.nextLine();
	}
	
	public void mostrar_biografia() {
		
		for(int i = 0;i < Malha.planetas.size();i++) {
			System.out.printf("\n");
			System.out.println(Malha.planetas.get(i).getNome()+" e sua história: \n\n");
			System.out.println( Malha.planetas.get(i).getBiografia());
			System.out.println("\n");
		}
	}
	
	public void fichar_planetas() {
		System.out.println("||===============================================||\n"
		                 + "|| NOME, VELOCIDADE MÉDIA E DE TRANSLAÇÃO FINAL: ||\n"
		                 + "||===============================================||\n");
		System.out.println("\n");
		for(int i = 0;i < Malha.planetas.size();i++) {
			System.out.println("Nome: " + Malha.planetas.get(i).getNome());
			System.out.println("Velocidade Média: " + Calculadora.calcular_vel_media(i) + " unidades/instante.");
			System.out.println("Velocidade de Translação Final: " + Malha.planetas.get(i).getVelocidadeTranslacao()+ " unidades/instante");
			System.out.println("\n");
		}
	}
	
	public void mostrar_tempo_final() {
		System.out.println("\n\n");
		System.out.println("||==============================||\n"
                         + "|| TEMPO FINAL DE CADA PLANETA: ||\n"            
                         + "||==============================||\n");
		System.out.println("\n");
		for(int i = 1;i < Malha.planetas.size();i++) {
			
			System.out.println("Horas: " + Calculadora.calcular_horas_totais(i));
			System.out.println("Dias: " + Calculadora.calcular_dias_totais(i) + " dias");
			System.out.printf("Anos: %.2f",Calculadora.calcular_anos_totais(i));
			System.out.println("\n");
			}
		}
	
	public String verificar_planeta(int index) {
    	String[] nomes_mortos = new String[Calculadora.calcular_num_planetas_mortos()];
    	int temp = 0;
    	if(Calculadora.calcular_num_planetas_mortos()>0) {
    		for(int i = 0; i< Malha.planetas.size();i++) {
    			if(Malha.planetas.get(i).isVivoMorto()==false) {
    				nomes_mortos[temp] = Malha.planetas.get(i).getNome();    			
    				temp++;
    			}
    		}
    	}
    	return nomes_mortos[index];
    }
	
	public void mortos() {
		System.out.println("\n\n");
		System.out.println("||================================||\n"
                         + "|| NUMERO DE PLANETAS EXPLODIDOS: ||\n"
                         + "||================================||\n");
		if(Calculadora.calcular_num_planetas_mortos() > 0) {
		for(int i = 0; i < Calculadora.calcular_num_planetas_mortos();i++) {
			System.out.println(verificar_planeta(i));
		   }
		}
		else {
			System.out.println("Nenhum planeta explodiu durante a simulção");
		}
	}
	
	public void mostrar_relatório() {
		System.out.println("\n\n");
		System.out.println("||===========================||\n"
		                 + "|| RELATÓRIO DE INFORMAÇÕES: ||\n"
		                 + "||===========================||\n");
		System.out.println("Foram solicitados: " + Rodadas.getInstantesTotais() + " instantes.\n");
			
		mostrar_biografia();
		
		//Numero de bugs e devs que cada planeta colidiu ao longo das rodadas.
		
        fichar_planetas();	
        
		mortos();
		
		mostrar_tempo_final();
		
	}
	

	public void mostrar_posicao() {
		System.out.println("\n\n"); 
		System.out.println("||========================||\n"
				         + "|| POSIÇÕES DOS PLANETAS: ||\n"
				         + "||========================||\n");
		for(int i = 0; i < Malha.planetas.size();i++) {
			 int nova_x = Malha.planetas.get(i).getX();
			 int nova_y = Malha.planetas.get(i).getY();
			 
			 System.out.println(Malha.planetas.get(i).getNome()+" se encontra em : (" + nova_x +","+nova_y+")");
		 }
	   System.out.println("\n\n");
	}
	
	 public void mostrar_rotacao() {
		 System.out.println("\n\n"); 
		 System.out.println("||================================||\n"
					      + "|| TEMPO PASSADO EM CADA PLANETA: ||\n"
					      + "||================================||\n");
		 for(int i=1;i<Malha.planetas.size();i++ ) {
				Malha.planetas.get(i).rotacionar(i);
				}
	    }
	 
	 public void mostrar_entidades() {
		 int bugs[] = sorteio.getCelulaSorteadaBugs();
	    	int devs[] = sorteio.getCelulaSorteadaDevs();
	    	for (int i = 0; i <bugs.length; i++) {
	    	    System.out.println("Células Bugs: " + bugs[i]);
	    	}

	    	for (int i = 0; i < devs.length; i++) {
	    	    System.out.println("Células Devs: " + devs[i]);
	    	}

	 }
	 
	public void menu_final() {
		//inserir planetas na rotação
		malha.adicionar_planetas();
		
		//Parte visual
		letreiro();
		
		//iteração enquanto o usuário estiver marcando que sim
		for(int i=0;i<1;i++) {
		escolhas_1();
		
		sorteio.sortear_bugs(Rodadas.getNumeroDeBugs());
		sorteio.sortear_devs(Rodadas.getNumeroDeDevs());
		
		Rodadas.iterador_de_instantes(Rodadas.getInstantes());
	    
		malha.iterar_planetas();
		Rodadas.iterador_de_rodadas();
	    mostrar_posicao();
		mostrar_velocidades();
		Malha.norte_sul();
		mostrar_rotacao();
		i = escolhas_2();
		}
		
		//Ao fechar o sistema.
		mostrar_relatório();
	}
}
