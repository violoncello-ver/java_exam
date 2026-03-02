package q2;

/**
 * Q2. 文字列を逆転させなさい。確認する文字列はどんなものでも構いません。
 *
 * <pre>
 * (例)
 * "abcde" => "edcba"
 * "酔いしれ占う仲良いあの娘" => " この愛よ叶うなら嬉しいよ"
 * </pre>
 *
 * メソッドreverseを作成しなさい。
 *
 * @author y.morinaga
 */

public class Reverse {

    public static String reverse(String s) {
        if (s == null) {
            return null;
        }
        return new StringBuilder(s).reverse().toString();
    }

    public static void main(String[] args) {
        String reversed1 = reverse("abcde");
        System.out.println(reversed1); // edcba

        String reversed2 = reverse("酔いしれ占う仲良いあの娘");
        System.out.println(reversed2);
    }
}
