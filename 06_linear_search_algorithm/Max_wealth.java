public class Max_wealth {
  public static void main(String[] args) {

    int[][] accounts = {
        { 2, 8, 7 },
        { 7, 1, 3 },
        { 1, 9, 5 }
    };

    int ans = maxWealth(accounts);
    System.out.println(ans);
  }

  static int maxWealth(int[][] arr) {
    int wealth = 0;

    for (int i = 0; i < arr.length; i++) {
      int money = 0;
      for (int j = 0; j < arr[i].length; j++) {
        money = money + arr[i][j];
      }

      if (money > wealth) {
        wealth = money;
      }
    }
    return wealth;
  }
}
