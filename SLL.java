//ADVANCE SLL OPERATIONS
  
  // reverse method
  public void reverse() {
      if (head == null) return;
      Node current = head;
      Node next = head.link;
      Node previous = null;
      while (current != null) {
          current.link = previous;
          previous = current;
          current = next;
          if (next != null) {
              next = next.link;
          }
      }
      head = previous; 
      display();
  }
  
  // sort method - bubble sort
  public void bubbleSort() {
    // Node last = null;
    boolean flag;
    do {
      Node temp = head;
      flag = false;
      while(temp.link != null) { 
      // while(temp.link != last){
        if(temp.data > temp.link.data) {
          int key = temp.data;
          temp.data = temp.link.data;
          temp.link.data = key;
          flag = true;
        } 
        temp = temp.link;
      }
      // last = temp.link;
    } while(flag);
    display();
  }
  
  public void splitEvenOdd(Scanner sc) {
      Node evenHead = null;
      Node oddHead = null;
      Node evenTemp = null;
      Node oddTemp = null;
      Node temp = head;
      if(head == null) {
          System.out.println("Linked list is empty");
      } else {
        while(temp != null) {
            if(temp.data % 2 == 0) {
                if (evenHead == null) { 
                    evenHead = temp;
                    evenTemp = evenHead; 
                } else {
                    evenTemp.link = temp;
                    evenTemp = temp;
                }
            } else {
                if (oddHead == null) { 
                    oddHead = temp;
                    oddTemp = oddHead; 
                } else {
                    oddTemp.link = temp;
                    oddTemp = temp;
                }
            }
            temp = temp.link;
        }
        if (evenTemp != null) {
            evenTemp.link = null;
        }
        if (oddTemp != null) {
            oddTemp.link = null;
        }
        System.out.println("Even List");
        evenTemp = evenHead;
        while(evenTemp != null) {
            System.out.print(evenTemp.data + " ");
            evenTemp = evenTemp.link;
        }
        oddTemp = oddHead;
        System.out.println("\nOdd List");
        while(oddTemp != null) {
            System.out.print(oddTemp.data + " ");
            oddTemp = oddTemp.link;
        }
System.out.println("\n1. Concat\n2. Merge");
        System.out.print("Enter choice : ");
        int ch = sc.nextInt();
        switch(ch) {
            // concat 
            case 1:
              evenTemp = evenHead;
              while(evenTemp.link != null) {
                evenTemp = evenTemp.link;
              }
              evenTemp.link = oddHead; 
                  head = evenHead;
                  System.out.println("\nConcatenated List:");
                  temp = head; 
                  while (temp != null) {
                      System.out.print(temp.data + " ");
                      temp = temp.link;
                  }
                  break;
            case 2:
                if (evenHead.data <= oddHead.data) {
                    head = evenHead;
                    evenHead = evenHead.link;
                } else {
                    head = oddHead;
                    oddHead = oddHead.link;
                }
                temp = head;
                while (evenHead != null && oddHead != null) {
                    if (evenHead.data <= oddHead.data) {
                        temp.link = evenHead;
                        evenHead = evenHead.link;
                    } else {
                        temp.link = oddHead;
                        oddHead = oddHead.link;
                    }
                    temp = temp.link; 
                }
                if (evenHead != null) {
                    temp.link = evenHead;
                } else {
                    temp.link = oddHead;
                }
                System.out.println("\nMerged List:");
                temp = head;
                while (temp != null) {
                    System.out.print(temp.data + " ");
                    temp = temp.link;
                }
                break;
        }
    }
  }
  
}


public class LinkedListMenu {
  public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      SLL l1 = new SLL();
      l1.create(sc);
      int choice = 0;
      while(choice != 13) {
          System.out.println("\nMenu\nBasic Operations");
          System.out.println("\n1. Display\n2. Insert\n3. Count\n4. Sum\n5. Average\n6. Maximum\n7. Minimum\n8. Delete\n9. Search");
          System.out.println("\nAdvance Operations\n10. Reverse\n11. Sort\n12. Split\n13. Exit");
          System.out.print("Enter your choice: ");
          choice = sc.nextInt(); 
          System.out.println();
          switch(choice) {
              case 1:
                  l1.display();
                  break;
              case 2:
                System.out.println("1. Insert in the beginning\n2. Insert at the end\n3. Insert at a position");
                System.out.print("\nEnter choice : ");
                int ic = sc.nextInt();
                switch(ic) {
                case 1:
                  l1.insertBeginning(sc);
                  break;
                case 2:
                  l1.insertEnd(sc);
                  break;
                case 3:
                  l1.insertAtPos(sc);
                  break;
                case 4: 
                  l1.insertAfterData(sc); 
                  break;
                default:
                  System.out.println("Invalid Choice");
                }
                break;
              case 3:
                l1.count();
                break;
              case 4:
                l1.sum();
                break;
              case 5:
                l1.average();
                break;
              case 6:
                l1.maximum();
                break;
              case 7:
                l1.minimum();
                break;
              case 8:
                System.out.println("1. Delete first node\n2. Delete Last node\n3. Delete node by giving data");
                System.out.print("Enter choice : ");
                int dc = sc.nextInt();
                switch(dc) {
                  case 1:
                    l1.deleteFirstNode();
                    break;
                  case 2:
                    l1.deleteLastNode();

2510030039 - Keerthana Sathyavada, [13-02-2026 21:40]
break;
                  case 3:
                    l1.deleteNode(sc);
                    break;
                  case 4: 
                    l1.deleteAtPos(sc); 
                    break;
                  default : 
                    System.out.println("Invalid choice");
                }
                break;
              case 9:
                  l1.search(sc);
                  break;
              case 10:
                  l1.reverse();
                  break;
              case 11:
                  l1.bubbleSort();
                  break;
              case 12:
                  l1.splitEvenOdd(sc);
                  break;
              case 13:
                  System.out.println("Bye Bye");
                  break;
              default:
                  System.out.println("Invalid Choice");
          }
      }
      sc.close();
  }
}
