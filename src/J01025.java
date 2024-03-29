import java.util.Scanner;

public class J01025 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int x1 = scanner.nextInt();
        int y1 = scanner.nextInt();
        int x2 = scanner.nextInt();
        int y2 = scanner.nextInt();

        int x3 = scanner.nextInt();
        int y3 = scanner.nextInt();
        int x4 = scanner.nextInt();
        int y4 = scanner.nextInt();

        int minX = Math.min(Math.min(x1, x2), Math.min(x3, x4));
        int maxX = Math.max(Math.max(x1, x2), Math.max(x3, x4));
        int minY = Math.min(Math.min(y1, y2), Math.min(y3, y4));
        int maxY = Math.max(Math.max(y1, y2), Math.max(y3, y4));

        int side = Math.max(maxX - minX, maxY - minY);
        long area = (long) side * side;

        System.out.println(area);

        scanner.close();
    }
}
