public class Heart{

	public static void main (String[] args){
	
		System.out.printf("%s%n%s%n%s%n%s%n%s%n%s%n%s%n%s%n%s%n%s%n%s%n%s%n%s%n%s%n%s%n%s%n", "       *   *           *   *   ","    *        *       *        * ",

"  *           *     *           *"," *     * *      * *      * *     *","*   *       *    *    *      *    *","*             *     *             *"," *  *           * *          *   *",
"  *  *           *          *   *","   *   *                  *    *","    *    *              *     *","      *    *          *     *","        *     *     *     *",
"          *      *      *","            *         *","              *     *","                 *");

	
		int row = 10;
		int  asteriskPrinter  = 10;

			for (int counter = 1; counter <= row; counter++){
				for (int asteriskCounter = 1; asteriskCounter <= asteriskPrinter; asteriskCounter++){
					System.out.print("* ");
				}
					System.out.println();
					asteriskPrinter--;
				
				}
			

	

}




}