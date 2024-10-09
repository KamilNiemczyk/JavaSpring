class Zad2 {
    public static boolean isArmstrongNumber(int number) {
        int temp = number;
        int sum = 0;
        int length = String.valueOf(number).length();
        while (temp != 0) {
            int digit = temp % 10;
            sum += Math.pow(digit, length);
            temp /= 10;
        }
        return sum == number;
    }
    public static void main(String[] args) {
        if (args.length == 0) {
            System.out.println("Nie podano argumentu");
        }else{
            int number = Integer.parseInt(args[0]);
            if (isArmstrongNumber(number)) {
                System.out.println("Liczba " + number + " jest liczba Armstronga");
            } else {
                System.out.println("Liczba " + number + " nie jest liczba Armstronga");
            }
        }
    }
}