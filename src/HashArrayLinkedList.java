// HashArrayLinkedList.java
class HashArrayLinkedList {
    // Please write your code here
    static int SzBkt = 5;
    static int String2Integer(String s) {
        int result = 0;

        result = (int)s.charAt(0);

        return result;
    }

    // Note that SzBkt is a static variable, and SzBkt expresses the size of HashTable.
    static int HashFunction(int l) {
        // Please write your code here
        return l%SzBkt;
    }

    public static void main (String[] args) {
        String [] persons = {"abe",        // 0
                "amagasa",    // 0
                "sannomiya",  // 18
                "sakuma",     // 18
                "maeda",      // 12
                "sato",       // 18
                "tadano",     // 19
                "sano",       // 18
                "sugiki",     // 18
                "oka"};       // 14

        ListString[] HashTable = new ListString[SzBkt];

        for (int i = 0; i < SzBkt; i++) {
            HashTable[i] = null;
        }

        // Constructing a hash structure
        for (int i = 0; i < persons.length; i++) {
            int s2int = String2Integer(persons[i]);
            int pos = HashFunction(s2int);
            HashTable[pos] = ListString.Insert(persons[i], HashTable[pos]);
        }

        for (int i = 0; i < SzBkt; i++) {
            ListString.Display(HashTable[i]);
        }
    }
}
