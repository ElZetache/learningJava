//*Complete the solution so that the function will break up camel casing, using a space between words.

public class CamelCase {
    public static void main(String[] args) {
        System.out.println(camelCase("AlbertHuerta"));

    }

    public static String camelCase(String input) {
        String res = "";
        for (int x = 0; x < input.length(); x++) {
            if (input.substring(x, x + 1) == input.substring(x, x + 1).toUpperCase())
                res += " " + input.substring(x, x + 1);
            else {
                res += input.substring(x, x + 1);
            }
        }

        return res;
    }
}
