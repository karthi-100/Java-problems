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

public class LinkedListDemo {
    public static void main(String[] args) {
        List l = new List();
        l.insert(1);
        l.insert(2);
        l.insert(3);
        l.insert(4);
        l.insert(5);
        l.display();
        l.deleteIndex(2);
        l.display();
    }
}

