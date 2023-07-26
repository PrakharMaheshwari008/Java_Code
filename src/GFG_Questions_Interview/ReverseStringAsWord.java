package GFG_Questions_Interview;

public class ReverseStringAsWord {
    public static void main(String[] args) {
        String str = "i.like.this.program.very.much";
        String[] splited = str.split("\\.");
        for (int i = splited.length-1;i >=0;i--)
        System.out.println(toCSV(splited));
    }
    public static String toCSV(String[] array) {
        String result = "";

        if (array.length > 0) {
            StringBuilder sb = new StringBuilder();

            for (String s : array) {
                sb.append(s).append(",");
            }

            result = sb.deleteCharAt(sb.length() - 1).toString();
        }
        return result;
    }
}