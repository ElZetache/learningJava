package teoria;
//! Esta es la definicion de un objeto con sus metodos:

public class Circumferencia {
    protected static final double MAX_CIRC = 360.00;
    protected double grad_circ;

    // ! Constructor:
    public Circumferencia(double grados) {
        // si introducen un valor negativo le damos la vuelta
        if (grados < 0) {
            while (grados < 0) {
                grados += 360;
            }
        }
        // ahora miramos si los grados no pasan del maximo de 360
        // en caso de que sobrepase calculamos el sobrante
        if (grados <= MAX_CIRC) {
            this.grad_circ = grados;
        } else {
            while (grados > MAX_CIRC) {
                grados = grados - MAX_CIRC;
            }
            this.grad_circ = grados;
        }
    }

    public Circumferencia() {
        // si se referencia el objeto sin pasarle un valor le pasamos por defecto
        // 360 grados
        this(360.00);
    }

    // creamos los setters y los getters para modificar los valores del objeto
    public double getGrados() {
        return this.grad_circ;
    }

    public void setGrados(double grados) {
        this.grad_circ = grados;
    }

    public void sumGrados(double grados) {
        this.grad_circ = this.grad_circ + grados;
        while (this.grad_circ > MAX_CIRC) {
            this.grad_circ -= MAX_CIRC;
        }

    }
}
