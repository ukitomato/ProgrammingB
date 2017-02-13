// FileHashArrayLinkedList.java
class FileHashArrayLinkedList {
    // Please write your code here
    static int SzBkt = 10;
    static void HashSearch(String s, ListString HashTable[])
    {
        // Please write your code here
        ListString.Search(s,HashTable[HashFunction(String2Integer(s))]);
    }

    static int String2Integer(String s) {
        int result = 0;

        result = (int)s.charAt(0);

        return result;
    }

    // Note that SzBkt is a static variable
    static int HashFunction(int l) {
        // Please write your code here
        return l % SzBkt;
    }

    public static void main (String[] args) {
        ListString [] HashTable = new ListString[SzBkt];
        ListString data;
        ListString head;

        for (int i = 0; i < SzBkt; i++) {
            HashTable[i] = null;
        }

        // Constructing a hash structure
        head = ListString.FileRead();
        for (data = head; data != null; data = data.next) {
            int s2int = String2Integer(data.name);
            int pos = HashFunction(s2int);
            HashTable[pos] = ListString.Insert(data.name, HashTable[pos]);
        }

        // Search
        long start, end;
        System.out.println("Invoking list:");
        start = System.currentTimeMillis();
        for (data = head; data != null; data = data.next) {
            ListString.Search(data.name, head);
        }
        end = System.currentTimeMillis();
        System.out.println("Time for list: " + (end - start) + " ms");

        System.out.println("Invoking hash:");
        start = System.currentTimeMillis();
        for (data = head; data != null; data = data.next) {
            HashSearch(data.name, HashTable);
        }
        end = System.currentTimeMillis();
        System.out.println("Time for hash: " + (end - start) + " ms");
    }
}