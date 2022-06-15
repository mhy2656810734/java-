/**
 * @author 26568
 * 单链表
 * @date 2022-05-15 10:09
 */
class Node {
    public int data;// 数据域
    public Node next;// 指向下一个对象的引用
    public Node(int data) {  // 构造方法初始化单链表
        this.data = data;
        this.next = null;
    }
}
public class MyLinkedList {
    public Node head; // 保存单链表的头节点的引用
    // 头插法
    public void addFirst(int data) {
        Node node = new Node(data);
        if (this.head==null) {
            this.head = node;
            return;
        }
        node.next = this.head;
        this.head = node;
    }
    // 打印单链表
    public void disPlay() {
        Node cur = this.head;
        while (cur != null) {
            System.out.print(cur.data+" ");
            cur = cur.next;
        }
        System.out.println();
    }
    // 尾插法
    public void addLast(int data) {
        Node node = new Node(data);
        if (this.head==null) {
            this.head = node;
            return;
    }
        Node cur = this.head;
        while (cur.next != null) {
            cur = cur.next;
        }
        cur.next = node;
    }
    // 查询数据
    public boolean contains(int data) {
        Node cur = this.head;
        while (cur != null) {
            if (cur.data == data) {
                return true;
            }
            cur = cur.next;
        }
        return false;
    }
    // 求单链表数据的个数
    public int size() {
        Node cur = this.head;
        int count = 0;
        while (cur != null) {
            count++;
            cur = cur.next;
        }
        return count;
    }
    //在index位置插入数据
    public void addIndex(int index, int data) {
        // 头插
        if (index == 0) {
            this.addFirst(data);
            return;
        }
        // 尾插
        if (index == this.size()) {
            this.addLast(data);
            return;
        }
        // 先找到index位置的前一个节点的地址
        Node cur = searchIndex(index);
        Node node = new Node(data);
        node.next = cur.next;
        cur.next = node;
    }
    // 查找index前一个节点的地址
    private Node searchIndex(int index) {
        // 检查index的合法性
        if ((index < 0) || (index > this.size()) ) {
            throw new RuntimeException("index 位置不合法");
        }
        Node cur = this.head;
        while (index-1 != 0) {
            cur = cur.next;
            index--;
        }
        return cur;
    }
    // 找要删除数据节点的前驱
    private Node searchPrev(int key) {
        Node prev = this.head;
        if (this.head == null) {
            throw new RuntimeException("单链表为空");
        }
        if (prev.data == key) {
            this.head = prev.next;
            return prev;
        }
        while ( prev.next != null) {
            if ( prev.next.data == key) {
                return prev;
            } else {
                prev =  prev.next;
            }
        }
        return null;
    }
    // 删除第一次出现的关键字key
    public void remove(int key) {
        Node prev = searchPrev(key);
        if ( prev == null) {
            System.out.println("该数据不存在");
        } else {
            Node del = prev.next;
            prev.next = del.next;
        }
    }
    //删除所有关键字key
    public void removeAllKey(int key) {
        if (this.head == null) {
            throw new RuntimeException("单链表为空");
        }
        Node prev = this.head;
        Node cur = prev.next;
        while (cur != null) {
            if (cur.data == key) {
                prev.next = cur.next;
                cur = cur.next;
            } else {
                prev = cur;
                cur = cur.next;
            }
        }
        // 头节点
        if (this.head.data == key) {
            this.head = this.head.next;
        }
    }

    /**
     * 释放内存
     */
    public void clear() {
       this.head = null;
    }
}
