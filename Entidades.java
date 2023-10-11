
public abstract class Entidades {
	private int pos_x;
	private int pos_y;
	private boolean colision;
	private int qtd_p_inst;
	private int qtd_total;
	
	public Entidades() {
		
	}
	
	    public int getPos_x() {
	        return pos_x;
	    }

	    public void setPos_x(int pos_x) {
	        this.pos_x = pos_x;
	    }

	    public int getPos_y() {
	        return pos_y;
	    }

	    public void setPos_y(int pos_y) {
	        this.pos_y = pos_y;
	    }

	    public boolean isColision() {
	        return colision;
	    }

	    public void setColision(boolean colision) {
	        this.colision = colision;
	    }

	    public int getQtd_p_inst() {
	        return qtd_p_inst;
	    }

	    public void setQtd_p_inst(int qtd_p_inst) {
	        this.qtd_p_inst = qtd_p_inst;
	    }

	    public int getQtd_total() {
	        return qtd_total;
	    }

	    public void setQtd_total(int qtd_total) {
	        this.qtd_total = qtd_total;
	    }
	    void colidir() {
	    }
	}
