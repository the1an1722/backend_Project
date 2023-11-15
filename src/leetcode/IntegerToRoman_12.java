package leetcode;

public class IntegerToRoman_12 {
    public String intToRoman(int num) {
        // Arrays to store the Roman numeral symbols and their corresponding values
        int[] values = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
        String[] symbols = {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};

        StringBuilder roman = new StringBuilder();

        // Iterate through the values and symbols
        for (int i = 0; i < values.length; i++) {
            while (num >= values[i]) {
                // Append the symbol to the result and subtract
                // the corresponding value from num
                roman.append(symbols[i]);
                num -= values[i];
            }
        }
        return roman.toString();
    }
}
