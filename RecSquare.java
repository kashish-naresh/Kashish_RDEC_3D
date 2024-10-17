public class RecSquare{
    static void pattern(int i,int j){
        loop1(i,j);
    }
    static void loop1(int i,int j){

        if(i==0){
            return;
        }

        loop2(j);
        loop1(i-1,j);


    }
    static void loop2(int j){
        if(j==0){
            System.out.println();
            return;
        }
        System.out.print("*");
        loop2(j-1);
    }
    public static void main(String[] args) {
        pattern(5,5);

    }
}