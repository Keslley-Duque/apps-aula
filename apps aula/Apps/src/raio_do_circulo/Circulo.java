package raio_do_circulo;

public class Circulo {
    private float raio;

    public float getRaio() {
        return raio;
    }

    public void setRaio(float raio) {
        this.raio = raio;
    }

    public float areaDoCirculo() {
        float areaDoCirculo = (float) ((raio * raio) * 3.14);
        return areaDoCirculo;
    }

    public float diametroDoCirculo() {
        float diametroDoCirculo = (float) (2 * 3.14 * raio);
        return diametroDoCirculo;
    }

    public float perimetroDoCirculo() {
        float perimetroDoCirculo = (float) (2 * raio);
        return perimetroDoCirculo;
    }

}