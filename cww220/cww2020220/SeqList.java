package cww2020220;

public class SeqList {
    private int [] datas = new int [100];
    private  int size=0;   //size 有效数字长度
    public int getSize() {
        return size;
    }

    public void display() {
       String result =  "[";
       for(int i =0;i<size;i++){
           result+= datas[i];
           if(i<size-1){
               result+=',';
           }
       }
       result +="]";
        System.out.println(result);
    }
    public void add(int pos, int data) {
         if(pos <0 || pos > size){
             return;
         }
         if(size>=datas.length){
             int newdatas [] = new int [3 *datas.length];
             for(int i =0;i<datas.length;i++){
                 newdatas[i] = datas[i];
             }
             datas=newdatas;
         }
         if(pos == size){
             this.datas[pos] =data;
             size++;
             return;
         }
         for(int i =size-1;i>=pos;i--){
             datas[i+1]=datas[i];
         }
         datas[pos] = data;
         size++;
    }
    public boolean contains(int toFind){
        for(int i =0;i<size;i++){
            if(datas[i] ==toFind){
                return  true;
            }
        }
        return  false;
    }
    public  int search(int toFind){
        return  -1;
    }
    public int getPos(int pos){
        return  -1;
    }
    public void setPos(int pos,int vaule){

    }
    public  void remove(int toRemove){

    }
    public int size(){
        return  0;
    }
    public void clear(){

    }
}
