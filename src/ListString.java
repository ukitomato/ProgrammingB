// ListString.java
import java.io.File;
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.IOException;

class ListString
{
    static int length = 0;
    int id;
    String name;
    ListString next;

    // Constructor
    ListString(String name, ListString tail) {
        this.id = length;
        this.name = new String(name);
        this.next = tail;

        length++;
    }

    static ListString FileRead() {
        ListString head = null;

        try {
            File file = new File("strings.txt");
            BufferedReader br = new BufferedReader(new FileReader(file));
            while (true) {
                String str = br.readLine();
                if (str == null) break;
                head = new ListString(str, head);
                //System.out.println(str);
            }
            br.close();
        } catch(FileNotFoundException e){
            System.out.println(e);
        } catch(IOException e){
            System.out.println(e);
        }

        return head;
    }

    static ListString Insert(String s, ListString tail) {
        return new ListString(s, tail);
    }

    static void Display(ListString element) {
        while (element != null) {
            System.out.print(element.name+"[" + element.id + "]-->");
            element = element.next;
        }
        System.out.println("null");
    }

    // Q1
    static int length(ListString element) {
        int l = 0;
        while (element != null) {
            l++;
            element = element.next;
        }

        return l;
    }

    // Q2
    static void DisplayReverse(ListString element)
    {
        if (element == null) {
            System.out.print("null");
        }
        else {
            DisplayReverse(element.next);
            System.out.print("<--" + element.name+ "[" + element.id + "]");
        }
    }

    // Q3
    static ListString Delete(String s, ListString head)
    {
        if (head == null) { // element is null
            return null;
        }
        else if (head.name.equals(s) == true) { // delete head
            length--;
            return head.next;
        }
        else { // search and delete
            ListString current = head;
            ListString next = head.next;
            while (true) {
                if (current.next == null) {
                    System.out.println("Not found: " + s);
                    break;
                }
                else if (current.next.name.equals(s) == true) {
                    length--;
                    current.next = current.next.next;
                    break;
                }
                current = current.next;
            }
        }
        return head;
    }

    static void Search(String query, ListString head)
    {
        ListString element = head;

        while (element != null) {
            if (element.name.equals(query) == true) {
                //System.out.println("[Search] found: " + element.name+ "[" + element.id + "]");
                return;
            }
            element = element.next;
        }
        System.out.println("[Search] not found: " + query);
    }

    static ListString DeleteDisplay(String string, ListString head)
    {
        System.out.println("[Delete] " + string);
        head = ListString.Delete(string, head); // head
        ListString.Display(head);
        System.out.println("#Elements: " + ListString.length(head));

        return head;
    }

    static ListString GetElement(ListString head, int order)
    {
        ListString element = head;
        for (int i = 0; i < order; i++) {
            element = element.next;
        }

        return element;
    }

    static ListString BubbleSort(ListString head)
    {
        boolean needNextPass = true;
        for (int k = 1; k < length && needNextPass; k++) {
            needNextPass = false;
            for (int i = 0; i < length - k; i++) {
                ListString left = GetElement(head, i);
                ListString right = GetElement(head, i + 1);
                if (left.name.compareTo(right.name) < 0) {
                    if (i != 0) {
                        ListString beforeLeft = GetElement(head, i - 1);
                        beforeLeft.next = right;
                    }
                    left.next = right.next;
                    right.next = left;

                    if (i == 0) {
                        head = right;
                    }

                    needNextPass = true;
                }
            }
        }

        return head;
    }
}

