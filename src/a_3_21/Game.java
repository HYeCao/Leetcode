/**
 * 
 */
package a_3_21;

/**
 * @author caohongye
 *
 */
public class Game {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	public int game(int[] guess, int[] answer) {
		int res=0;
		for(int i=0;i<guess.length;i++){
			if(guess[i]==answer[i])res++;
		}
		return res;
		
    }
}
