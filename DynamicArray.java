package Algorithms;

public class DynamicArray {
        private int[] array;
        private int size;

        public DynamicArray() {
            array = new int[10];
            size = 0;
        }

        public DynamicArray(int capacity) {
            array = new int[capacity];
            size = 0;
        }

        public int size() {
            return size;
        }

        public int get(int idx) {
            return array[idx];
        }

        public void add(int value) {
            if (size < array.length) {
                array[size] = value;
                size++;
            } else {
                int[] extArray = new int[array.length * 2];
                System.arraycopy(array, 0, extArray, 0, array.length);
                array = extArray;
                array[size] = value;
                size++;
            }
        }

        public void add(int idx, int value) {
            if (size == array.length) {
                int[] extArray = new int[array.length * 2];
                System.arraycopy(array, 0, extArray, 0, array.length);
                array = extArray;
                array[size] = value;
                size++;
            }
            System.arraycopy(array, idx, array, idx + 1, array.length - idx - 1);
            array[idx] = value;
            size++;
        }
        public void remove (int idx){
            System.arraycopy(array,idx + 1,array,idx,array.length-idx-1);
            size--;
        }

        @Override
        public String toString() {
            StringBuffer sb = new StringBuffer("[");
            for (int i = 0; i < size; i++) {
                sb.append(array[i]);
                if (i < size - 1) {
                    sb.append(", ");
                }
            }
            return sb.append("]").toString();
        }
    public static void main(String[] args) {
        DynamicArray da = new DynamicArray(5);
        da.add(8);
        da.add(4);
        da.add(12);
        System.out.println(da);
        da.add(3,4);
        da.add(4,5);
        da.add(1,6);
        System.out.println(da);
        da.remove(6);
        da.remove(5);
        System.out.println(da);
        da.add(0,9);
        System.out.println(da);
        da.add(5,2);
        System.out.println(da);
    }
    }

