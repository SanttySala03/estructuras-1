package utilidad;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class MetodosOrdenamiento {

    public void bubbleSortList(List<Comparable> list) {
        int n = list.size();
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (list.get(j).compareTo(list.get(j + 1)) > 0) {
                    Collections.swap(list, j, j + 1);
                }
            }
        }
    }

    public void imprimirBubbleSortList(List<Comparable> list) {
        for (Comparable item : list) {
            System.out.print(item + " ");
        }
        System.out.println();
    }

    public void insertSortList(List<Comparable> list) {
        int n = list.size();
        for (int i = 1; i < n; i++) {
            Comparable key = list.get(i);
            int j = i - 1;
            while (j >= 0 && list.get(j).compareTo(key) > 0) {
                list.set(j + 1, list.get(j));
                j--;
            }
            list.set(j + 1, key);
        }
    }

    public void imprimirInsertSortList(List<Comparable> list) {
        for (Comparable item : list) {
            System.out.print(item + " ");
        }
        System.out.println();
    }

    private int partition(List<Comparable> list, int low, int high) {
        Comparable pivot = list.get(high);
        int i = low - 1;
        for (int j = low; j < high; j++) {
            if (list.get(j).compareTo(pivot) < 0) {
                i++;
                Collections.swap(list, i, j);
            }
        }
        Collections.swap(list, i + 1, high);
        return i + 1;
    }

    public void quickSortList(List<Comparable> list, int low, int high) {
        if (low < high) {
            int pi = partition(list, low, high);
            quickSortList(list, low, pi - 1);
            quickSortList(list, pi + 1, high);
        }
    }

    public void imprimirQuickSortList(List<Comparable> list) {
        for (Comparable item : list) {
            System.out.print(item + " ");
        }
        System.out.println();
    }

    public void bucketSortList(List<Comparable> list) {
        int n = list.size();
        if (n == 0) {
            return;
        }
        Comparable minValue = Collections.min(list);
        Comparable maxValue = Collections.max(list);

        int bucketCount = maxValue.compareTo(minValue) - minValue.compareTo(minValue) + 1;
        List<List<Comparable>> bucketArray = new ArrayList<>(bucketCount);

        for (int i = 0; i < bucketCount; i++) {
            bucketArray.add(new ArrayList<>());
        }

        for (Comparable item : list) {
            int bucketIndex = item.compareTo(minValue) - minValue.compareTo(minValue);
            bucketArray.get(bucketIndex).add(item);
        }

        for (List<Comparable> bucket : bucketArray) {
            Collections.sort(bucket);
        }

        int currentIndex = 0;
        for (List<Comparable> bucket : bucketArray) {
            for (Comparable item : bucket) {
                list.set(currentIndex++, item);
            }
        }
    }

    public void imprimirBucketSortList(List<Comparable> list) {
        for (Comparable item : list) {
            System.out.print(item + " ");
        }
        System.out.println();
    }
}
