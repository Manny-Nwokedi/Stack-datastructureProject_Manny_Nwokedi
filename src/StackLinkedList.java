
package Stacks;

class Node {
    int value;
    Node next;

    Node(int value) {
        this.value = value;
        this.next = null;
    }
}

public class StackLinkedList {
    Node top;

    public StackLinkedList() {
        this.top = null;
        System.out.println("The stack is created using LinkedList");
    }

    // Check if it is empty
    public boolean isEmpty() {
        if (top == null) {
            System.out.println("Stack is empty");
            return true;
        } else {
            System.out.println("Stack is not empty");
            return false;
        }
    }

    // Push method
    public void push(int value) {
        Node newNode = new Node(value);
        newNode.next = top;
        top = newNode;
        System.out.println("The value " + value + " is successfully inserted");
    }

    // Pop method
    public int pop() {
        if (isEmpty()) {
            System.out.println("The stack is empty");
            return -1; // Indicating stack is empty
        } else {
            int poppedValue = top.value;
            top = top.next;
            System.out.println("Popped value: " + poppedValue);
            return poppedValue;
        }
    }

    // Peek method
    public int peek() {
        if (isEmpty()) {
            System.out.println("The stack is empty");
            return -1; // Indicating stack is empty
        } else {
            System.out.println("Top of stack: " + top.value);
            return top.value;
        }
    }

    // Delete stack method
    public void deleteStack() {
        top = null;
        System.out.println("Stack is deleted");
    }

    // Use the stack data structure to check whether a word is a palindrome or not
    public static boolean isPalindrome(String word) {
        StackLinkedList stack = new StackLinkedList();
        for (char c : word.toCharArray()) {
            stack.push(c);
        }
        StringBuilder reverseWord = new StringBuilder();
        while (!stack.isEmpty()) {
            reverseWord.append((char)stack.pop());
        }
        return word.equals(reverseWord.toString());
    }

    public static void main(String[] args) {
        StackLinkedList stackLinkedList = new StackLinkedList();
        stackLinkedList.push(1);
        stackLinkedList.push(2);
        stackLinkedList.push(3);
        stackLinkedList.isEmpty();
        stackLinkedList.pop();
        stackLinkedList.peek();
        stackLinkedList.deleteStack();

        // Test palindrome
        String testWord = "level";
        System.out.println(testWord + " is a palindrome: " + isPalindrome(testWord));
    }
}
