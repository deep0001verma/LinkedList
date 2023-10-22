import java.util.LinkedList;

public class LLtoQueueADAPTER {
    public static void main(String[] args) {}
        public static class QueueAdapter{
            LinkedList<Integer> list;
            public QueueAdapter(){
                list=new LinkedList<>();
            }
            int size(){
                return list.size();
            }
            void add(int val){
                list.addLast(val);
            }
            int remove(){
                if (size()==0){
                    System.out.println("Stack Underflow");
                    return -1; }
                else  return list.removeFirst();
            }
            int peek(){
                if (size()==0){
                    System.out.println("Stack Underflow");
                    return -1;
                }
                else  return list.getFirst();}

        }
}
