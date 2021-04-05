package terreno;

public class Terreno {

    private float altura, base;

    public float getAltura() {
        return altura;
    }

    public float getBase() {
        return base;
    }

    public void setBase(float base) {
        this.base = base;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }

    public float areaDoTerreno() {
        float area = base * altura;
        return area;
    }
}