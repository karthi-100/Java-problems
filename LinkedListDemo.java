class LinkedList{
    int data;
    LinkedList next=null;
    LinkedList (int data){
        this.data =  data;
    }
}
class List{
    LinkedList  head = null;
    LinkedList cur =null;
    void insert(int data){
        LinkedList newNode = new LinkedList(data);
        if(head==null){
            head = newNode;
        }
        else{
            cur = head;
            while (cur.next!=null) {
                cur = cur.next;
            }
            cur.next = newNode;
        }

    }

    void display(){
        cur = head;
        while (cur!=null) {
            System.out.println(cur.data);
            cur = cur.next;
        }
    }

    void deleteIndex(int index){
        cur = head;
        for(int i=0;i<index-1;i++){
            cur = cur.next;
        }
        System.out.println("data to delete"+cur.data);
        cur.next = cur.next.next;
    }

}

class MergeTwoSortedList{
    LinkedList cur ;
    LinkedList cur1;
    LinkedList cur2;
    LinkedList dummy = new LinkedList(-1);
    LinkedList result =  dummy;
    void mergeList(LinkedList list1,LinkedList list2){
        
        cur1 = list1;
        cur2 = list2;


        while(cur1!=null && cur2!=null){
            if(cur1.data<cur2.data){
                result.next = cur1;
                cur1 = cur1.next;
            }
            else{
                result.next = cur2;
                cur2 = cur2.next;
            }
            result = result.next;
        }
        if(cur1!=null) result.next = cur1;
        if(cur2!=null) result.next = cur2;
       

    }
}

public class LinkedListDemo {
    public static void main(String[] args) {
        LinkedList l1 = new LinkedList(1);
        l1.next = new LinkedList(2);
        l1.next.next = new LinkedList(5);

        LinkedList l2 = new LinkedList(1);
        l2.next = new LinkedList(3);
        l2.next.next = new LinkedList(4);
        MergeTwoSortedList merge = new MergeTwoSortedList();
        merge.mergeList(l1,l2);
    }
}

