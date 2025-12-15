package Arrays;

public class arrayPassing {
    public static void update(int mark[]){
        for(int i=0; i<mark.length; i++){
            mark[i] = mark[i] +1;
        }
    }
    public static void main(String[] args) {
        int marks[] = {92,93,96,97};
        update(marks);
    
     for(int i=0; i<marks.length; i++){
            System.out.print(marks[i] + " ");
        }
        System.out.println();
}
}
