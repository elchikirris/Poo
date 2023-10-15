package _p107_Forma;

public class Triangulo extends Forma {
    private double Base;
    private double Alrura;
    public Triangulo(String color) {
        super(color);
    }
    public Triangulo(String color, double base, double alrura) {
        super(color);
        Base = base;
        Alrura = alrura;
    }
    public double getBase() {
        return Base;
    }
    public void setBase(double base) {
        Base = base;
    }
    public double getAlrura() {
        return Alrura;
    }
    public void setAlrura(double alrura) {
        Alrura = alrura;
    }
    @Override
    public double getArea() {
        // TODO Auto-generated method stub
        return (Base * Alrura)/ 2;
        
    }
    @Override
    public String toString() {
        return "Triangulo ["+ super.toString()+ "Base=" + Base + ", Alrura=" + Alrura + "]";
    }
    
}
