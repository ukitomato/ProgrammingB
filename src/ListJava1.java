// ListJava.java


import java.io.*;

class ListString1
{
    static int numOfElements = 0;
    int id;
    String name;
    ListString1 next;

    // Constructor
    ListString1(String name, ListString1 tail) {
        this.id = numOfElements;
        this.name = new String(name);
        this.next = tail;

        numOfElements++;
    }

    static ListString1 Insert(String s, ListString1 tail) {
        return new ListString1(s, tail);
    }

    static void Display(ListString1 element) {
        while (element != null) {
            System.out.print(element.name+"[" + element.id + "]"+"-->");
            element = element.next;
        }
        System.out.println("null");
    }

    // Q1
    static int length(ListString1 element) {
        return numOfElements;
    }

    // Q2
    static void DisplayReverse(ListString1 element) {
        if (element != null) {
            DisplayReverse(element.next);
            System.out.print("<--" + element.name + "[" + element.id + "]");
        } else {
            System.out.print("null");
        }

    }
    // Q3
    static void Search(String query, ListString1 head)
    {
        boolean check = false;
        while (head != null) {
            if (head.name.equals(query)) {
                check = true;
                break;
            }
            head = head.next;
        }
        System.out.println("[Search] "+((check)?"found: "+head.name+"[" + head.id + "]":"not found: "+query));
    }

    // Q4
    static void SearchCheck(String query, ListString1 head)
    {
        boolean check = false;
        while (head != null) {
            if (head.name.equals(query)) {
                check = true;
                break;
            }
            head = head.next;
        }
        if(!check) System.out.println("[Search] not found: "+query);
    }
    static ListString1 Delete(String s, ListString1 head)
    {
        SearchCheck(s, head);

        if (head == null) {
            return null;
        }
        if (head.name.equals(s)) {
            numOfElements--;
            return head.next;
        }
        ListString1 v = head;
        ListString1 w = head.next;

        while (w != null && !((w.name).equals(s))) {
            v = w;
            w = v.next;
        }
        if (w != null) {
            v.next = w.next;
            numOfElements--;
        }
        return head;
    }

    static ListString1 DeleteDisplay(String string, ListString1 head)
    {
        System.out.println("[Delete] " + string);
        head = ListString1.Delete(string, head); // head
        ListString1.Display(head);
        System.out.println("#Elements: " + ListString1.length(head));

        return head;
    }

    public static ListString1 FileRead() {
        ListString1 temp=null;
        try {
            File file = new File("strings.txt");
            BufferedReader br = new BufferedReader(new FileReader(file));
            while (true) {
                String str = br.readLine();
                if (str == null) break;
                temp = new ListString1(str, temp);
            }
            br.close();
        } catch(FileNotFoundException e){
            System.out.println(e);
        } catch(IOException e){
            System.out.println(e);
        }

        return temp;
    }

    public static ListString1 BubbleSort(ListString1 head) {
        ListString1 result = null;
        while (head != null) {
            ListString1 tempList = head;
            while (tempList.next!=null) {
                if (tempList.name.compareTo(tempList.next.name) < 0) {
                    String ntemp = tempList.name;
                    int itemp = tempList.id;
                    tempList.name = tempList.next.name;
                    tempList.id = tempList.next.id;
                    tempList.next.name = ntemp;
                    tempList.next.id = itemp;
                }
                tempList = tempList.next;
            }
            result = new ListString1(tempList.name, result);
            result.id = tempList.id;
            head = Delete(tempList.name, head);
        }
        return result;
    }
}

class ListJava1
{
    public static void main (String[] args)
    {
        ListString1 head;

        head = new ListString1("Tokyo", null);
        head = new ListString1("Kyoto", head);
        head = new ListString1("Tsukuba", head);
        head = new ListString1("Nara", head);
        head = new ListString1("Ueno", head);
        head = new ListString1("Ehime", head);

        ListString1.Display(head);

        // Q1
        System.out.println("#Elements: " + ListString1.length(head));

        // Q2
        ListString1.DisplayReverse(head);
        System.out.println("");

        // Q3
        ListString1.Search("Kyoto", head);
        ListString1.Search("Fukuoka", head);

        // Q4
        head = ListString1.DeleteDisplay("Ehime", head);
        head = ListString1.DeleteDisplay("Fukuoka", head);
        head = ListString1.DeleteDisplay("Tokyo", head);
        head = ListString1.DeleteDisplay("Tsukuba", head);
        head = ListString1.DeleteDisplay("Kyoto", head);
        head = ListString1.DeleteDisplay("Nara", head);
        head = ListString1.DeleteDisplay("Ueno", head);
        head = ListString1.DeleteDisplay("Ueno", head);
    }
}
