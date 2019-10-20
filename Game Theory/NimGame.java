// Java to find nim-game winner
class NimGame {

    // function to find winner of NIM-game
    static String findWinner(int A[], int n)
    {
        int res = 0;

        for (int i = 0; i < n; i++)
            res ^= A[i];

        // case when Alice is winner
        if (res == 0 || n % 2 == 0)
            return "Alice";

            // when Bob is winner
        else
            return "Bob";
    }

    //Driver code
    public static void main (String[] args)
    {
        int A[] = { 1, 4, 3, 5 };
        int n =A.length;

        System.out.print("Winner = "
                + findWinner(A, n));
    }
}