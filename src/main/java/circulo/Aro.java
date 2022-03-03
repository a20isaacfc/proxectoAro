package circulo;

/**
 * Probas de refactorización en NetBeans coa clase Aro
 * @author Isaac Fontal
 */
public class Aro {

    /**
     * Valor mínimo do radio
     */
    public static final double MINIMO = 0.0;

    /**
     * Valor límite do radio
     */
    public static final double LIMITERADIO = 0.0;

    private int coordenadaX;
    private int coordenadaY;
    private double radio;

    /**
     * Constructor da clase.
     */
    public Aro() {
    }

    /**
     * Constructor da clase.
     * 
     * @param valorX o valor da coordenada x
     * @param valorY o valor da coordenada y
     * @param valorRadio o valor do radio
     */
    public Aro(int valorX, int valorY, double valorRadio) {
        coordenadaX = valorX;
        coordenadaY = valorY;
        setRadio(valorRadio);
    }

    /**
     * Obtén o diámetro do circulo.
     * @return o valor do diámetro
     */
    public double obterDiametro() {
        return radio * 2;
    }

    /**
     * Obtén o valor da circunferencia.
     * @return o valor da circunferencia
     */
    public double obterCircunferencia() {
        return Math.PI * obterDiametro();
    }

    /**
     * Obtén a superficie do círculo.
     * @return o valor da superficie
     */
    public double obterSuperficie() {
        return Math.PI * radio * radio;
    }

    @Override
    public String toString() {
        return "Centro = [" + coordenadaX + "," + coordenadaY + "]; Radio = " + radio;
    }

    /**
     * Traslada o centro do círculo a outras coordenadas.
     * @param trasladarX o valor a incrementar a coordenada x
     * @param trasladarY o valor a incrementar a coordenada y
     */
    public void trasladarCentro(int trasladarX, int trasladarY){
        coordenadaX=coordenadaX + trasladarX;
        coordenadaY=coordenadaY + trasladarY;
    }

    /**
     * Obtén a coordenada x.
     * @return a coordenada x
     */
    public int getCoordenadaX() {
        return coordenadaX;
    }

    /**
     * Establece o valor da coordenada x.
     * @param coordenadaX o valor da coordenada x
     */
    public void setCoordenadaX(int coordenadaX) {
        this.coordenadaX = coordenadaX;
    }

    /**
     * Obtén a coordenada y
     * @return a coordenada y
     */
    public int getCoordenadaY() {
        return coordenadaY;
    }

    /**
     * Establece o valor da coordenada y.
     * @param coordenadaY o valor da coordenada y
     */
    public void setCoordenadaY(int coordenadaY) {
        this.coordenadaY = coordenadaY;
    }

    /**
     * Obtén o radio do círculo.
     * @return o valor do radio
     */
    public double getRadio() {
        return radio;
    }

    /**
     * Establece o radio do círculo.
     * @param radio o novo valor do radio
     */
    public void setRadio(double radio) {
        this.radio=(radio < MINIMO ? MINIMO : radio);
    }
}