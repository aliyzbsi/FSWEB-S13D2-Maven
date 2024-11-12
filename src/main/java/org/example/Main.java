package org.example;

public class Main {
    public static void main(String[] args) {


        System.out.println(isPalindrome(-1221));
        System.out.println("Mükemmel mi? :" + isPerfectNumber(-1));
        System.out.println(numberToWords(123));
    }

    public static boolean isPalindrome(int number) {

        number=Math.abs(number);

        StringBuilder stringSayi = new StringBuilder(String.valueOf(number));
        String newStr = stringSayi.reverse().toString();
        int reversedNumber = Integer.parseInt(newStr);
        if (number == reversedNumber) {
            return true;
        }
        return false;
    }

    public static boolean isPerfectNumber(int number) {
        if (number < 0) {
            return false;
        }
        int toplam = 0;
        for (int i = 1; i < number; i++) {
            if (number % i == 0) {
                toplam += i;
            }
        }
        if (toplam == number) {
            return true;
        }
        return false;
    }

    public static String numberToWords(int number) {
        if (number < 0) {
            return "Invalid Value";
        }
        String numberStr = String.valueOf(number);
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < numberStr.length(); i++) {
            char karakter = numberStr.charAt(i);





            switch (karakter) {
                case '0':
                    result.append("Zero ");
                    break;
                case '1':
                    result.append("One ");
                    break;
                case '2':
                    result.append("Two ");
                    break;
                case '3':
                    result.append("Three ");
                    break;
                case '4':
                    result.append("Four ");
                    break;
                case '5':
                    result.append("Five ");
                    break;
                case '6':
                    result.append("Six ");
                    break;
                case '7':
                    result.append("Seven ");
                    break;
                case '8':
                    result.append("Eight ");
                    break;
                case '9':
                    result.append("Nine ");
                    break;
                default:
                    result.append("");
                    break;
            }

        }


        return result.toString().trim();
    }
}
