package br.com.raulen.datastructure;

import java.util.Arrays;

/*
 * Pilha - Stack of data
 *
 * 
 * Pilha não tem tamanho definido
 * LIFO Ordering - Last In, First Out
 * 
 * Possui os seguintes métodos:
 * 
 * pop() - REMOVE the top item from the stack
 * isEmpty - VERIFY if stack is Empty
 * push(E) - Add an item to the top of the Stack 
 * peek() - Return the item from the top of the Stack (Dont Remove)
 * size() - Return the actual Size of Array
 * 
 * 
 * Complexidade - Notação Big(O)
 * 
 * Insert
 * Remove
 * Search
 * 
 * 
 * Average
 * 
 * Access 0(n)
 * Search 0(n)
 * Insert 0(1)
 * Deletion 0(1)
 * 
 * 
 * 
 * Common Example:
 * 
 * Stack of plates
 * 
 * 
 * 
 * INCREASE SPACE IN THE DYNAMIC ARRAY
 * 
 *
 * 
 * 
 * 
 * 
 * 
 * */

//static variables
//
// Memory for static variable is created only one in the program at the time of loading of class
//
//

public class Stack {

    private static final int MAX_SIZE_STACK = Integer.MAX_VALUE;
    private static final int DEFAULT_CAPACITY = 10;

    private Node top;
    private int topPointer;

    private Node[] elementData;

    private static class Node {

        private int data;

        private Node(int data) {
            this.data = data;
        }

    }

    public Stack() {
        elementData = new Node[DEFAULT_CAPACITY];
        topPointer = 0;
        top = null;
    }

    //Return the top item
    public int peek() {
        return top.data;

    }

    //Remove 1 item of the top
    public void pop() {
        if (topPointer == 0) {
            throw new RuntimeException("Its not possible get a item from the stack, because, dont have any items in Stack");
        }

        elementData[--topPointer] = null;
        top = elementData[topPointer];
    }

    //Insert a new item on the top of the stack
    public void push(int data) {

        Node node = new Node(data);

        if (topPointer >= elementData.length) {
            this.elementData = copy();
        }

        elementData[topPointer] = node;
        top = node;
        topPointer++;
    }

    //Returns the size of Stack
    public int size() {
        return topPointer;
    }

    //Returns if the Stack is Empty
    public boolean isEmpty() {
        return topPointer == 0 ? true : false;
    }

    private Node[] copy() {
        Node[] tempElementData = Arrays.copyOf(elementData, newCapacity());
        return tempElementData;
    }

    /**
     * 
     * Comentary sample
     * 
     * Copies the specified array, truncating or padding with nulls (if necessary)
     * so the copy has the specified length.  For all indices that are
     * valid in both the original array and the copy, the two arrays will
     * contain identical values.  For any indices that are valid in the
     * copy but not the original, the copy will contain {@code null}.
     * Such indices will exist if and only if the specified length
     * is greater than that of the original array.
     * The resulting array is of the class {@code newType}.
     *
     * @param <U> the class of the objects in the original array
     * @param <T> the class of the objects in the returned array
     * @param original the array to be copied
     * @param newLength the length of the copy to be returned
     * @param newType the class of the copy to be returned
     * @return a copy of the original array, truncated or padded with nulls
     *     to obtain the specified length
     * @throws NegativeArraySizeException if {@code newLength} is negative
     * @throws NullPointerException if {@code original} is null
     * @throws ArrayStoreException if an element copied from
     *     {@code original} is not of a runtime type that can be stored in
     *     an array of class {@code newType}
     * @since 1.6
     */
    private int newCapacity() {
        int capacity = elementData.length + (elementData.length / 2);

        if (capacity > MAX_SIZE_STACK)
            throw new RuntimeException("The stack have more than elements of allowed");

        return capacity;
    }

    public static void main(String[] args) {

        Stack stack = new Stack();

        System.out.println(stack.isEmpty());

        System.out.println(stack.isEmpty());

        System.out.println(stack.size());

        System.out.println(stack.elementData.length);

    }

}
