public class QueueHomeWork{
    public static void main(){
       QueueAsCircularArray<Integer> Q =new QueueAsCircularArray<>(5);
       String id="202512558202512558";
       int [] arr=new int[id.length()/2];
       int j=0;
       for(int i=0;i< arr.length;i++){
           arr[i]=Integer.parseInt(id.substring(j,j+2));
           j+=2;
       }
        Q.enqueue(arr[0]);
       Q.enqueue(arr[1]); Q.dequeue( );  Q.enqueue(arr[2]);Q.enqueue(arr[3]); Q.dequeue( );  Q.enqueue(arr[4]); Q.getHead( );
                Q.dequeue( ); Q.enqueue(arr[5]); Q.enqueue(arr[6]); Q.enqueue(arr[7]); Q.dequeue();
       Q.enqueue(arr[8]);
    }
}
