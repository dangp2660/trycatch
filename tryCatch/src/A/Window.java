package A;

import java.util.Scanner;

public class Window {
    private int width;
    private int length;

    public Window() {
        this.width = 10;
        this.length = 10;
    }

    public Window(int width, int length) {
        this.width = width;
        this.length = length;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) throws Exception{
        if (width < 10 || width > 100) {
            throw new Exception(" 10 < width < 100");
        }
        this.width = width;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) throws Exception {
        if (length < 10 || length > 100) {
            throw new Exception(" 10 < length < 100");
        }
        this.length = length;
    }

    public void input() {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.print("Enter width: ");
            setWidth(sc.nextInt());
            System.out.print("Enter length: ");
            setLength(sc.nextInt());
        } catch (Exception e) {
            System.out.println("Invalid input");
        }
    }

    public void output() {
        System.out.println("[" + this.length + "-" + this.width + "]");
    }
}
