package editor.cn;

import java.util.HashMap;
import java.util.Map;

public class LruCache146 {

    //leetcode submit region begin(Prohibit modification and deletion)
    class LRUCache {
        class Node {
            int key;
            int value;
            Node pre;
            Node next;

            Node() {
            }

            ;

            Node(int key, int value) {
                this.key = key;
                this.value = value;
            }
        }

        private final int capacity;
        private Map<Integer, Node> map;
        private final Node head;
        private final Node end;

        public LRUCache(int capacity) {
            this.capacity = capacity;
            map = new HashMap<>();
            head = new Node();
            end = new Node();
            head.next = end;
            end.pre = head;
        }

        public int get(int key) {
            Node node;
            if (map.containsKey(key)) {
                node = map.get(key);
                node.pre.next = node.next;
                node.next.pre = node.pre;
            } else return -1;
            add2end(node);
            return node.value;
        }

        public void put(int key, int value) {
            Node node;
            if (map.containsKey(key)) {
                node = map.get(key);
                node.value = value;
                node.pre.next = node.next;
                node.next.pre = node.pre;
            } else {
                node = new Node(key, value);
                map.put(key, node);
            }
            add2end(node);
            // 超出容量，移除元素
            if (map.size() > capacity) {
                Node removeNode = head.next;
                head.next = removeNode.next;
                removeNode.next.pre = head;
                removeNode.pre = null;
                removeNode.next = null;
                map.remove(removeNode.key);
            }
        }

        // 添加链表末尾(end之前一个）
        private void add2end(Node node) {
            end.pre.next = node;
            node.pre = end.pre;
            node.next = end;
            end.pre = node;
        }
    }

    /**
     * Your LRUCache object will be instantiated and called as such:
     * LRUCache obj = new LRUCache(capacity);
     * int param_1 = obj.get(key);
     * obj.put(key,value);
     */
    //leetcode submit region end(Prohibit modification and deletion)

}