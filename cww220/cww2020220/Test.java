package cww2020220;
public class Test {
    private static void testAdd(){
        SeqList seqList =  new SeqList();
//            seqList.display();
//         int pos = 0;
//         if(pos <0 || pos > seqList.size()){
        seqList.add(2,100);
        seqList.add(2,120);
        seqList.display();
    }
    private  static  void testContains(){
        SeqList seqList =new SeqList();
//            seqList.display();
//         int pos = 0;
//         if(pos <0 || pos > seqList.size()){
        seqList.add(2,1);
        seqList.add(2,12);
        System.out.println(seqList.contains(100));
    }

    public static void main(String[] args) {
          testContains();
         }
    }

