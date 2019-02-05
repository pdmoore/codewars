public class SquareDigit {
    public int squareDigits(int input) {
        char[] digits = Integer.toString(input).toCharArray();
        StringBuilder sb = new StringBuilder();
        for (char digit :
                digits) {
            int thisDigit = Character.getNumericValue(digit);
            sb.append(thisDigit * thisDigit);
        }

        return Integer.parseInt(sb.toString());
    }
}
