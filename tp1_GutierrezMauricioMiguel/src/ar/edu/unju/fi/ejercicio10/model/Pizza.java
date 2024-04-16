package ar.edu.unju.fi.ejercicio10.model;


public class Pizza {
    private static final float ESPECIALES20 = 500;
    private static final float ESPECIALES30 = 750;
    private static final float ESPECIALES40 = 1000;

    private int diametro;
    private float precio;
    private float area;
    private boolean ingredientesEspeciales;

    public Pizza() {

    }

    public int getDiametro() {
        return diametro;
    }

    public void setDiametro(int diametro) {
        this.diametro = diametro;
    }

    public float getPrecio() {
        return precio;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }

    public float getArea() {
        return area;
    }

    public void setArea(float area) {
        this.area = area;
    }

    public boolean isIngredientesEspeciales() {
        return ingredientesEspeciales;
    }

    public void setIngredientesEspeciales(boolean ingredientesEspeciales) {
        this.ingredientesEspeciales = ingredientesEspeciales;
    }

    public float calcularPrecio() {
        if (diametro == 20) {
            if(ingredientesEspeciales == true) this.precio = 4500 + ESPECIALES20;
            else this.precio = 4500;
        }
        if (diametro == 30) {
            if (ingredientesEspeciales == true) this.precio = 4800 + ESPECIALES30;
            else this.precio = 4800;
        } 
        if (diametro == 40) {
            if (ingredientesEspeciales == true) this.precio = 5500 + ESPECIALES40;
            else this.precio = 5500;
        }  
        return this.precio; 
    }

    public float calcularArea() {
        area = diametro / 2;
        this.area = (3.1416f) * (area * area);
        return this.area;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("\nDiametro: ").append(getDiametro());
        sb.append("\nIngredientes Especiales: ").append(isIngredientesEspeciales());
        sb.append("\nPrecio Pizza: ").append(getPrecio());
        sb.append("\nArea de la pizza: ").append(getArea());
        return sb.toString();
    }

    
}