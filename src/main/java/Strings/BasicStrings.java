package Strings;


public class BasicStrings {

    public String flipConcat(String string1, String string2) {
        return string2 + string1;
    }

    public char getChar(String string, int index) {
        if (index >= 0 && index < string.length())
            return string.charAt(index);
        return ' ';
    }

    public String iCantSee(String string) {
        String result = "";
        for (int i = 0; i < string.length(); i++)
            result += " ";
        return result;
    }

    public String loudAndClear(String string) {
        return string.toUpperCase();
    }

    public String reverseCase(String string) {
        String result = "";
        for (int i : string.toCharArray()){
            if (Character.isLowerCase(i))
                result += (char) Character.toUpperCase(i);
            else
                result += (char) Character.toLowerCase(i);
        }
        return result;
    }

    public String oneAtATime(String string1, String string2) {
        StringBuilder sb = new StringBuilder();
        for(int i=0; i<string1.length(); i++) {
            if(i>=string2.length()){
                sb.append(string1.substring(i));
                break;
            }
            sb.append(string1.charAt(i));
            sb.append(string2.charAt(i));
        }
        if(string2.length()>string1.length()){
            sb.append(string2.substring(string2.length()-string1.length()));
        }

        return sb.toString();
    }
}
