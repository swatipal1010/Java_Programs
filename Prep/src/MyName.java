public class MyName {
    public static void main(String[] args) {
        String arr[] = new String[7];
		arr[0]="****   *         *        *        ***  ***";
		arr[1]="*      *         *       * *        *    *";
		arr[2]="*      *         *      *   *       *    *";
		arr[3]="****   *    *    *     *******      *    *";
		arr[4]="   *   *   * *   *    *       *     *    *";
		arr[5]="   *   *  *   *  *   *         *    *    *";
		arr[6]="****   ***     ***  *           *   *   ***";
		
		//enhanced for loop  (for-each loop)
		for(String x:arr) {
			System.out.println(x);
		}

    }
}
