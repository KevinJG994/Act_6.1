package figuras;

/*
* Clase Circunferencia
*/
public class Circunferencia {
    //En esta variable almacenamos el radio de la circunferencia
    private double radio;

    // En esta variable guardamos el color de la circunferencia
    private String color;

    // Metodo constructor de la clase Circunferencia
    public Circunferencia(double radio) {
        this.radio = radio;
    }
    /**
     * @return Método void que muestra los detalles de la Circunferencia
     */
    public void imprimir() {
        color = "rojo";
        System.out.println("Di�metro: " + 2 * radio);
        System.out.println("Color: " + color);
        double area = 2 * 3.1416 * radio * radio;
        System.out.println(area);
    }

    /**
     * @return Metodo que devuelve el valor de la variable radio
     * */
    public double getRadio() {
        return radio;
    }

    /**
     *
     * @param radio
     * @return Metodo que actualiza la variable radio
     * */
    public void setRadio(double radio) {
        this.radio = radio;
    }


    /**
     *
     * @param considerarDecimales
     * @param otro
     * @return Metodo que retorna si ambos radios son iguales o no
     * */
    public boolean esIgual(boolean considerarDecimales, Circunferencia otro) {
        double radio1 = this.radio;
        double radio2 = otro.getRadio();
        if (considerarDecimales) {
            if (radio1 == radio2)
            	return true;
            else
                return false;
        } else {
            if (Math.abs(radio1 - radio2) < 1)
                return true;
            else
                return false;
        }
    }
}

