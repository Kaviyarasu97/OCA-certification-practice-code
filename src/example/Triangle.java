package example;

//public class Triangle {
	public class Triangle{
	    public int base;
	     int height;
	    public double area;
	    
	    public Triangle(int base, int height){
	        this.base = base; this.height = height;
	        updateArea();
	    }
	    void updateArea(){
	        area = base*height/2;
	    }
	    void setBase(int b){ base  = b; updateArea(); }
	     void setHeight(int h){ height  = h; updateArea(); }
	}


