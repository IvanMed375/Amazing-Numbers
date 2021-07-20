package numbers;

import java.util.Scanner;

public class Main {

    static void propertiesForSpecial(long number, int range, boolean[] priority,
                                     boolean[] minusPriority, int counter) {
        StringBuilder properties;
        //even(0), odd(1), buzz(2), duck(3), palindromic(4), gapful(5),
        // spy(6), square(7), sunny(8), jumping(9)
        int i = 0;
        int temp;
        while (i < range) {
            temp = 0;
            properties = new StringBuilder();
            if (priority[0]) {
                if (!odd(number)) {
                    properties.append("even, ");
                    temp++;
                } else {
                    number++;
                    continue;
                }
            }
            if (priority[1]) {
                if (odd(number)) {
                    properties.append("odd, ");
                    temp++;
                } else {
                    number++;
                    continue;
                }
            }
            if (priority[2]) {
                if (buzz(number)) {
                    properties.append("buzz, ");
                    temp++;
                } else {
                    number++;
                    continue;
                }
            }
            if (priority[3]) {
                if (duck(number)) {
                    properties.append("duck, ");
                    temp++;
                } else {
                    number++;
                    continue;
                }
            }
            if (priority[4]) {
                if (palindromic(number)) {
                    properties.append("palindromic, ");
                    temp++;
                } else {
                    number++;
                    continue;
                }
            }
            if (priority[5]) {
                if (gapful(number)) {
                    properties.append("gapful, ");
                    temp++;
                } else {
                    number++;
                    continue;
                }
            }
            if (priority[6]) {
                if (spy(number)) {
                    properties.append("spy, ");
                    temp++;
                } else {
                    number++;
                    continue;
                }
            }
            if (priority[7]) {
                if (square(number)) {
                    properties.append("square, ");
                    temp++;
                } else {
                    number++;
                    continue;
                }
            }
            if (priority[8]) {
                if (sunny(number)) {
                    properties.append("sunny, ");
                    temp++;
                } else {
                    number++;
                    continue;
                }
            }
            if (priority[9]) {
                if (jumping(number)) {
                    properties.append("jumping, ");
                    temp++;
                } else {
                    number++;
                    continue;
                }
            }
            if (priority[10]) {
                if (happy(number)) {
                    properties.append("happy, ");
                    temp++;
                } else {
                    number++;
                    continue;
                }
            }
            if (priority[11]) {
                if (!happy(number)) {
                    properties.append("sad, ");
                    temp++;
                } else {
                    number++;
                    continue;
                }
            }
            //even(0), odd(1), buzz(2), duck(3), palindromic(4), gapful(5),
            // spy(6), square(7), sunny(8), jumping(9)
            if (minusPriority[0]) {
                if (!odd(number)) {
                    number++;
                    continue;
                }
            }
            if (minusPriority[1]) {
                if (odd(number)) {
                    number++;
                    continue;
                }
            }
            if (minusPriority[2]) {
                if (buzz(number)) {
                    number++;
                    continue;
                }
            }
            if (minusPriority[3]) {
                if (duck(number)) {
                    number++;
                    continue;
                }
            }
            if (minusPriority[4]) {
                if (palindromic(number)) {
                    number++;
                    continue;
                }
            }
            if (minusPriority[5]) {
                if (gapful(number)) {
                    number++;
                    continue;
                }
            }
            if (minusPriority[6]) {
                if (spy(number)) {
                    number++;
                    continue;
                }
            }
            if (minusPriority[7]) {
                if (square(number)) {
                    number++;
                    continue;
                }
            }
            if (minusPriority[8]) {
                if (sunny(number)) {
                    number++;
                    continue;
                }
            }
            if (minusPriority[9]) {
                if (jumping(number)) {
                    number++;
                    continue;
                }
            }
            if (minusPriority[10]) {
                if (happy(number)) {
                    number++;
                    continue;
                }
            }
            if (minusPriority[11]) {
                if (!happy(number)) {
                    number++;
                    continue;
                }
            }
            if (temp == counter) {
                propertiesForSeveral(number, 1, priority, minusPriority, properties);
                i++;
            }
            number++;
        }
//1 15 odd spy -duck spy buzz
    }

    static void propertiesForSeveral(long number, int range, boolean[] priority,
                                     boolean[] minusPriority,
                                     StringBuilder properties) {
        for (long i = number; i < number + range; i++) {
            if (range > 1) {
                properties = new StringBuilder();
            }
            if (!priority[2] && !minusPriority[2] && buzz(i)) {
                properties.append("buzz, ");
            }
            if (!priority[3] && !minusPriority[3] && duck(i)) {
                properties.append("duck, ");
            }
            if (!priority[4] && !minusPriority[4] && palindromic(i)) {
                properties.append("palindromic, ");
            }
            if (!priority[5] && !minusPriority[5] && gapful(i)) {
                properties.append("gapful, ");
            }
            if (!priority[6] && !minusPriority[6] && spy(i)) {
                properties.append("spy, ");
            }
            if (!priority[7] && !minusPriority[7] && square(i)) {
                properties.append("square, ");
            }
            if (!priority[8] && !minusPriority[8] && sunny(i)) {
                properties.append("sunny, ");
            }
            if (!priority[9] && !minusPriority[9] && jumping(i))  {
                properties.append("jumping, ");
            }
            if (!priority[10] && !minusPriority[10] && happy(i)) {
                properties.append("happy, ");
            } else if (!priority[11] && !minusPriority[11] && !happy(i)) {
                properties.append("sad, ");
            }
            if (!priority[1] && !minusPriority[1] && odd(i)) {
                properties.append("odd, ");
            } else if (!priority[0] && !minusPriority[0] && !odd(i)) {
                properties.append("even, ");
            }
            try {
                System.out.format("%d is %s%n", i,
                        properties.substring(0, properties.length() - 2));
            } catch (Exception e) {
                System.out.format("%d is", number);
            }
        }
    }

    static void propertiesForOne(long number) {
        System.out.format("Properties of %d%n", number);
        System.out.format("    jumping: %s%n", jumping(number));
        System.out.format("       buzz: %s%n", buzz(number));
        System.out.format("       duck: %s%n", duck(number));
        System.out.format("palindromic: %s%n", palindromic(number));
        System.out.format("     gapful: %s%n", gapful(number));
        System.out.format("        spy: %s%n", spy(number));
        System.out.format("     square: %s%n", square(number));
        System.out.format("      sunny: %s%n", sunny(number));
        System.out.format("      happy: %s%n", happy(number));
        System.out.format("        sad: %s%n", !happy(number));
        System.out.format("       even: %s%n", !odd(number));
        System.out.format("        odd: %s%n", odd(number));
    }

    static boolean happy (long number) {
        long temp;
        long sum = number;
        StringBuilder sums = new StringBuilder();
        sums.append(" ");
        while (true) {
            temp = sum;
            sum = 0;
            while (temp > 0) {
                sum += Math.pow(temp % 10, 2);
                temp /= 10;
            }
            if (sum == 1) {
                return true;
            }
            if (sums.toString().contains(" " + sum + " ")) {
                return false;
            }
            sums.append(sum).append(" ");
        }
    }

    static boolean jumping (long number) {
        boolean flag = true;
        while (number / 10 != 0) {
            if (Math.abs((number / 10) % 10 - number % 10) != 1) {
                flag = false;
                break;
            }
            number /= 10;
        }
        return flag;
    }

    static boolean sunny (long number) {
        return square(++number);
    }

    static boolean square (long number) {
        long temp = (long) Math.sqrt((double) number);
        return temp * temp == number;
    }

    static boolean spy (long number) {
        long sum = 0;
        long product = 1;
        long temp;
        while (number > 0) {
            temp = number % 10;
            sum += temp;
            product *= temp;
            number /= 10;
        }
        return sum == product;
    }

    static boolean gapful (long number) {
        boolean temp = number %
                (Character.getNumericValue(String.valueOf(number).charAt(0))
                * 10L + number % 10) == 0;
        return String.valueOf(number).length() > 2 && temp;
    }

    static boolean palindromic(long number) {
        boolean palindromic = true;
        char[] temp = String.valueOf(number).toCharArray();
        for (int i = 0; i < temp.length / 2; i++) {
            if (temp[i] != temp[temp.length - 1 - i]) {
                palindromic = false;
                break;
            }
        }
        return palindromic;
    }

    static boolean duck(long number) {
        while (number / 10 != 0) {
            if (number % 10 == 0) {
                return true;
            }
            number = number / 10;
        }
        return false;
    }

    static boolean odd(long number){
        return number % 2 != 0;
    }

    static boolean buzz(long number){
        return number % 7 == 0 ||
                number % 10 == 7;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Welcome to Amazing Numbers!\n\nSupported " +
                "requests:\n- enter a natural number to know its " +
                "properties;\n- enter two natural numbers to obtain the " +
                "properties of the list:\n  * the first parameter " +
                "represents a starting number;\n  * the second parameters " +
                "show how many consecutive numbers are to be processed;\n" +
                "- two natural numbers and two properties to search for;\n" +
                "- a property preceded by minus must not be present " +
                        "in numbers;\n" +
                "- separate the parameters with one space;\n" +
                "- enter 0 to exit.");
        long number;
        int range = 1;
        boolean one;
        boolean special;
        String input;
        int counter;
        int minusCounter;
        boolean[] priority = new boolean[12];
        boolean[] minusPriority = new boolean[12];
        String[] temp;
        String[] property = new String[12];
        String[] possibleProperties = {"even", "odd", "buzz", "duck",
                "palindromic", "gapful", "spy", "square", "sunny",
                "jumping", "happy", "sad", "-even", "-odd", "-buzz", "-duck",
                "-palindromic", "-gapful", "-spy", "-square", "-sunny",
                "-jumping", "-happy", "-sad"};
        while (true) {
            one = false;
            special = true;
            counter = 0;
            minusCounter = 0;
            for (int i = 0; i < 12; i++) {
                priority[i] = false;
                minusPriority[i] = false;
            }
            System.out.print("Enter a request: ");
            input = scan.nextLine();
            temp = input.split(" ");
            try {
                number = Long.parseLong(temp[0]);
            } catch (Exception e) {
                System.out.println("The first parameter should be a natural " +
                        "number or zero.");
                continue;
            }
            try {
                range = Integer.parseInt(temp[1]);
            } catch (Exception e) {
                one = true;
            }
            if (temp.length <= 2) {
                special = false;
            }
            for (int i = 0; i < temp.length - 2; i++) {
                property[i] = temp[i + 2];
                for (int j = 0; j < i; j++) {
                    if (property[j].equals(property[i])) {
                        counter--;
                    }
                }
                if (property[i].charAt(0) == '-') {
                    minusCounter++;
                }
                counter++;
            }

            String[] wrongInput = new String[12];
                int wrongInputCounter = 0;
            boolean foundEqual;
            if (special) {
                for (int i = 0; i < temp.length - 2; i++) {
                    property[i] = property[i].toLowerCase();
                    foundEqual = false;
                    for (String possibleProperty : possibleProperties) {
                        if (possibleProperty.equals(property[i])) {
                            foundEqual = true;
                            break;
                        }
                    }
                    if (!foundEqual) {
                        wrongInput[wrongInputCounter] = property[i];
                        wrongInputCounter++;

                    } else {
                        if (property[i].equals("even")) {
                            priority[0] = true;
                        }
                        if (property[i].equals("-even")) {
                            minusPriority[0] = true;
                        }
                        if (property[i].equals("odd")) {
                            priority[1] = true;
                        }
                        if (property[i].equals("-odd")) {
                            minusPriority[1] = true;
                        }
                        if (property[i].equals("buzz")) {
                            priority[2] = true;
                        }
                        if (property[i].equals("-buzz")) {
                            minusPriority[2] = true;
                        }
                        if (property[i].equals("duck")) {
                            priority[3] = true;
                        }
                        if (property[i].equals("-duck")) {
                            minusPriority[3] = true;
                        }
                        if (property[i].equals("palindromic")) {
                            priority[4] = true;
                        }
                        if (property[i].equals("-palindromic")) {
                            minusPriority[4] = true;
                        }
                        if (property[i].equals("gapful")) {
                            priority[5] = true;
                        }
                        if (property[i].equals("-gapful")) {
                            minusPriority[5] = true;
                        }
                        if (property[i].equals("spy")) {
                            priority[6] = true;
                        }
                        if (property[i].equals("-spy")) {
                            minusPriority[6] = true;
                        }
                        if (property[i].equals("square")) {
                            priority[7] = true;
                        }
                        if (property[i].equals("-square")) {
                            minusPriority[7] = true;
                        }
                        if (property[i].equals("sunny")) {
                            priority[8] = true;
                        }
                        if (property[i].equals("-sunny")) {
                            minusPriority[8] = true;
                        }
                        if (property[i].equals("jumping")) {
                            priority[9] = true;
                        }
                        if (property[i].equals("-jumping")) {
                            minusPriority[9] = true;
                        }
                        if (property[i].equals("happy")) {
                            priority[10] = true;
                        }
                        if (property[i].equals("-happy")) {
                            minusPriority[10] = true;
                        }
                        if (property[i].equals("sad")) {
                            priority[11] = true;
                        }
                        if (property[i].equals("-sad")) {
                            minusPriority[11] = true;
                        }
                    }
                }
                if (wrongInputCounter == 1) {
                    System.out.format("The property [%s] is wrong.%n" +
                                    "Available " +
                                    "properties: [EVEN, ODD, BUZZ, " +
                                    "DUCK, PALINDROMIC, GAPFUL, SPY, " +
                                    "SQUARE, SUNNY, JUMPING, HAPPY, SAD]%n",
                            wrongInput[0].toUpperCase());
                    continue;
                } else if (wrongInputCounter > 1)  {
                    StringBuilder collectWrongInput = new StringBuilder();
                    for (int i = 0; i < wrongInputCounter; i++) {
                        collectWrongInput.append(wrongInput[i].toUpperCase())
                                .append(", ");
                    }
                    System.out.format("The properties [%s] are " +
                                    "wrong%n" +
                                    "Available properties: [EVEN, ODD, " +
                                    "BUZZ, DUCK, PALINDROMIC, GAPFUL, SPY," +
                                    " SQUARE, SUNNY, JUMPING, HAPPY, SAD]%n",
                            collectWrongInput.substring(0,
                                    collectWrongInput.length() - 2));
                    continue;
                }
                if (priority[0] && priority[1]) {
                    System.out.format("The request contains mutually " +
                            "exclusive properties: [EVEN, ODD]\n" +
                            "There are no numbers with these properties.\n");
                    continue;
                }
                if (priority[3] && priority[6]) {
                    System.out.format("The request contains mutually " +
                            "exclusive properties: [DUCK, SPY]\n" +
                            "There are no numbers with these properties.\n");
                    continue;
                }
                if (priority[8] && priority[7]) {
                    System.out.format("The request contains mutually " +
                            "exclusive properties: [SUNNY, SQUARE]\n" +
                            "There are no numbers with these properties.\n");
                    continue;
                }
                if (priority[10] && priority[11]) {
                    System.out.format("The request contains mutually " +
                            "exclusive properties: [HAPPY, SAD]\n" +
                            "There are no numbers with these properties.\n");
                    continue;
                }
                if (minusPriority[0] && minusPriority[1]) {
                    System.out.format("The request contains mutually " +
                            "exclusive properties: [-EVEN, -ODD]\n" +
                            "There are no numbers with these properties.\n");
                    continue;
                }
                if (minusPriority[3] && minusPriority[6]) {
                    System.out.format("The request contains mutually " +
                            "exclusive properties: [-DUCK, -SPY]\n" +
                            "There are no numbers with these properties.\n");
                    continue;
                }
                if (minusPriority[8] && minusPriority[7]) {
                    System.out.format("The request contains mutually " +
                            "exclusive properties: [-SUNNY, -SQUARE]\n" +
                            "There are no numbers with these properties.\n");
                    continue;
                }
                if (minusPriority[10] && minusPriority[11]) {
                    System.out.format("The request contains mutually " +
                            "exclusive properties: [-HAPPY, -SAD]\n" +
                            "There are no numbers with these properties.\n");
                    continue;
                }
                boolean same = false;
                for (int i = 0; i < 12; i++) {
                    if (priority[i] && minusPriority[i]) {
                        System.out.format("The request contains mutually " +
                                "exclusive properties: [%s, %s]\n" +
                                "There are no numbers with these " +
                                "properties.\n",
                                possibleProperties[i].toUpperCase(),
                                possibleProperties[i + 12].toUpperCase());
                        same = true;
                    }
                }
                if (same) {
                    continue;
                }
            }
            if (number < 0) {
                System.out.println("The first parameter should be a natural " +
                        "number or zero.");
                continue;
            }

            if (number == 0) {
                break;
            }

            if (range < 1) {
                System.out.println("The second parameter should be a natural " +
                        "number");
            }
            counter -= minusCounter;
            if (one) {
                propertiesForOne(number);
            } else if (special) {
                propertiesForSpecial(number, range, priority, minusPriority, counter);
            } else {
                StringBuilder properties = new StringBuilder();
                propertiesForSeveral(number, range, priority, minusPriority, properties);
            }

        }
        System.out.println("Goodbye!");
    }
}
