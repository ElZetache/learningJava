package teoria;
//prueba de objetos
public class progCirculo {
    public static void main(String[] args){
        //! el objeto esta definido en Circumferencia.java, tienen que estar en el mismo paquete o 
        //! en su defecto importarlo
        Circumferencia circulo1 = new Circumferencia(-350);
        Circumferencia circulo2 = new Circumferencia(450);

        System.out.println(circulo1.getGrados());
        System.out.println(circulo2.getGrados());

        circulo1.setGrados(360);

        System.out.println(circulo1.getGrados());
        circulo1.sumGrados(30);
        System.out.println(circulo1.getGrados());
    }
}
