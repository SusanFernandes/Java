class Pattern{
    public static void main(String [] args){

        FirstStar();
    }

    public static void FirstStar(){
        int rows = 0;
        while(rows<5){
            System.out.print("*");
            int cols = 0;
            while(cols<rows){
                System.out.print(" *");
                cols++;
            }
            System.out.println();
            rows++;
        }
    }
}