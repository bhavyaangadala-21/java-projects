package LinkedListsPractice;
import java.util.Scanner;


// Class to create and initialize a node
class Node{
  int data;
  Node link;
  Node(int data){
    this.data = data;
    this.link = null;
  }
}


// Class to create a single lined list
class SLL{
  private Node head = null;
  
  // BASIC SLL OPERATIONS 
  
  // create function
  public void create(Scanner sc) {
      Node temp = null;
      int ch;
      do {
          System.out.print("Enter data part of the node: ");
          int data = sc.nextInt();
          Node t = new Node(data);

          if (head == null) { // Check if the list is currently empty
              head = t;       // Setting t as the first node
              temp = head; 
          } else {
              temp.link = t;  // New t location is stored in the link part of previous node (temp = previous node, t = new node)
              temp = t;       // Move temp to the new last node
          }
          System.out.print("Do you want to create another node (1 for yes, 0 for no): ");
          ch = sc.nextInt();
      } while (ch != 0);
  }
  
  // display function
  public void display() {
    Node temp; // temp is of data type node
    if(head == null) {
      System.out.println("Linked List is Empty");
    } else {
      temp = head;
      while(temp != null) { // if temp.data != null then last element would be skipped 
        System.out.print(temp.data + " ");
        temp = temp.link;
      }
    }
    System.out.println();
  }
  
  //Insert node in the beginning
  public void insertBeginning(Scanner sc) {
    System.out.print("Enter data part of node : ");
    int data = sc.nextInt();
    Node t = new Node(data);
    t.link = head;
    head = t;
    System.out.print("New Linked List : ");
    display();
  }
  //Insert node at the end
  public void insertEnd(Scanner sc) {
    System.out.print("Enter data part of the node : ");
    int data = sc.nextInt();
    Node t = new Node(data);
    Node temp = head;
    while(temp.link != null) {
      temp = temp.link;
    }
    temp.link = t;
    System.out.print("New Linked List : ");
    display();
  }
  //insert  node at a given position
  public void insertAtPos(Scanner sc) {
    System.out.print("Enter data part of the node : ");
    int data = sc.nextInt();
    System.out.print("Enter position of the node : ");
    int pos = sc.nextInt();
    Node t = new Node(data);
    Node temp;
    if(pos == 1) {
      t.link = head;
      head = t;
    } else {
      temp = head;
      for(int i=1; (i<pos-1)&&(temp!=null); i++) {
        temp = temp.link;
      }
      if(temp != null) {
        t.link = temp.link; // order is important, if you do temp.link = t first, you'd lose the current temp address - memory leak
        temp.link = t;
        System.out.print("New Linked List : ");
        display();
      } else {
        System.out.println("Invalid Position");
      }
    }
  }
  // Insert to the right (after) a given data value
  public void insertAfterData(Scanner sc) {
      if (head == null) {
          System.out.println("Linked list is empty");
          return;
      }
      System.out.print("Enter the data after which you want to insert: ");
      int key = sc.nextInt();
      
      Node temp = head;
      while (temp != null && temp.data != key) {
          temp = temp.link;
      }
      if (temp != null) {
          System.out.print("Enter data for the new node: ");
          int data = sc.nextInt();
          Node t = new Node(data);     
          t.link = temp.link;
          temp.link = t;       
          System.out.print("New Linked List : ");
          display();
      } else {
          System.out.println("Data " + key + " not found in the list.");
      }
  }
  
  //Delete first node
  public void deleteFirstNode() {
    if(head == null) {
      System.out.println("Linked list is empty");
    } else {
      head = head.link;
      System.out.print("New Linked List : ");
      display();
    }
  }
  //Delete last node
  public void deleteLastNode() {
    Node temp;
    if(head == null) {

2510030039 - Keerthana Sathyavada, [13-02-2026 21:40]
System.out.println("Linked List is empty");
    } else if(head.link == null) {
      System.out.print("New Linked List : ");
      head = null;
      display();
    } else {
      temp = head;
      while((temp.link).link != null) {
        temp = temp.link;
      }
      temp.link = null;
      System.out.print("New Linked List : ");
      display();
    }
  }
  //Delete node with date given by the user
  public void deleteNode(Scanner sc) {
    if(head == null) {
      System.out.println("Linked list is empty");
    } else {
      Node temp, previous;
      System.out.print("Enter data part of the node to delete : ");
      int key = sc.nextInt();
      if(head.data == key) {
        head = head.link;
      } else {
        temp = head.link;
        previous = head;
        while(temp != null) {
          if(temp.data == key) {
            break;
          } else {
            temp = temp.link;
            previous = previous.link;
          }
        }
        if(temp != null) {
          previous.link = temp.link;
          System.out.print("New Linked List : ");
          display();
        } else {
          System.out.println("Invalid data");
        }
      }
    }
  }
  // Delete node at a given position
  public void deleteAtPos(Scanner sc) {
      if (head == null) {
          System.out.println("Linked list is empty");
          return;
      }
      System.out.print("Enter position of the node to delete: ");
      int pos = sc.nextInt();
      if (pos == 1) {
          head = head.link;
          System.out.print("New Linked List : ");
          display();
      } else {
          Node temp = head;
          Node previous = null;
          for (int i = 1; (i < pos) && (temp != null); i++) {
              previous = temp;
              temp = temp.link;
          }
          if (temp != null) {
              previous.link = temp.link;
              System.out.print("New Linked List : ");
              display();
          } else {
              System.out.println("Invalid Position");
          }
      }
  }
  
  //search method
  public void search(Scanner sc) {
    if(head == null) {
      System.out.println("Linked List is Empty");
    } else {
      System.out.print("Enter data to search for : ");
      int key = sc.nextInt();
      Node temp = head;
      while(temp != null) {
        if(key == temp.data) {
          break;
        }
        temp = temp.link;
      }
      if(temp != null) {
        System.out.println("Data found");
      } else {
        System.out.println("Data NOT found");
      }
    }
  }
  
  //count method
  public void count() {
    Node temp = head;
    if(head == null) {
      System.out.println("Linked List is empty");
    }
    int count = 0;
    while(temp != null) {
      count++;
      temp = temp.link;
    }
    System.out.println("Count = " + count);
  }
  
  //sum method
  public void sum() {
    Node temp;
    int sum = 0;
    if(head == null) {
      System.out.println("Linked List is Empty");
    } else {
      temp = head;
      while(temp != null) {
        sum += temp.data;
        temp = temp.link;
      }
      System.out.println("Sum = " + sum);
    }
  }
  
  //average method
  public void average() {
    Node temp;
    int sum = 0, count = 0;
    if(head == null) {
      System.out.println("Linked List is Empty");
    } else {
      temp = head;
      while(temp != null) {
        count++;
        sum += temp.data;
        temp = temp.link;
      }
      float avg = sum / count;
      System.out.println("Average = " + avg);
    }
  }
  
  //minimum method
  public void minimum() {
    Node temp;
    if(head == null) {
      System.out.println("Linked List is Empty");
    } else {
      temp = head;
      int min = head.data;
      while(temp != null) {
        if(temp.data < min) {
          min = temp.data;
        }
        temp = temp.link;
      }
      System.out.println("Minimum Value = " + min);
    }
  }
  
  //maximum method
  public void maximum() {
    Node temp;
    if(head == null) {
      System.out.println("Linked List is Empty");
    } else {
    	temp = head;
        int max = temp.data;
        while(temp != null) {
          if(temp.data > max) {
            max = temp.data;
          }
          temp = temp.link;
        }
        System.out.println("Maximum value = " + max);
      }
  }
}
