/*Write a function that takes a string of braces, and determines if the order of the braces is valid. It should return true if the string is valid, and false if it's invalid.

This Kata is similar to the Valid Parentheses Kata, but introduces new characters: brackets [], and curly braces {}. Thanks to @arnedag for the idea!

All input strings will be nonempty, and will only consist of parentheses, brackets and curly braces: ()[]{}.
What is considered Valid?

A string of braces is considered valid if all braces are matched with the correct brace.

Examples

"(){}[]"   =>  True
"([{}])"   =>  True
"(}"       =>  False
"[(])"     =>  False
"[({})](]" =>  False



*/

public class ValidBraces {
    public static void main(String[] args) {
        System.out.println("Resultado test >> " + test(true, "(){}[]"));
        System.out.println("Resultado test >> " + test(false,"[({})](]"));
        System.out.println("Resultado test >> " + test(true, "([{}])"));
        System.out.println("Resultado test >> " + test(false, "())({}}{()][]["));

    }

    public static String test(boolean esperado, String prueba){
        String resultadoTest = "no OK";
        if(esperado == isValid(prueba)) resultadoTest = "OK";
        return resultadoTest;
    }

    public static boolean isValid(String braces) {
        boolean res = false;
        int posUltAbierta = 1; // esta variable sirve para ver cuantas posiciones atras tengo que mirar para
                               // ver la ultima abierta sin cerrar
        int contadorAbiCerr = 0; // con esto contamos cuantas abrimos y cuantas cerramos, al final tiene que ser
                                 // 0
        char[] listBraces = braces.toCharArray();
        for (int x = 0; x < listBraces.length; x++) {
            if (listBraces[0] == '(' || listBraces[0] == '[' || listBraces[0] == '{') {
                if ((contadorAbiCerr == 0 && (listBraces[x] == '(' || listBraces[x] == '[' || listBraces[x] == '{'))
                        || contadorAbiCerr != 0) {
                    switch (listBraces[x]) {
                        case ']':
                            if (listBraces[x - posUltAbierta] != '[')
                                res = false;
                            else {
                                posUltAbierta += 2; // cada vez que se cierre una llave entendemos que la ultima abierta
                                                    // sin
                                contadorAbiCerr--; // cerrar esta 2 posiciones mas atras
                                if (contadorAbiCerr == 0)
                                    res = true; // si el contador despues de cerrar es 0 lo damos temporalmente por
                                                // bueno
                            }
                            break;
                        case ')':
                            if (listBraces[x - posUltAbierta] != '(')
                                res = false;
                            else {
                                posUltAbierta += 2;
                                contadorAbiCerr--;
                                if (contadorAbiCerr == 0)
                                    res = true;
                            }
                            break;
                        case '}':
                            if (listBraces[x - posUltAbierta] != '{')
                                res = false;
                            else {
                                posUltAbierta += 2;
                                contadorAbiCerr--;
                                if (contadorAbiCerr == 0)
                                    res = true;
                            }
                            break;
                        case '(':
                        case '[':
                        case '{':
                            posUltAbierta = 1; // si se abre una inicializamos la posicion de la ultima abierta a 1
                            contadorAbiCerr++;
                    }
                } else
                    res = false;
            } else
                res = false;
        }

        return res;
    }

}
