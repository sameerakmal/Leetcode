class Robot {

    public int[][] dir;
    public int d, x, y, h, w, p, st = 0;
    public Robot(int width, int height) {
        dir = new int[][]{{0,1}, {1,0}, {0,-1}, {-1,0}};
        d = 1;
        x = 0;
        y = 0;
        h = height;
        w = width;
        p = 2 * (w + h) - 4;
    }
    public void step(int num) {
        st = 1;
        num = num % p;
       for(int i = 0; i < num; i++){

            if((d == 0 && y == h - 1) || (d == 1 && x == w - 1) || (d == 2 && y == 0) || (d == 3 && x == 0)){
                d = (d + 3) % 4;
            }
            x = x + dir[d][0];
            y = y + dir[d][1];
       }
       return;
    }
    
    public int[] getPos() {
        return new int[]{x, y};
    }
    
    public String getDir() {
        if(st == 1 && (x == 0 && y == 0)) return "South";
        else if(d == 0) return "North";
        else if(d == 1) return "East";
        else if(d == 2) return "South";
        else return "West";
    }
}

/**
 * Your Robot object will be instantiated and called as such:
 * Robot obj = new Robot(width, height);
 * obj.step(num);
 * int[] param_2 = obj.getPos();
 * String param_3 = obj.getDir();
 */