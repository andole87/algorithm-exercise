import org.junit.jupiter.api.Test;

import java.util.Objects;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AddTwoNumber {
    @Test
    void name() {
        ListNode l1 = new ListNode(2);
        l1.next = new ListNode(4);
        l1.next.next = new ListNode(3);

        ListNode l2 = new ListNode(5);
        l2.next = new ListNode(6);
        l2.next.next = new ListNode(4);

        ListNode expect = new ListNode(7);
        expect.next = new ListNode(0);
        expect.next.next = new ListNode(8);

        ListNode result = addTwoNumbers(l1, l2);
        assertEquals(expect, result);
        assertEquals(expect.next, result.next);
        assertEquals(expect.next.next, result.next.next);
    }

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode result;
        int rest = 0;
        int temp = l1.val + l2.val;
        rest = temp > 9 ? 1 : 0;
        result = new ListNode(temp % 10);
        ListNode calc = result;
        while (l1.next != null || l2.next != null) {
            l1 = getListNode(l1);
            l2 = getListNode(l2);
            temp = rest + (l1.val + l2.val);
            rest = temp > 9 ? 1 : 0;
            result.next = new ListNode(temp % 10);
            result = getListNode(result);
        }
        if (rest != 0) {
            result.next = new ListNode(rest);
        }
        return calc;
    }

    private ListNode getListNode(ListNode l1) {
        if (l1.next == null) {
            return new ListNode(0);
        }
        l1 = l1.next;
        return l1;
    }

    public class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            ListNode listNode = (ListNode) o;
            return val == listNode.val;
        }

        @Override
        public int hashCode() {
            return Objects.hash(val);
        }
    }
}
