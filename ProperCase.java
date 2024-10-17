public class ProperCase {
    public static void main(String[] args) {
        String str = "kAsHisH";
        String properCase = convertToProperCase(str);
        System.out.println(properCase);
    }

    public static String convertToProperCase(String str) {
        if (str == null || str.isEmpty()) {
            return str;
        }

        StringBuilder result = new StringBuilder();
        boolean nextToUpper = true;

        for (char c : str.toCharArray()) {
            if (Character.isWhitespace(c)) {
                result.append(c);
                nextToUpper = true;
            } else if (nextToUpper) {
                result.append(Character.toUpperCase(c));
                nextToUpper = false;
            } else {
                result.append(Character.toLowerCase(c));
            }
        }

        return result.toString();
    }
}


