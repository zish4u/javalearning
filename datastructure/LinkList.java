public class LinkList<E extends Comparable>{
  Node<E> head;

  //Empty List
  public boolean isEmpty(){
    return head==null;
  }

  //Adding node at first in LinkList.

  public void addFirst(E data){
    Node<E> temp=new Node<E> (data);
		if(isEmpty()){    //empty list
		    head=temp;
        return;
		}
		    temp.next=head;
		    head=temp;
  }

  //Adding node at middle of LinkList(at any random place ).
  public void addMiddle(E data, int atPosition){
    Node<E> newNode=new Node<E>(data);
    Node<E> temp=head;
    int count=1;
    while(count<atPosition-1){
      temp=temp.next;
      count++;
    }
    newNode.next=temp.next;
    temp.next=newNode;

  }

  //Adding node at last in LinkList.
  public void addLast(E data){
    Node<E> newNode=new Node<E>(data);
    if(isEmpty()){
      head=newNode;
      return;
    }
    Node<E> temp=head;
    while(temp.next!=null){
      temp=temp.next;
    }
    temp.next=newNode;
  }

//Count Length of link list.
  public int countLength(){
    Node<E>temp=head;
    int count=0;
    while(temp!=null){
      temp=temp.next;
      count++;
    }
    return count;
  }

//Print LinkList.
  public void printList(){
    Node<E> currentNode=head;
      while(currentNode!=null){
        System.out.print(currentNode.data+"-->");
        currentNode=currentNode.next;
      }
      System.out.println(currentNode);
  }
// Print reverse link list.
  public Node<E> reversePrint(E data){
      /*Node<E> currentNode=head;
      Node<E> prevNode=null;
      Node<E> next=null;
      if(isEmpty()){
        currentNode=head;
        return;
      }
      while(currentNode!=null){
        next=currentNode.next;
        currentNode.next=prevNode;
        prevNode=currentNode;
        currentNode=next;
        System.out.print(prevNode.data+" ");
      }
      System.out.println("Head "+prevNode.data);*/
      Node<E> nextNode=null, temp=null;
      while(temp!=null){
        nextNode=head.next;
        head.next=temp;
        temp=head;
        head=nextNode;
      }
      return temp;

  }

  //Remove first node of link list.
  public void removeFirst(){
    Node<E> temp=head;
    if(isEmpty())
      return;
    head=temp.next;
  }

  //Remove last node of link list.
  public void removeLast(){
    Node<E> last=head;
    Node<E> prevLast=null;
    if(isEmpty())
    return;
    while(last.next!=null){
    prevLast=last;
    last=last.next;
    }
    prevLast.next=null;
  }

//Remove a node of link list from anywhere.
  public void removeAnywhere(int atPosition){
      Node<E> temp=head;
      Node<E> delete=null;
      int count=0;
      while(count<atPosition-1){
        delete=temp;
        temp=temp.next;
        count++;
      }
        delete.next=temp.next;
        temp.next=delete;
        System.out.println("Node "+temp.data+" at position "+ atPosition+" is deleted. So final list are ");
      }


       //Adding a node in sorted linklist.
        public void addSorted(E data){
        Node<E> newNode=new Node<E>(data);
        Node temp=head;
        while(temp.data.compareTo(data)==-1){
          temp=temp.next;
        }
        newNode.next=temp.next;
        temp.next=newNode;
      }

    //Print all odd and even data in link list.

      public void oddEven(){
          Node<E> temp=head;
          Integer even=0;
          Integer odd=0;
          E tempdata=temp.data;
          while(temp!=null){
            if(((Integer) temp.data)%2==0){
             even=(Integer)temp.data;
              System.out.println("Even numbers in given list are- "+even);
            }
            else{
              odd=(Integer)temp.data;
              System.out.println("Odd numbers in given list are- "+odd);
            }
            temp=temp.next;

          }
        }

   // Swaping two consecutive.

   /*public void swapPairs(){
     Node<E> current=head;
     Node<E> nextNode=head.next;
     Node<E> previous=null;
     if(isEmpty()){
       return;
     }
     while(nextNode!=null&&nextNode!=current){
       previous.next=nextNode.next;
       current.next=nextNode.next;
       nextNode.next=previous;
       previous=current;
       nextNode.next=current;
     }
       current=current.next.next;
       System.out.print(current);

     }*/
}
