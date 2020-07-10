import java.util.Scanner;

/*
 * # 숫자이동[2단계]
 * 1. 숫자2는 캐릭터이다.
 * 2. 숫자1을 입력하면, 캐릭터가 왼쪽으로
 * 	    숫자2를 입력하면, 캐릭터가 오른쪽으로 이동한다.
 * 3. 단, 좌우 끝에 도달했을 때, 예외처리를 해야한다.
 * 4. 숫자 1은 벽이다. 벽을 만나면 이동할 수 없다.
 * 5. 단, 숫자3을 입력하면, 벽을 격파할 수 있다.
 */

public class MovingNumber {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int[] game = {0, 0, 1, 0, 2, 0, 0, 1, 0};
		
		int player=0;
		for(int i=0; i<game.length; i++) {
			if(game[i]==2) {
				player = i;
			}
		}
		
		while(true) {
			
			for(int i=0; i<game.length; i++) {
				if(game[i] == 2) {
					System.out.print("옷   ");
				}else {
					System.out.print(game[i] + " ");
				}
			}
			System.out.println();
			
			System.out.print("[1]왼쪽 [2]오른쪽 입력 : ");
			int move = scan.nextInt();
			
			if(move==1) {
				if(player-1>=0) {
					if(game[player-1]==1) {
						System.out.print("[3]격파 입력 : ");
						int punch = scan.nextInt();
						if(punch!=3) {
							continue;
						}
					}
					game[player] = 0;
					game[player-1] = 2;
					player -=1;
				}
			}else if(move==2) {
				if(player+1<9) {
					if(game[player+1]==1) {
						System.out.print("[3]격파 입력 : ");
						int punch = scan.nextInt();
						if(punch!=3) {
							continue;
						}
					}
					game[player] = 0;
					game[player+1] = 2;
					player+=1;
				}
			}
		}
	}
}
