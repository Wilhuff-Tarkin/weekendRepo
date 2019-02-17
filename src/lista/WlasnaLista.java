package lista;

import sun.reflect.generics.reflectiveObjects.NotImplementedException;

import java.util.*;

public class WlasnaLista <E> implements List <E> {

    private int DEFAULT_SIZE = 10;

    private int size;

    private Object[] tab;

    WlasnaLista() {
        tab = new Object[DEFAULT_SIZE];
        size = 0;
    }

    WlasnaLista(int initSize) {
        tab = new Object[initSize];
        size = 0;
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public boolean isEmpty() {
        return size >= 0;
    }

    @Override
    public boolean contains(Object o) {
        return indexOf(o) >= 0;
    }

    @Override
    public Iterator iterator() {
        throw new NotImplementedException();
    }

    @Override
    public Object[] toArray() {
        return Arrays.copyOf(tab, size);
    }

    @Override
    public <T> T[] toArray(T[] a) {
        if (a.length < size) {
            return (T[]) Arrays.copyOf(tab, size, a.getClass());
        } else if (a.length > size) {
            a[size] = null;
        }

        System.arraycopy(tab, 0, a, 0, size);
        return a;
    }

    @Override
    public boolean add(Object o) {
        checkEnoughTabSize(size + 1);
        tab[size++] = o;
        return true;
    }

    @Override
    public boolean remove(Object o) {
        int index = indexOf(o);
        if (index == -1) {
            return false;
        }

        remove(index);
        return true;
    }

    @Override
    public boolean addAll(Collection c) {
        return false;
    }

    @Override
    public boolean addAll(int index, Collection c) {
        return false;
    }

    @Override
    public void clear() {

    }

    @Override
    public E get(int index) {
        checkIndexInSize(index);
        return (E) tab[index];
    }

    @Override
    public Object set(int index, Object element) {
        checkIndexInSize(index);
        E oldElement = (E) tab[index];
        tab[index] = element;
        return oldElement;
    }

    @Override
    public void add(int index, Object element) {
        checkIndexInSize(index);
        checkEnoughTabSize(size +1);

        System.arraycopy(tab, index, tab, index+1, size-index);
        tab[index] = element;
    }

    @Override
    public E remove(int index) {

        if (index < 0 || index > size -1){
            throw new ArrayIndexOutOfBoundsException();
        }

        E oldElement = (E) tab [index];
        int numMoved = size - index - 1;
        if (numMoved > 0) {
            System.arraycopy(tab, index +1, tab, index, numMoved);
        }

        tab [--size] = null;
        return oldElement;

    }

    @Override
    public int indexOf(Object o) {
        for (int i = 0; i < size; i++) {
            if (tab[i].equals(o)) {
                return i;
            }
        }

        return -1;
    }

    @Override
    public int lastIndexOf(Object o) {
        for (int i = size - 1; i >= 0; i--) {
            if (tab[i].equals(o)) {
                return i;
            }

        }

        return -1;
    }

    @Override
    public ListIterator listIterator() {
        return null;
    }

    @Override
    public ListIterator listIterator(int index) {
        return null;
    }

    @Override
    public List subList(int fromIndex, int toIndex) {
        return null;
    }

    @Override
    public boolean retainAll(Collection c) {
        return false;
    }

    @Override
    public boolean removeAll(Collection c) {
        return false;
    }

    @Override
    public boolean containsAll(Collection c) {
        return false;
    }

    private void checkEnoughTabSize (int newSize){
         if (newSize > tab.length) {
             int oldCapacity = tab.length;
             int newCapacity = tab.length + (int) (0.5 * tab.length);
             //int newCapacity = tab.length + (tab.length >> 1);

             tab = Arrays.copyOf(tab, newCapacity);

         }
    }

    public void checkIndexInSize (int index){
        if (index < 0 || index > size -1){
            throw new ArrayIndexOutOfBoundsException();
        }
    }


}
