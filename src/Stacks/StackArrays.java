
package Stacks;

public class StackArrays {
    int[] arr;
    int topOfStack;

    public StackArrays(int size){
        this.arr = new int[size];
        this.topOfStack = -1;
        System.out.println("The stack is created with a size of: " + size);
    }

    // Check if it is empty
    public boolean isEmpty(){
        if (topOfStack == -1){
            System.out.println("Stack is empty");
            return true;
        } else {
            System.out.println("Stack is not empty");
            return false;
        }
    }

    // Check if stack is full
    public boolean isFull(){
        if (topOfStack == arr.length -1){
            System.out.println("Stack is full");
            return true;
        } else {
            System.out.println("Stack is not full");
            return false;
        }
    }

    // Implement a push method
    public void push(int value){
        if (isFull()){
            System.out.println("The stack is full");
        } else {
            arr[++topOfStack] = value;
            System.out.println("The value " + value + " is successfully inserted");
        }
    }

    // Implement pop method
    public int pop(){
        if (isEmpty()){
            System.out.println("The stack is empty");
            return -1; // Indicating stack is empty
        } else {
            int poppedValue = arr[topOfStack--];
            System.out.println("Popped value: " + poppedValue);
            return poppedValue;
        }
    }

    // Implement peek method
    public int peek(){
        if (isEmpty()){
            System.out.println("The stack is empty");
            return -1; // Indicating stack is empty
        } else {
            System.out.println("Top of stack: " + arr[topOfStack]);
            return arr[topOfStack];
        }
    }

    // Implement delete stack method
    public void deleteStack(){
        arr = null;
        topOfStack = -1;
        System.out.println("Stack is deleted");
    }

    // Use the stack data structure to check whether a word is a palindrome or not
    public static boolean isPalindrome(String word){
        StackArrays stack = new StackArrays(word.length());
        for (char c : word.toCharArray()){
            stack.push(c);
        }
        StringBuilder reverseWord = new StringBuilder();
        while (!stack.isEmpty()){
            reverseWord.append((char)stack.pop());
        }
        return word.equals(reverseWord.toString());
    }

    public static void main(String[] args) {
        StackArrays stackArrays = new StackArrays(5);
        stackArrays.push(1);
        stackArrays.push(2);
        stackArrays.push(3);
        stackArrays.isEmpty();
        stackArrays.isFull();
        stackArrays.pop();
        stackArrays.peek();
        stackArrays.deleteStack();

        // Test palindrome
        String testWord = "racecar";
        System.out.println(testWord + " is a palindrome: " + isPalindrome(testWord));
    }
}