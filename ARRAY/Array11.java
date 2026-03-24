package ARRAY;
public class Array11{
public static int linearSearch(int[] a, int key){
    for (int i = 0; i<a.length; i++){
        if(a[i]==key){
            return i;
        }

    }
    return -1;

}

    public static void main(String[] args){
        int[] a = {2,46,6,8,92,12};
        int key = 9;
        int result = linearSearch(a, key);
        if (result==-1){
            System.out.println("Not Found");
        }else{
            System.out.println("Found");
        }

    }
}