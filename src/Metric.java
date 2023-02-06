import java.util.Scanner;
public class Metric {
    public static void main(String[] args) {
        Scanner myscanner = new Scanner(System.in);
        System.out.println("Welcome to the Metric Converter!");
        System.out.println("Please input your query. Valid query options are as followed\n");
        System.out.println("km-mi \t mi-km \n m-ft \t ft-m \n kg-lb \t lb-kg \n g-oz \t oz-g \n mm-in \t in-mm \n");
        System.out.println("Enter 'exit' or '-1' to exit the program");

        while(true) {
            String input = myscanner.nextLine();
            
            if(input.equals("exit") || input.equals("-1")) {
                System.out.println("Have a good day!");
                break;
            }

            String[]parts = input.split(" ");
            if(parts.length !=4) {
                System.out.println("Your input is not valid within this program. Please input another query. For example, 1 km to mi");
                continue;
            }

            double value = Double.parseDouble(parts[0]);
            String from = parts[1];
            String to = parts[3];

            double result = 0;
            switch(from + "-" + to) {
                case "km-mi":
                result = value * 0.62137;
                break;
                case "mi-km":
                result = value / 0.62137;
                break;
                case "m-ft":
                result = value * 3.2808;
                break;
                case "ft-m":
                result = value / 3.2808;
                break;
                case "kg-lb":
                result = value * 2.2046;
                break;
                case "lb-kg":
                result = value / 2.2046;
                break;
                case "g-oz":
                result = value * 0.035274;
                break;
                case "oz-g":
                result = value / 0.035274;
                break;
                case "mm-in":
                result = value * 0.039370;
                break;
                case "in-mm":
                result = value / 0.039370;
                break;
                default:
                System.out.println("Your input is not valid within this program. Please input another query. For example, 1 km to mi");
                continue;
            }
            System.out.println(String.format("%.2f %s = %.2f %s", value, from, result, to));
        }
        myscanner.close();
    }
}