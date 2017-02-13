// List.java
class ListString
{
    static int numOfElements = 0;
    int id;
    String name;
    ListString next;

    // Constructor
    ListString(String name, ListString tail) {
        this.id = numOfElements;
        this.name = new String(name);
        this.next = tail;

        numOfElements++;
    }

    static ListString Insert(String s, ListString tail) {
        return new ListString(s, tail);
    }

    static void Display(ListString element) {
        while (element != null) {
            System.out.print(element.name + "[" + element.id + "]-->");
            element = element.next;
        }
        System.out.println("null");
    }

    static int length(ListString element) {
        int length = 0;
        while (element != null) {
            length++;
            element = element.next;
        }
        return length;
    }

    static void DisplayReverse(ListString element)
    {
        if (element == null) {
            System.out.print("null");
        } else {
            DisplayReverse(element.next);
            System.out.print("<--" + element.name + "[" + element.id + "]");
        }
    }

    static void Search(String query, ListString head)
    {
        ListString listString = head;
        boolean check = false;
        while (listString != null) {
            if (listString.name.equals(query)) {
                check = true;
                break;
            }
            listString = listString.next;
        }
        System.out.println("[Search] "+((check)?"found: "+head.name+"[" + head.id + "]":"not found: "+query));
    }

    static boolean SearchCheck(String query, ListString head)
    {
        boolean check = false;
        while (head != null) {
            if (head.name.equals(query)) {
                check = true;
                break;
            }
            head = head.next;
        }
        return check;
    }



    static ListString Delete(String s, ListString head)
    {
        if (head == null) {
            return null;
        } else if (head.name.equals(s) == true) {
            numOfElements--;
            return head.next;
        } else {
            ListString x = head;
            while (true) {
                if (x.next == null) {
                    System.out.println("Not found: " + s);
                    break;
                } else if (x.next.name.equals(s) == true) {
                    numOfElements--;
                    x.next = x.next.next;
                    break;
                }
                x = x.next;
            }
        }
        return head;
    }

    static ListString DeleteDisplay(String string, ListString head)
    {
            System.out.println("[Delete] " + string);
            head = ListString.Delete(string, head);
            ListString.Display(head);
            System.out.println("#Elements: " + ListString.length(head));
        return head;

    }
}

class ListJava
{
    public static void main (String[] args)
    {
        ListString head;

        head = new ListString("Tokyo", null);
        head = new ListString("Kyoto", head);
        head = new ListString("Tsukuba", head);
        head = new ListString("Nara", head);
        head = new ListString("Ueno", head);
        head = new ListString("Ehime", head);

        ListString.Display(head);

        System.out.println("#Elements: " + ListString.length(head));

        ListString.DisplayReverse(head);
        System.out.println("");

        ListString.Search("Kyoto", head);
        ListString.Search("Fukuoka", head);

        head = ListString.DeleteDisplay("Ehime", head);
        head = ListString.DeleteDisplay("Fukuoka", head);
        head = ListString.DeleteDisplay("Tokyo", head);
        head = ListString.DeleteDisplay("Tsukuba", head);
        head = ListString.DeleteDisplay("Kyoto", head);
        head = ListString.DeleteDisplay("Nara", head);
        head = ListString.DeleteDisplay("Ueno", head);
        head = ListString.DeleteDisplay("Ueno", head);
    }
}

