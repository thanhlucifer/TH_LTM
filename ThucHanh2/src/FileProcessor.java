import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class FileProcessor {

    public static void main(String[] args) {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        try {
            // Bước 1: Người dùng nhập tên tập tin
            System.out.print("Nhập tên tập tin: ");
            String fileName = reader.readLine();

            // Bước 2: Tạo mảng số nguyên từ tập tin
            int[] integers = createIntegerArrayFromFile("D:\\" + fileName);

            // Bước 3: Tách mảng thành các đoạn
            List<int[]> arrays = splitArray(integers);

            // Bước 4: Đọc và in nội dung các mảng
            System.out.println("Nội dung các mảng:");
            for (int i = 0; i < arrays.size(); i++) {
                System.out.println("Mảng " + (i + 1) + ": " + arrayToString(arrays.get(i)));
            }

            // Bước 5: Ghi nội dung các mảng vào tập tin "Mang.txt"
            writeToFile(arrays);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    // Bước 2: Tạo mảng số nguyên từ tập tin
    public static int[] createIntegerArrayFromFile(String fileName) throws IOException {
        BufferedReader fileReader = new BufferedReader(new FileReader(fileName));
        List<Integer> integerList = new ArrayList<>();

        String line;
        while ((line = fileReader.readLine()) != null) {
            int number = Integer.parseInt(line);
            integerList.add(number);
        }

        fileReader.close();

        // Chuyển List<Integer> thành mảng int[]
        return integerList.stream().mapToInt(Integer::intValue).toArray();
    }

    // Bước 3: Tách mảng thành các đoạn
    public static List<int[]> splitArray(int[] integers) {
        List<int[]> arrays = new ArrayList<>();
        int startIndex = 0;

        while (startIndex < integers.length) {
            int endIndex = Math.min(startIndex + 100, integers.length);
            int[] subArray = new int[endIndex - startIndex];
            System.arraycopy(integers, startIndex, subArray, 0, endIndex - startIndex);
            arrays.add(subArray);
            startIndex = endIndex;
        }

        return arrays;
    }

    // Chuyển mảng thành chuỗi
    public static String arrayToString(int[] array) {
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        for (int i = 0; i < array.length; i++) {
            sb.append(array[i]);
            if (i < array.length - 1) {
                sb.append(", ");
            }
        }
        sb.append("]");
        return sb.toString();
    }

    // Bước 5: Ghi nội dung các mảng vào tập tin "Mang.txt"
    public static void writeToFile(List<int[]> arrays) throws IOException {
        BufferedWriter writer = new BufferedWriter(new FileWriter("D:\\Mang.txt")); // Lưu tập tin trong ổ D

        for (int[] array : arrays) {
            for (int i = 0; i < array.length; i++) {
                writer.write(String.valueOf(array[i]));
                if (i < array.length - 1) {
                    writer.newLine();
                }
            }
        }

        writer.close();
        System.out.println("Đã ghi thành công vào tập tin Mang.txt");
    }
}
