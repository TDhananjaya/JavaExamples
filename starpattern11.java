public class starpattern11{

    public static void main(String args[]) {
        int i, j, num;
        for(i=0; i<5; i++)
        {
            num=1; // can chage 1st row changing number
            for(j=0; j<=i; j++)
            {
                System.out.print(num+ " ");
                num++;
                num++;

            }
            System.out.println();
        }
    }
}
