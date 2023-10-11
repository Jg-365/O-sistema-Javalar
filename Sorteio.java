import java.util.Random;

public class Sorteio {
    private int[] celula_sorteada_bugs;
    private int[] celula_sorteada_devs;
    private int numero_sorteios_bugs;
    private int numero_sorteios_devs;
    private Random sorteio = new Random();
   
    public Sorteio() {	
    }
    
    public void sortear_bugs(int num_de_bugs) {
        int[] sort_bugs_pos = new int[num_de_bugs];
        int temp;
        int sorteioAnterior = -1;
        
        for(numero_sorteios_bugs = 0; numero_sorteios_bugs < num_de_bugs; numero_sorteios_bugs++) {
            temp = sorteio.nextInt(125) + 1;  
            
            while (temp == 58 || temp == sorteioAnterior || isBugRepeated(temp, sort_bugs_pos)) {
                temp = sorteio.nextInt(125) + 1;  
            }
            
            sort_bugs_pos[numero_sorteios_bugs] = temp;
            sorteioAnterior = temp;
        }
        
        setCelulaSorteadaBugs(sort_bugs_pos);
    }
    
    public void sortear_devs(int num_de_devs) {
        int[] sort_devs_pos = new int[num_de_devs];
        int temp;
        int sorteioAnterior = -1;
        
        for(numero_sorteios_devs = 0; numero_sorteios_devs < num_de_devs; numero_sorteios_devs++) {
            temp = sorteio.nextInt(125) + 1;  
            
            while (temp == 58 || temp == sorteioAnterior || isDevRepeated(temp, sort_devs_pos)) {
                temp = sorteio.nextInt(125) + 1;
            }
            
            sort_devs_pos[numero_sorteios_devs] = temp;
            sorteioAnterior = temp;
        }
        
        setCelulaSorteadaDevs(sort_devs_pos);
    }
    
    public boolean isBugRepeated(int temp, int[] sorteados) {
        for(int i = 0; i < numero_sorteios_bugs; i++) {
            if (temp == sorteados[i]) {
                return true;
            }
        }
        return false;
    }
    
    public boolean isDevRepeated(int temp, int[] sorteados) {
        for(int i = 0; i < numero_sorteios_devs; i++) {
            if (temp == sorteados[i]) {
                return true;
            }
        }
        return false;
    }
    
    public int[] getCelulaSorteadaBugs() {
        return celula_sorteada_bugs;
    }

    public void setCelulaSorteadaBugs(int[] celula_sorteada_bugs) {
        this.celula_sorteada_bugs = celula_sorteada_bugs;
    }

    public int[] getCelulaSorteadaDevs() {
        return celula_sorteada_devs;
    }

    public void setCelulaSorteadaDevs(int[] celula_sorteada_devs) {
        this.celula_sorteada_devs = celula_sorteada_devs;
    }
    
    public int getBugsSorteios() {
        return numero_sorteios_bugs;
    }
    
    public void setBugsSorteios(int valor) {
        this.numero_sorteios_bugs = valor;
    }
    
    public int getDevsSorteios() {
        return numero_sorteios_devs;
    }
    
    public void setDevsSorteios(int valor) {
        this.numero_sorteios_devs = valor;
    }
}
