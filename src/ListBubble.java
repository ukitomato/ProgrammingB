class ListBubble
{
    public static void main (String[] args)
    {
        ListString1 head;

        System.out.println("Before sorting");
        head = ListString1.FileRead();
        ListString1.Display(head);

        System.out.println("After sorting");
        head = ListString1.BubbleSort(head);
        ListString1.Display(head);
    }
}