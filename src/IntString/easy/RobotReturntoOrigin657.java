package IntString.easy;

public class RobotReturntoOrigin657 {
    public boolean judgeCircle(String moves){
        moves = " "+moves + " ";
        return moves.split("L").length == moves.split("R").length &&
                moves.split("U").length == moves.split("D").length;
    }

}
