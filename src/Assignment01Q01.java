public class Assignment01Q01 {
    public static void main(String[] args) {
        // TODO: Implement Q01
        for(String arg: args)
            {
                char FirstChar = arg.charAt(0);
                if(FirstChar %5 == 0)  System.out.println(FirstChar);

            }
    }
}
