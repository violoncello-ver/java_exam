public class Exam3 {
  public static void main(String[] args) {
    int item1 = 200;
    int item2 = 250;
    final double TAX = 0.1;
    System.out.println("小計\n" + (item1 * 3 + item2 * 4) + "円");
    System.out.println("消費税\n" + (int)((item1 * 3 + item2 * 4) * TAX) + "円");
    System.out.println("合計金額\n" + (int)((item1 * 3 + item2 * 4) * (1 + TAX)) + "円");
  }
}
