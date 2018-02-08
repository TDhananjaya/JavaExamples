public class starpattern13{

    public static void main(String args[]) {
          for (;;) {
            
                int r, i, k, number = 1, j;
                Scanner scan = new Scanner(System.in);

                System.out.print("Enter Number of Rows : ");
                r = scan.nextInt();

                for (i = 0; i < r; i++) {
                    for (k = r; k > i; k--) {
                        System.out.print(" ");
                    }
                    number = 5; //1st number
                    for (j = 0; j <= i; j++) {
                        System.out.print(number + " ");
                        number = number * (i - j) / (j + 1); // 
                    }
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
