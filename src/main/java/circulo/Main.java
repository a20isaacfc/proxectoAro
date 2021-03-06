package circulo;

import java.util.logging.Logger;
import java.text.DecimalFormat;
import java.util.logging.Level;

/**
 * Pruebas de refactorización en NetBeans con la clase Aro
 * @author Isaac Fontal
 */
public class Main {

    private static final Logger LOG = Logger.getLogger(Main.class.getName());
    
    /**
     * Programa que xenera un círculo e amosa todas as suas propiedades.
     * @param args parámetros da línea de comandos
     */
    public static void main(String[] args) {
        Aro aro = new Aro(37,43,2.5);
        String saida =
                "A coordenada X é "+aro.getCoordenadaX()+
                "\nA coordenada Y é "+aro.getCoordenadaY()+
                "\nO radio é "+aro.getRadio();
        aro.setCoordenadaX(35);
        aro.setCoordenadaX(20);
        aro.setRadio(4.2);
        DecimalFormat dousDixitos = new DecimalFormat("0.00");
        saida+="\nO diámetro é "+dousDixitos.format(aro.obterDiametro());
        saida+="\nA circunferencia é "+dousDixitos.format(aro.obterCircunferencia());
        saida+="\nA área é "+dousDixitos.format(aro.obterSuperficie());
        LOG.log(Level.SEVERE, saida);
        
        LOG.log(Level.SEVERE, saida);
        System.exit(0);
    }

}