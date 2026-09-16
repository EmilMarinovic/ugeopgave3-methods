import java.util.Scanner;

public class ugeOpgave3 {

    // Opgave 1
    /*
    // Erklærer og initialisere globale variabler og scanner
    double balance = 0;
    String accountName;
    Scanner input = new Scanner(System.in);

    // Lav metoder til deposit, withdraw og printBalance
    void deposit(double amount) {
        balance += amount;
        System.out.println("Du satte " + amount + " kr ind i banken");
    }

    void withdraw(double amount) {
        balance -= amount;
        System.out.println("Du tog " + amount + " kr ud af banken");
    }

    void printBalance(String accountName) {
        System.out.println("Kære " + accountName);
        System.out.println("Du har " + balance + " kr i din bank");
    }

    // getUserInputText og getUserInputNumber - kunne nok lægge dem sammen i en
    String getUserInputText (String text) {
        System.out.println(text);
        String userInput = input.nextLine();
        return userInput;
    }

    double getUserInputNumber (String text) {
        System.out.println(text);
        double inputAmount = input.nextDouble();
        return inputAmount;
    }



    void main() {
        String accountName = getUserInputText("Hvad hedder du?");
        double amountDeposit = getUserInputNumber("Hvor meget vil du indsætte?");
        deposit(amountDeposit);
        amountDeposit = getUserInputNumber("Hvor meget vil du indsætte?");
        deposit(amountDeposit);
        double amountWithdraw = getUserInputNumber("Hvor meget vil du hæve?");
        withdraw(amountWithdraw);
        printBalance(accountName);
    }
     */

    // Oggave 2
    /*
    // Erklær og initialiser globale variabler
    int assignmentPoints = 0;
    int examPoints = 0;
    int projectPoints = 0;

    // Metode til addpoints
    void addPoints(int points, String type) {
        if (type.equals("assignment")) {
            assignmentPoints += points;
        }
        else if (type.equals("exam")) {
            examPoints += points;
        }
        else if (type.equals("project")) {
            projectPoints += points;
        }
        else {
            System.out.println("Invalid type");
        }

    }

    // Metode til at få det totale antal af point
    int getTotal() {
        int total = assignmentPoints + examPoints + projectPoints;
        return total;
    }

    // Metode til at vælge en karakter
    int getGrade() {
        if (getTotal() >= 0 && getTotal() <= 50) {
            return -3;
        }
        else if (getTotal() <= 70) {
            return 00;
        }
        else if (getTotal() <= 85) {
            return 7;
        }
        else if (getTotal() <= 100) {
            return 12;
        }
        else {
            return 0;
        }
    }


    void printTotal() {
        System.out.println("Total points: " + getTotal());
        System.out.println("Grade: " + getGrade());
    }

    void main() {
        addPoints(25, "assignment");
        addPoints( 40, "exam");
        addPoints(30, "project");
        printTotal();
    }
     */

    // Opgave 3
    /*
    // Sæt scanner op
    Scanner input = new Scanner (System.in);

    // Metode til at anvende rabatten
    double applyDiscount(double price, int discountPercent) {
        double newPrice = price - (price / 100 * discountPercent);
        System.out.println("After using " + discountPercent + "% discount on the price " + price + ", your new price is " + newPrice);
        return newPrice;
    }

    // Metode til at finde den sidste pris (jeg lagde tax med ind her)
    double calculateFinalPrice(double basePrice, int discount) {
        double finalPrice = applyDiscount(basePrice, discount) * 1.25;
        System.out.println("After tax (25%), your final price is: " + finalPrice);
        return finalPrice;
    }

    void main() {
        System.out.println("Indtast en pris");
        double basisPrice = input.nextDouble();
        System.out.println("Indtast en rabatprocent");
        int discountPercent = input.nextInt();
        double finalPrice = calculateFinalPrice(basisPrice, discountPercent);
        System.out.println();
    }
     */

    // Opgave 4
    /*
    // Metode til at beregne gennemsnittet
    double calculateAverage(int[] numbers) {
        int sum = 0;
        for (int i = 0; i < numbers.length; i++) {
            sum += numbers[i];
        }
        return sum / numbers.length;
    }

    // Metode til at finde det største tal
    int findMax(int[] numbers) {
        int max = numbers[0];
        for (int i = 0; i < numbers.length; i++) {
            if (max < numbers[i]); {
                max = numbers[i];
            }
        }
        return max;
    }

    // Metode til at finde det mindste tal
    int findMin(int[] numbers) {
        int min = numbers[0];
        for (int i = 0; i < numbers.length; i++) {
            if (min > numbers[i]) {
                min = numbers[i];
            }
        }
        return min;
    }

    // Metode til at finde antal af tal der er over gennemsnittet
    int countAboveAverage(int[] numbers, double average) {
        int count = 0;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] > average) {
                count++;
            }
        }
        return count;
    }

    // Metode til print
    void printAllStats(int[] numbers, int max, int min, double average, int aboveAverage) {
        System.out.print("Tal: ");
        for (int number : numbers) {
            System.out.print(number + " ");
        }
        System.out.println();
        System.out.println("Det største tal er: " + max);
        System.out.println("Det mindste tal er: " + min);
        System.out.println("Gennemsnittet af tallene er: " + average);
        System.out.println("Der er " + aboveAverage + " tal der er over gennemsnittet");
    }

    void main() {
        int[] numbers = {45, 67, 23, 89, 34, 56, 78};
        double average = calculateAverage(numbers);
        int max = findMax(numbers);
        int min = findMin(numbers);
        int aboveAverage = countAboveAverage(numbers, average);
        printAllStats(numbers, max, min, average, aboveAverage);
    }
     */

    // Opgave 5
    /*
    void main() {
        int a = 7, b = 42;
        int smaller = minimum(a,b); // man skal gemme den returnerede værdi i en variabel, ellers kan vi ikke bruge den
        if (smaller == a) { // condition skal være i () og ikke {}
            System.out.println(a + " is the smallest!"); // a skal være skrevet som en variabel ikke string
        }

    }

    int minimum(int a, int b) { // det skal være int og ikke void, fordi metoden returnere en int
        if (a < b) {
            int smaller = a;
            return smaller; // hver udvej at metoden skal have en return
        } else { // else skal ikke have en condition
            int smaller = b;
            return smaller; // hver udvej at metoden skal have en return
        }
        // return int smaller; // man skal ikke skrive datatypen når man laver en return
    }
     */
}
