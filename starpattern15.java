public class starpattern15{

    public static void main(String args[]) {
         for (;;) {

            int arr[] = new int[10];
            int i, num, n, c = 0, pos = 0; //pos=possition
            Scanner scan = new Scanner(System.in);

            System.out.print("Enter Array Size : ");
            n = scan.nextInt();

            System.out.print("Enter Array Elements : ");
            for (i = 0; i < n; i++) {
                arr[i] = scan.nextInt();
            }

            System.out.print("Enter the Number to be Search : ");
            num = scan.nextInt();

            for (i = 0; i < n; i++) {
                if (arr[i] == num) {
                    c = 1;
                    pos = i + 1;
                    break;
                }
            }
            if (c == 0) {
                System.out.print("Number Not Found..!!");
            } else {
                System.out.print(num + " found at position " + pos);
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
