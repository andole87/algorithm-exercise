import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Permutation<T> {
    private Set<List<T>> results = new HashSet<>(new ArrayList<>());
    private List<T> elements = new ArrayList<>();

    public void setElements(List<T> list) {
        elements = list;
    }

    private void swap(List<T> list, int i, int j) {
        T temp = list.get(i);
        list.set(i, list.get(j));
        list.set(j, temp);
    }

    public void perm(int n, int r) {
        if (n == elements.size() - r) {
            List<T> clone = clone(elements, r);
            System.out.println(clone);
            results.add(clone);
            return;
        }
        for (int i = 0; i < n; i++) {
            swap(elements, i, n - 1);
            perm(n - 1, r);
            swap(elements, i, n - 1);
        }
    }

    private List<T> clone(List<T> list, int size) {
        List<T> result = new ArrayList<>(size);
        int i = 0;
        while (i < size) {
            result.add(list.get(list.size() - 1 - i++));
        }
        return result;
    }

    public Set<List<T>> getResults() {
        return results;
    }
}
