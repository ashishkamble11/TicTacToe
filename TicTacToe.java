class TicTacToe
{
    char[][] board;

    TicTacToe(int m)
    {
        board=new char[m][m];
    }

    void markBoard(char value, int row, int col)
    {
        if(checkPlaceAlreadyMarked(row,col)=='x')
        {
            System.out.println("Position alreay marked by 1st player.");
        }
        else if(checkPlaceAlreadyMarked(row,col)=='o')
        {
            System.out.println("Position alreay marked by 2nd player.");
        }
        else
        {
            board[row][col] = value;
            char win = checkWiningCondition();
            if (win == 'x')
            {
                System.out.println("1st player win the game.");
                printBoard();
                System.exit(0);
            }
            else if (win == 'o')
            {
                System.out.println("2nd player win the game.");
                printBoard();
                System.exit(0);
            }
            /*else if (win == ' ')
            {
                System.out.println("It is tie.");
                System.exit(0);
            }*/
        }
    }

    char checkPlaceAlreadyMarked(int row, int col)
    {
        char c=board[row][col];
        if(c=='x')
            return 'x';
        else if (c=='o')
            return 'o';
        else
            return ' ';
    }

    char checkWiningCondition()
    {
        //checking row wise
        for(int i=0; i<board.length; i++)
        {
            if(check(board[i][i],board[i][1],board[i][2]))
            {
                return board[i][i];
            }
        }

        //checking column wise
        for(int i=0; i<board.length; i++)
        {
            if(check(board[i][i],board[1][i],board[2][i]))
            {
                return board[i][i];
            }
        }

        //checking right top to left bottom
        for(int i=0; i<board.length; i++)
        {
            if(check(board[i][i],board[1][1],board[2][2]))
            {
                return board[i][i];
            }
        }

        //checking left top to right bottom
        for(int i=0; i<board.length; i++)
        {
            if(check(board[2][i],board[1][1],board[i][2]))
            {
                return board[i][i];
            }
        }

        return ' ';
    }

    boolean check(char one, char two, char three)
    {
        if(one==two && one==three && one!=' ' && two!=' ' && three!=' ')
        {
            return true;
        }
        return false;
    }

    void printBoard()
    {
        System.out.println("\nPrinting Board:");
        for(char arr[] : board)
        {
            for(char c : arr)
            {
                System.out.print(c+" ");
            }
            System.out.println();
        }
    }
}