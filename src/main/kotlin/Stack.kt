package org.example

class Stack<T> {
    internal var head: StackNode<T>?=null
    internal class StackNode<T>(val data: T,
                       var next: StackNode<T>?)
    fun pop(): T? {
        val returnValue = head?.data
        head = head?.next
        return returnValue
    }

    fun push(data: T) {
        head = StackNode<T>(data, head)
    }

    fun isEmpty(): Boolean {
        return head == null
    }
}

