import java.util.Scanner;

public class TicTacToeDriver
{
    public static void main(String[] args)
    {
        TicTacToe t=new TicTacToe(3);
        int turn=1,i,j;

        Scanner sc=new Scanner(System.in);

        for(int k=0; k<9; k++)
        {
            System.out.println(turn+"'s turn:");
            System.out.println("Enter the positions in row and col format:");
            i=sc.nextInt();j=sc.nextInt();
            if(turn==1)
            {
                t.markBoard('x',i,j);
            }
            if(turn==2)
            {
                t.markBoard('o',i,j);
            }

            turn++;
            if(turn>2)
                turn=1;

            t.printBoard();
            System.out.println();
        }
    }
}
