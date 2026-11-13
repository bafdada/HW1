public class Assignment01Q03 {
    public static void main(String[] args) {
        int x = Integer.parseInt(args[0]); // TODO: Read the first string argument (replace this line)
        System.out.println("The first " + x + " Fibonacci numbers are:");

        ////////////////////////////////////////////////////////////////
        // TODO: Replace this code with the correct Fibonacci sequence
        ////////////////////////////////////////////////////////////////
        /// ...
        
        int numOdd = 0;
        long prev= 1;
        long curr = 1;
        for (int i = 0; i < x; i++)
        {
            long val ;
            if (i == 0 || i == 1)
            {
                val = 1;
            }
            else 
            {
                val = prev + curr;
                prev = curr;
                curr = val;
            }
            if(val % 2 !=0)
            {
                numOdd++;
            }
            System.out.print(val);
            if (i < x - 1) 
                System.out.print(" "); // Make sure we don't print a trailing space
        }
        System.out.println();
        
        ////////////////////////////////////////////////////////////////
        
        System.out.println("The number of odd numbers is: " + numOdd);
    }
}
