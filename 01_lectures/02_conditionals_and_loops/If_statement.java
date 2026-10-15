public class If_statement {
  public static void main(String[] args) {

    /*
     * SYNTAX OF IF STATEMENT:
     * if (boolean expression T or F) {
     * // body 1
     * } else {
     * // body 2
     * }
     */

    /* SINGLE IF-ELSE: */
    // int salary = 25000;
    // if(salary > 10000) {
    // salary = salary +2000;
    // } else {
    // salary = salary +1000;
    // }
    // System.out.println(salary);

    /* MULTIPLE IF-ELSE: */
    int salary = 25000;
    if (salary > 20000) {
      salary = salary + 5000;
    } else if (salary > 10000) {
      salary = salary + 3000;
    } else {
      salary = salary + 1000;
    }
    System.out.println(salary);
  }
}