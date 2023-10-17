package gobang;/*
package gobang;

import java.util.ArrayList;

public class Board1 {
    int boardSize=15;
    char[][] board;
    Board1(){
        board=new char[boardSize][boardSize];
    }
    Board1(int boardSize){
        this.boardSize=boardSize;
        board=new char[boardSize][boardSize];
    }
    public void initialBoard(){
        for(int i=0;i<boardSize;i++) {
            for(int j=0;j<boardSize;j++){
                board[i][j]='+';
            }
        }
    }
    //判断是否越界
    public boolean isCrossLine(int x,int y){
        return (x<0||x>=boardSize||y<0||y>=boardSize)
    }
    public boolean updateBoard(int x,int y,char icon){
        if(isCrossLine(x,y)){
            System.out.println("位置越界！");
            return false;
        }
        if(board[x][y]!='+'){
            System.out.println("该位置已有棋子");
            return false;
        }
        board[x][y]=icon;
        return true;
    }
    public boolean checkHorizon(int x,char icon){
        int curLen=0;
        for(int i=0;i<boardSize;i++){
            if(board[x][i]==icon){
                curLen++;
                if(curLen==5) return true;
            }else{
                curLen=0;
            }
        }
        return false;
    }
    public boolean checkVertical(int y,char icon){
        int curLen=0;
        for(int i=0;i<boardSize;i++){
            if(board[i][y]==icon){
                curLen++;
                if(curLen==5)return true;
            }else{
                curLen=0;
            }
        }
        return false;
    }
    //判断斜
    public boolean checkIncline(int x,int y,char icon){

        if(x>=y) {
            int X=x-y;
            int Y=0;
            int curLen=0;
            while(true){
                if(isCrossLine(X,Y)){
                    break;
                }

            }
        }
        return false;
    }
    //从当前下的位置判断

}
*/

import java.util.Scanner;

class Game{
    char c='●';

    public Board board = new Board();
    public Person person1 = new Person(1);
    public Person person2 = new Person(-1);
    public Person cur;
    public Piece curPiece;
    public boolean flag = true;
    public Game(){

    }
    public void begin(){
        boolean end_flag = false;
        this.cur = person1;
        board.print();
        while(!end_flag){
            if(fun()) {
                if(isWin(this.board.a, curPiece.x-1, curPiece.y-1)){
                    String s ;
                    if(flag)
                        s = "白子赢了";
                    else
                        s = "黑子赢了";
                    System.out.println(s);
                    return;
                }
                board.print();
                System.out.println("是否继续");
                Scanner scan = new Scanner(System.in);
                if (!scan.next().equals("y")) {
                    end_flag = true;
                }
            }
        }
    }
    public Boolean fun(){
        System.out.print("请输入您下棋的坐标，应以x，y的格式写入，当前玩家所执为");
        if(this.flag)
            System.out.println("黑子");
        else
            System.out.println("白子");
        Piece piece = cur.setPiece();
        int res = board.setPiece(piece, cur);
        if(res == 0){
            if(this.flag)
                cur = person2;
            else
                cur = person1;
            flag = !flag;
            curPiece = piece;
        }
        else if (res == 2){
            System.out.println("坐标错误，请重新输入");
            return false;
        }
        else{
            System.out.println("该坐标已有棋子，请重新输入");
            return false;
        }
        return true;
    }

    public boolean isWin(int[][] chessArray, int r, int c) {
        //判断四个方向上是否有五子连子
        return row(chessArray, r, c) >= 5 || column(chessArray, r, c) >= 5 ||
                leftUpToRightDown(chessArray, r, c) >= 5 || LeftDownToRightUp(chessArray, r, c) >= 5;
    }

    public static int row(int[][] chessArray, int r, int c) {
        int count = 1;
        //找到当前所下的棋子
        int cnumber = chessArray[r][c];
        //向右找
        for (int i = c + 1; i < chessArray.length; i++) {
            //判断从右边第一个棋子开始，是否与所下棋子一致
            if (cnumber == chessArray[r][i]) {
                count++;
            } else {
                break;
            }
        }
//        System.out.println("横向向右查找到：count=" + count);
        //向左找
        for (int i = c - 1; i >= 0; i--) {
            //判断从左边第一个棋子开始，是否与所下棋子一致
            if (cnumber == chessArray[r][i]) {
                count++;
            } else {
                break;//如果右边是不同数值的棋子，就不用继续再往右找了
            }
        }
//        System.out.println("横向向左查找到：count=" + count);
        return count;
    }

    public static int column(int[][] chessArray, int r, int c) {
        int count = 1;
        int cnumber = chessArray[r][c];
        for (int i = r + 1; i < chessArray.length; i++) {
            if (cnumber == chessArray[i][c]) {
                count++;
            } else {
                break;
            }
        }
//        System.out.println("竖向向下查找到：count=" + count);
        for (int i = r - 1; i >= 0; i--) {
            if (cnumber == chessArray[i][c]) {
                count++;
            } else {
                break;
            }
        }
//        System.out.println("竖向向上查找到：count=" + count);
        return count;
    }
    public static int leftUpToRightDown ( int[][] chessArray, int r, int c){
        int count = 1;
        int cnumber = chessArray[r][c];
        //向左上找，行列值都变小，i--，j--
        for (int i = r - 1, j = c - 1; i >= 0 && j >= 0; i--, j--) {
            if (cnumber == chessArray[i][j]) {
                count++;
            } else {
                break;
            }
        }
//        System.out.println("向左上查找到：count=" + count);
        //向右下查找，行列值都变大，i++，j++
        for (int i = r + 1, j = c + 1; i < chessArray.length && j < chessArray.length; i++, j++) {
            if (cnumber == chessArray[i][j]) {
                count++;
            } else {
                break;
            }
        }
//        System.out.println("向右下查找到：count=" + count);
        return count;
    }
    public static int LeftDownToRightUp(int[][] chessArray,int r,int c){
        int count=1;
        int cnumber=chessArray[r][c];
        //右上方查找
        for(int i = r + 1, j = c - 1; i >= 0 && j >= 0; i++, j--){
            if(cnumber==chessArray[i][j]){
                count++;
            }else{
                break;
            }
            //左下方查找
        }for(int i = r - 1, j = c + 1; i >= 0 && j >= 0; i--, j++){
            if(cnumber==chessArray[i][j]){
                count++;
            }else{
                break;
            }
        }
        return count;
    }
}

class Board{
    public int length=22;
    public int[][] a = new int[length][length];
    public Board(){
        this.init();
    }
    public void init(){
        for(int i = 0 ; i < length ; i ++){
            for(int j = 0 ; j < length ; j ++)
                this.a[i][j] = 0;
    }

    public int setPiece(Piece piece, Person person){
        int res = checkPiece(piece);
        if(res ==0)
            this.a[piece.x - 1][piece.y - 1] = person.flag;
        return res;
    }

    public int checkPiece(Piece piece){
        if(check(piece.x) && check(piece.y)){
            if(a[piece.x-1][piece.y-1] == 0)
                return 0;
            else
                return 1;
        }
        return 2;
    }

    public boolean check(int m){
        return 1 <= m && m <= length;
    }

    public void print(){
        for(int i = 0 ; i < length; i++){
            String tmp;
            if ( (i+1) / 10 == 0)
                tmp = "0" + String.valueOf(i+1);
            else
                tmp = String.valueOf(i+1);
            if(i%2 == 0)
                System.out.print("  " + tmp);
        }
        System.out.print("\n");
        for(int i = 0 ; i < length; i ++){
            StringBuilder tmp;
            if ( (i+1) / 10 == 0)
                tmp = new StringBuilder("0" + String.valueOf(i + 1));
            else
                tmp = new StringBuilder(String.valueOf(i + 1));
            tmp.append(" ");
            for(int j = 0 ; j < length ; j++){
//                tmp.append(a[i][j]+" ");
                switch (a[i][j]) {
                    case 0 -> tmp.append("+ ");
                    case 1 -> tmp.append("# ");
                    case -1 -> tmp.append("$ ");
                }
            }
            System.out.println(tmp);
        }
    }
}
class Person{
    public Scanner scan=new Scanner(System.in);
    public int flag;
    public Piece curPiece;
    public Person(int flag){
        this.flag = flag;
    }
    public Piece setPiece(){
        String[] s = scan.nextLine().split(",");
        this.curPiece = new Piece(Integer.parseInt(s[0]), Integer.parseInt(s[1]));
        return curPiece;
    }

}

class Piece{
    public int x;
    public int y;
    public Piece(int x, int y){
        this.x = x;
        this.y = y;
    }
}
public class work {
    public static void main(String[] args) {
        Game game = new Game();
        game.begin();
    }
}

