public class array3 {
    public static void main(String[] args) {
        int arr[]={2,6,7,9,10,13};
        int length=arr.length;
        int temp;
        int b;
        for(int i=0;i<length;i=i+2){
            temp=arr[i];
            arr[i]=arr[i+1];
            arr[i+1]=temp;
        }
        for(int i=0;i<length;i++)//web create
        System.out.println(arr[i]);

}
}
