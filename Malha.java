import java.util.ArrayList;
public class Malha {
	Python python = new Python();
	Javascript javascript = new Javascript();
	Ruby_on_Rails ruby = new Ruby_on_Rails();
	Php php = new Php();
	C_sharp c_sharp = new C_sharp();
	Cplusplus cplusplus = new Cplusplus();
	C c = new C();
	Java java = new Java();
	Bugs bugs = new Bugs();
	Devs devs = new Devs();
	
	public static ArrayList<Astros> planetas = new ArrayList<>();
	
	public Malha() {
	}
	
	public void adicionar_planetas() {
		planetas.add(java);
	    planetas.add(python);
		planetas.add(javascript);
		planetas.add(ruby);
		planetas.add(php);
		planetas.add(c_sharp);
		planetas.add(cplusplus);
		planetas.add(c);
	}
	
	
	public void iterar_planetas() {
		for (int i = 0; i < planetas.size(); i++) {
	    	int nova_x = planetas.get(i).getX();
	    	int nova_y = planetas.get(i).getY(); 
	    	int deslocamento = planetas.get(i).mover(planetas.get(i).getVelocidadeTranslacao()); 
	        for (int j = 1; j <= deslocamento; j++) {
	        	if (planetas.get(i).getX() == planetas.get(i).getMaxX() && planetas.get(i).getY() == planetas.get(i).getMaxY()) {
	                nova_x--;
	            } else if (planetas.get(i).getX() == planetas.get(i).getMaxX() && planetas.get(i).getY() == planetas.get(i).getMinY()) {
	                nova_y++;
	            } else if (planetas.get(i).getX() == planetas.get(i).getMinX() && planetas.get(i).getY() == planetas.get(i).getMaxY()) {
	                nova_y--;
	            } else if (planetas.get(i).getX() == planetas.get(i).getMinX() && planetas.get(i).getY() == planetas.get(i).getMinY()) {
	                nova_x++;
	            
	            } else {
	                if (planetas.get(i).getY() == planetas.get(i).getMaxY()) {
	                    nova_x--;
	                } else if (planetas.get(i).getY() == planetas.get(i).getMinY()) {
	                    nova_x++;
	                } else if (planetas.get(i).getX() == planetas.get(i).getMaxX()) {
	                    nova_y++;
	                } else {
	                    nova_y--;
	                }
	            }
	            planetas.get(i).setX(nova_x);
	            planetas.get(i).setY(nova_y);
	        }
	    }
	}    

	public static void norte_sul() {
		System.out.println("\n\n");
		for(int i = 1; i < 7;i++) {
		int y_atual = planetas.get(i).getY();
			if(y_atual>8) {
				System.out.println(planetas.get(i).getNome() + " está acima de Java");
			}
			else if(y_atual == 8) {
				System.out.println(planetas.get(i).getNome() + " está na linha de Java");
			}
			else {
				System.out.println(planetas.get(i).getNome() + " está abaixo de Java");
			}
	     }
      }
    }
