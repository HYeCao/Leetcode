package a_3_26;

public class JudgeCircle {
    public boolean judgeCircle(String moves) {
        int x = 0, y = 0;
        for (int i = 0; i < moves.length(); i++) {
            if (moves.charAt(i) == 'U') x += 1;
            if (moves.charAt(i) == 'D') x -= 1;
            if (moves.charAt(i) == 'R') y += 1;
            if (moves.charAt(i) == 'L') y -= 1;
        }
        if (x == 0 && y == 0) return true;
        else {
            return false;
        }
    }
}
