package org.apache.mina.util.byteaccess;

import java.util.NoSuchElementException;

class ByteArrayList {
    private int firstByte;
    private final Node header;
    private int lastByte;

    public class Node {
        private ByteArray ba;
        private Node next;
        private Node previous;
        private boolean removed;

        private Node() {
            this.previous = this;
            this.next = this;
        }

        private Node(ByteArray byteArray) {
            if (byteArray == null) {
                throw new IllegalArgumentException("ByteArray must not be null.");
            }
            this.ba = byteArray;
        }

        public Node getPreviousNode() {
            if (hasPreviousNode()) {
                return this.previous;
            }
            throw new NoSuchElementException();
        }

        public Node getNextNode() {
            if (hasNextNode()) {
                return this.next;
            }
            throw new NoSuchElementException();
        }

        public boolean hasPreviousNode() {
            return this.previous != ByteArrayList.this.header;
        }

        public boolean hasNextNode() {
            return this.next != ByteArrayList.this.header;
        }

        public ByteArray getByteArray() {
            return this.ba;
        }

        public boolean isRemoved() {
            return this.removed;
        }
    }

    protected ByteArrayList() {
        this.header = new Node();
    }

    public int lastByte() {
        return this.lastByte;
    }

    public int firstByte() {
        return this.firstByte;
    }

    public boolean isEmpty() {
        return this.header.next == this.header;
    }

    public Node getFirst() {
        return this.header.getNextNode();
    }

    public Node getLast() {
        return this.header.getPreviousNode();
    }

    public void addFirst(ByteArray byteArray) {
        addNode(new Node(byteArray, null), this.header.next);
        this.firstByte -= byteArray.last();
    }

    public void addLast(ByteArray byteArray) {
        addNode(new Node(byteArray, null), this.header);
        this.lastByte += byteArray.last();
    }

    public Node removeFirst() {
        Node nextNode = this.header.getNextNode();
        this.firstByte += nextNode.ba.last();
        return removeNode(nextNode);
    }

    public Node removeLast() {
        Node previousNode = this.header.getPreviousNode();
        this.lastByte -= previousNode.ba.last();
        return removeNode(previousNode);
    }

    protected void addNode(Node node, Node node2) {
        node.next = node2;
        node.previous = node2.previous;
        node2.previous.next = node;
        node2.previous = node;
    }

    protected Node removeNode(Node node) {
        node.previous.next = node.next;
        node.next.previous = node.previous;
        node.removed = true;
        return node;
    }
}
