class Solution {
    public int robotSim(int[] commands, int[][] obstacles) {
        int[][] dirs = {
            {0, 1}, {1, 0}, {0, -1}, {-1, 0}
        };

        int x = 0, y = 0;
        int maxDist = 0;
        int d = 0;

        HashSet<String> hs = new HashSet<>();
        for(int[] obs : obstacles){
            hs.add(obs[0] + ", " + obs[1]);
        }

        for(int cmd : commands){
            if (cmd == -1){
                d = (d + 1) % 4;
            }
            else if(cmd == -2){
                d = (d + 3) % 4;
            }
            else{
                for(int i = 0; i < cmd; i++){
                    int newX = x + dirs[d][0];
                    int newY = y + dirs[d][1];

                    if(hs.contains(newX + ", " + newY)){
                        break;
                    }

                    x = newX;
                    y = newY;

                    maxDist = Math.max(maxDist, (x*x + y*y));
                }
            }
        }
        return maxDist;
    }
}