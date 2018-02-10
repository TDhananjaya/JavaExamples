public class starpattern13{

    public static void main(String args[]) {
          for (;;) {

            int arr[] = new int[50];
            int n, i;
            Scanner scan = new Scanner(System.in);

            System.out.print("How Many Element You Want to Store in Array : ");
            n = scan.nextInt();

            System.out.print("Enter " + n + " Element to Store in Array : ");
            for (i = 0; i < n; i++) {
                arr[i] = scan.nextInt();
            }
            
            System.out.println("");
            System.out.print("Elements in Array is : ");
             
            for (i = 0; i < n; i++) {
                System.out.print(arr[i] + "  ");

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
