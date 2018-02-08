public class starpattern12{

    public static void main(String args[]) {
         for (;; ) {     
            int i, space, rows, k = 0;
            Scanner scan = new Scanner(System.in);
            System.out.print("Enter Number of Rows : ");

            rows = scan.nextInt();
            System.out.println("");
           
            for (i = 1; i <= rows; i++) {
                for (space = 1; space <= (rows - i); space++) {
                    System.out.print("  ");
                }
                while (k != (2 * i - 1)) {
                    System.out.print("* ");
                    k++;
                }
                k = 0;
                System.out.println();
                 
            }
                System.out.println("");
                System.out.print("Exit(Y/N):");
                String Exit = scan.next();
                System.out.println("");
                    if (Exit.equalsIgnoreCase("Y")) {
                
                         System.out.println("Thank You for using Programme.....");
                                break;
                    } else if (Exit.equalsIgnoreCase("N")) {
                                continue;
            }
        }
    }
}
