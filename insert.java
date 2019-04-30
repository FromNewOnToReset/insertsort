public class insert {
    public static void insertsort(int []array,int pos,int value){
        int i=pos-1;
        while (i>=0&&array[i]>value){
            array[i+1]=array[i];
            i-=1;
            array[i+1]=value;
        }
    }



    public static void main(String[] args) {
        int []a=new int[]{55,33,13,43,43,3,3234,33,2};
        for (int i=1;i<a.length;i++){
            insertsort(a,i ,a[i] );
        }
        for (int i:a
             ) {
            System.out.print(i+"  ");

        }
    }
}
