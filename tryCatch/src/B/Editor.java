
package B;

import A.Window;
import java.util.Scanner;

public class Editor extends Window {
    private String id;
    private String title;

    public Editor() {
        super();
        this.id = "0";
        this.title = "";
    }

    public Editor(int width, int length, String id, String title) {
        super(width, length);
        this.id = id;
        this.title = title;
    }

    public String getId() {
        return id.toUpperCase();
    }

    public void setId(String id) throws Exception {
        if (!id.matches("(?i)^E\\d{3}")) {
            throw new Exception("Exxx(x is digit)");
        }
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) throws Exception {
        if (title == null || title.trim().isEmpty()) {
            throw new Exception("Error");
        }
        this.title = title;
    }

    public void input() {
        super.input();
        Scanner sc = new Scanner(System.in);
        try {
            System.out.print("Enter ID (Exxx): ");
            setId(sc.next());
            sc.nextLine(); 
            System.out.print("Enter title: ");
            setTitle(sc.nextLine());
        } catch (Exception e) {
            System.out.println("Invalid input");
        }
    }

    @Override
    public void output() {
        super.output();
        System.out.println("Editor [" + id.toUpperCase() + "-" + title + "]");
    }
}
