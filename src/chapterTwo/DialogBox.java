import javax.swing.JOptionPane;
	
public class DialogBox{

	public static void main(String[] args){

		String name = JOptionPane.showInputDialog("What is your name?");
		String message = String.format("Happy Valentine's day, %s%n", name);
	
		JOptionPane.showMessageDialog(null, message);

		System.out.println("       *   *           *   *   ");
		System.out.println("    *        *       *        * ");
		System.out.println("  *           *     *           *");
		System.out.println(" *     * *      * *      * *    *");
		System.out.println("*   *       *    *    *      *   *");
		System.out.println("*             *     *            *");
		System.out.println(" *  *           * *          *  *");
		System.out.println("  *  *           *          *  *");
		System.out.println("   *   *                  *   *");
		System.out.println("    *    *              *    *");
		System.out.println("      *    *          *    *");
		System.out.println("        *     *     *    *");
		System.out.println("          *      *     *");
		System.out.println("            *        *");
		System.out.println("              *    *");
		System.out.println("                 *");

	}


}