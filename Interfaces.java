public class Interfaces {
    public static void main(String[] args) {
        Queen q = new Queen();
        q.moves();

        Rook r= new Rook();
        r.moves();

        King k = new King();
        k.moves();
    }
}

interface ChessPlayer{
    void moves(); //This method represents blueprint of moves, not define because for each chess player differnt moves   
}
class Queen implements ChessPlayer{
    public void moves(){
        System.out.println("Queen Moves : up, down, right, left, diagonal (in all direction)");
    }
}
class Rook implements ChessPlayer{
    public void moves(){
        System.out.println("Rook Moves : up, down, right, left");
    }
}
class King implements ChessPlayer{
    public void moves(){
        System.out.println("King Moves : up, down, right, left, diagonal (by 1 step)");
    }
}
 