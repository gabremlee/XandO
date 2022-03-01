import java.util.Scanner;


// this will be a game of tic-tac-toe
// 1. choose an identity
// 2. screen and play
// 3. play involves checking if board space is available
// Now lets create a board first
public class Main {
    String[][] area = new String[3][3];
    int X = 0, O = 0;
    boolean state = true;

    void playerState(){
        state= !state;
    }

    void player(){
        if(state){
            System.out.println("player 1: ");
        }else{
            System.out.println("player 2: ");
        }
    }


    void win(String[][] board){
        if((board[0][0].equals("X ") & board[0][1].equals("X ") & board[0][2].equals("X ")) ||
        (board[1][0].equals("X ") & board[1][1].equals("X ") & board[1][2].equals("X ")) ||
        (board[2][0].equals("X ") & board[2][1].equals("X ") & board[2][2].equals("X ")) ||
        (board[0][0].equals("X ") & board[1][0].equals("X ") & board[2][0].equals("X ")) ||
        (board[0][1].equals("X ") & board[1][1].equals("X ") & board[2][1].equals("X ")) ||
        (board[0][2].equals("X ") & board[1][2].equals("X ") & board[2][2].equals("X ")) ||
        (board[0][0].equals("X ") & board[1][1].equals("X ") & board[2][2].equals("X ")) ||
        (board[2][0].equals("X ") & board[1][1].equals("X ") & board[0][2].equals("X ")) ||
        (board[0][0].equals("O ") & board[0][1].equals("O ") & board[0][2].equals("O ")) ||
                (board[1][0].equals("O ") & board[1][1].equals("O ") & board[1][2].equals("O ")) ||
                (board[2][0].equals("O ") & board[2][1].equals("O ") & board[2][2].equals("O ")) ||
                (board[0][0].equals("O ") & board[1][0].equals("O ") & board[2][0].equals("O ")) ||
                (board[0][1].equals("O ") & board[1][1].equals("O ") & board[2][1].equals("O ")) ||
                (board[0][2].equals("O ") & board[1][2].equals("O ") & board[2][2].equals("O ")) ||
                (board[0][0].equals("O ") & board[1][1].equals("O ") & board[2][2].equals("O ")) ||
                (board[2][0].equals("O ") & board[1][1].equals("O ") & board[0][2].equals("O "))){
            playerState();
            if(state == true){
                System.out.println();
                System.out.println();
                X++;
                System.out.println("player 1 wins");
                playerState();
                for(int i=0; i<3; i++){
                    for(int j=0; j<3; j++){
                        area[i][j] = "_ ";
                    }
                }
            }else{
                playerState();
                O++;
                System.out.println();
                System.out.println();
                System.out.println("player 2 wins");
                for(int i=0; i<3; i++){
                    for(int j=0; j<3; j++){
                        area[i][j] = "_ ";
                    }
                }
            }
        }

    }
    void board (){
        for(int i=0; i<3; i++){
            for(int j=0; j<3; j++){
                area[i][j] = "_ ";
            }
        }

        System.out.println("X:"+ X + "       O:" + O);

        for(int i=0; i<3; i++){
            for(int j=0; j<3; j++){
                System.out.print(area[i][j]);
            }
            System.out.println();
        }
    }



    void play(int x){
        if(x<=3 && state == true){
            if(area[0][x - 1].equals("_ ")){
                playerState();
                area[0][x-1]="X ";
                win(area);
            }else{
                state = true;
            }
        }else if(x<=6 && state == true){
            if(area[1][x - 4].equals("_ ")){
                playerState();
                area[1][x-4]="X ";
                win(area);
            }else{
                state = true;
            }
        }else if(x<=9 && state == true){
            if(area[2][x - 7].equals("_ ")){
                playerState();
                area[2][x-7]="X ";
                win(area);
            }else{
                state = true;
            }
        }else if(x<=3 && state == false){
            if(area[0][x - 1].equals("_ ")){
                playerState();
                area[0][x-1]="O ";
                win(area);
            }else{
                state = false;
            }
        }else if(x<=6 && state == false){
            if(area[1][x - 4].equals("_ ")){
                playerState();
                area[1][x-4]="O ";
                win(area);
            }else{
                state = false;
            }
        }else if(x<=9 && state == false){
            if(area[2][x - 7].equals("_ ")){
                playerState();
                area[2][x-7]="O ";
                win(area);
            }else{
                state = false;
            }
        }

        System.out.println("X:"+ X + "       O:" + O);


        for(int i=0; i<3; i++){
            for(int j=0; j<3; j++){
                System.out.print(area[i][j]);
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Main gab = new Main();
        gab.board();
        int a=9;
        while (a!=0){
            gab.player();
            Scanner scanner = new Scanner(System.in);
            a = scanner.nextInt();
            gab.play(a);
        }
    }
}
