
public class Main {

    public static void main(String[] args) {
        /*
            Работа со строкой как с массивом символов
            5. Удалить в строке все лишние пробелы, то есть серии подряд идущих пробелов заменить на одиночные пробелы.
            Крайние пробелы в строке удалить.
         */

//        String str = "    Удалить     в  строке все     лишние  пробелы.  ";
//        System.out.println(str);
//        String strTrim = str.trim();
//        while (strTrim.contains("  ")) {
//            strTrim = strTrim.replace("  ", " ");
//        }
//        System.out.println(strTrim);


        String str = "    Удалить     в  строке все     лишние  пробелы.    ";
        System.out.println(str);

        char[] chars = str.toCharArray();
        char[] newChars = new char[chars.length];
        for (int i = 0, j = 0; i < chars.length - 1; i ++, j ++) {
            if (chars[i] != ' ' || (chars[i] == ' ' && chars[i + 1] != ' ')) {
                newChars[j] = chars[i];
            } else j --;
        }

        String res = String.copyValueOf(newChars);
        System.out.println(res.trim());
    }
}
