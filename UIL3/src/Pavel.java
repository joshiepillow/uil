import java.io.File;
import java.util.LinkedList;
import java.util.Scanner;
import java.util.*;

public class Pavel {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(new File("pavel.dat"));
        int t = sc.nextInt();
        sc.nextLine();

        while(t -- > 0){

            int n = sc.nextInt();
            int m = sc.nextInt();
            int s = sc.nextInt();
            sc.nextLine();
            char[][] mat = new char[n][m];

            int si = -1, sj = -1;
            int ei = -1, ej = -1;

            for(int i = 0; i < n; i ++){
                char[] row = sc.nextLine().toCharArray();
                for(int j = 0; j < m; j ++){
                    mat[i][j] = row[j];

                    if(mat[i][j] == 'S'){
                        si = i;
                        sj = j;
                        mat[i][j] = '.';
                    }
                    else if(mat[i][j] == 'E') {
                        ei = i;
                        ej = j;
                        mat[i][j] = '.';
                    }
                    else if(mat[i][j] == '4'){
                        mat[i][j] = '0';
                    }
                }
            }

            Queue<State> q = new LinkedList<>();
            boolean[][][] visited = new boolean[n][m][4];

            q.add(new State(si, sj, 1, 0));
            visited[si][sj][1] = true;

            int[] dx = new int[]{0, 0, -1, 1};
            int[] dy = new int[]{1, -1, 0, 0};
            int mindist = Integer.MAX_VALUE;

            while(!q.isEmpty()){
                State curr = q.poll();
                if(curr.r == ei && curr.c == ej){
                    mindist = curr.dist;
                    break;
                }
                int next = (curr.x + 1) % 4;

                for(int z = 0; z < 4; z ++){
                    int newi = curr.r + dx[z];
                    int newj = curr.c + dy[z];

                    if(newi < 0 || newi >= n || newj < 0 || newj >= m || visited[newi][newj][next]) continue;
                    else if(mat[newi][newj] == '#') continue;
                    else if(Character.isDigit(mat[newi][newj]) && next != (mat[newi][newj] - '0')) continue;
                    else{
                        visited[newi][newj][next] = true;
                        q.add(new State(newi, newj, next, curr.dist + 1));
                    }
                }
            }


            if(mindist == Integer.MAX_VALUE){
                System.out.println("Aw, rats!");
                System.out.print("I'll see you in the Gulag Pavel.");
            }
            else{
                System.out.println(mindist + " steps.");
                if(mindist <= s){
                    System.out.print("I have had enough of these snakes.");

                }
                else{
                    System.out.print("I'll see you in the Gulag Pavel.");
                }
            }

            if(t != 0) System.out.println();
        }

        sc.close();
    }

    static class State{
        int r, c, x;
        int dist;
        public State(int r, int c, int x, int dist){
            this.r = r; this.c = c; this.x = x; this.dist = dist;
        }
    }
}