import java.util.Scanner;

public class TicTacToe{

    public static void grid(String[][] table){
        System.out.println("-----+-----+----");
        for(int x=0;x<3;x++){
            System.out.print("|");
            for(int y=0;y<3;y++){
                System.out.print(" ");
                System.out.print(table[x][y]);
                System.out.print("  |");
            }
            System.out.println("");
            System.out.println("-----+----+-----");

        }
    }
    public static String player(String[][] table) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a valid empty place:");
        int place = sc.nextInt();

        if (place >= 1 && place <= 9) {
            int row = (place - 1) / 3;
            int col = (place - 1) % 3;

            if (table[row][col].equals(Integer.toString(place))) {
                table[row][col] = "X";
            } else {
                return player(table);
            }
        } else {
            return player(table);
        }

        return "";
    }


    public static String computer(String[][] table){
        if(table[1][1].equals("5")){
            return table[1][1]="O";
        }else{
            for(int i=0;i<3;i++){
                for(int j=0;j<3;j++){
                    if(i<=1){
                        if(table[i][j].equals("X") && !table[i+1][j].equals("X") && !table[i+1][j].equals("O")){
                        return table[i+1][j]="O";
                        }                    
                    }
                    else if(j<=1){if(table[i][j].equals("X") && !table[i][j+1].equals("X") && !table[i][j+1].equals("O")){
                        return table[i][j+1]="O";                       
                        } 
                    }
                    else if(i>1){
                        if(table[i][j].equals("X") && !table[i-1][j].equals("X") && !table[i-1][j].equals("O")){
                        return table[i+1][j]="O";
                        }                    
                    }
                    else if(j>1){
                        if(table[i][j].equals("X") && !table[i][j-1].equals("X") && !table[i][j-1].equals("O")){
                        return table[i][j-1]="O";                       
                        } 
                    }else if(!table[i][j].equals("X") && !table[i][j].equals("O")){
                        return table[i][j-1]="O"; 
                    }
                    else{
                        System.out.println("Some error occured!!!");
                        System.exit(0);
                    }

                }
            }
        }
        return "";
    }
    

  


    public static boolean hasWon(String[][] table,String player){
        for(int i=0;i<3;i++){
            //Check rows
            if(table[0][i].equals(player) && table[1][i].equals(player) && table[2][i].equals(player)){
                return true;
            } 
            //Check columns
            if(table[i][0].equals(player) && table[i][1].equals(player) && table[i][2].equals(player)){
                return true;
            }           
        }
        if(table[0][0].equals(player) && table[1][1].equals(player) && table[2][2].equals(player)){
                return true;
            } 
        if(table[2][0].equals(player) && table[1][1].equals(player) && table[0][2].equals(player)){
                return true;
            }
            
        return false;
        
    }

    public static void game(String[][] table){
        boolean result =false;
        for(int i=0;i<4;i++){
            player(table);
            grid(table);
            if(hasWon(table, "X")==true){
                result=true;
                System.out.println("Player won!!");
                break;
            }
            System.out.println("Computer's turn\n");
            computer(table);
            grid(table);
            if(hasWon(table, "O")==true){
                result=true;
                System.out.println("Computer won!!");
                break;
            }
        }
        if (result==false){
            System.out.println("Tie");
        }
    }


    public static void main(String[] args) {
        String[][] table=new String[3][3];
        int value=0;
        for(int x=0;x<3;x++){
            for(int y=0;y<3;y++){
                value++;
                table[x][y]=String.valueOf(value);
            }
        }
        grid(table);
        game(table);

    }
}