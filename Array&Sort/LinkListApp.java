public class LinkListApp {
  public int iData;
  public double dData;
  public Link next;

  public LinkListApp(int id, double dd) {
    iData = id;
  }

  public void displayLink() {
    System.out.println("{" + iData + "," + "}");
  }

  private Link first;

  public LinkListApp() {
    first = null;
  }

  public boolean isEmpty() {
    return (first == null);
  }

  void insertFirst(int id, double dd) {
    Link newLink = new Link(id, dd);
    newLink.next = first;
    first = newLink;
  }

  Link deleteFirst() {
    Link temp = first;
    first = first.next;
    return temp;
  }

  void displayList() {
    System.out.println("List(first-->last): ");
    Link current = first;
    while (current != null) {
      current.displayLink();
      current = current.next;
    }
    System.out.println("");
  }

  public static void main(String[] args) {
    LinkListApp theList = new LinkListApp();
    theList.insertFirst(22, 2.99);
    theList.insertFirst(44, 4.99);
    theList.insertFirst(66, 6.99);
    theList.insertFirst(88, 8.99);

    theList.displayList();

    while (!theList.isEmpty()) {
      Link aLink = theList.deleteFirst();
      System.out.println("Deleted");
      aLink.displayLink();
      System.out.println("");
    }
    theList.displayList();
  }
}
