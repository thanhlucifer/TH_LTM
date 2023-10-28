import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class FileProcessorGUI extends JFrame implements ActionListener {
    private JTextField fileNameField;
    private JTextArea resultTextArea;

    public FileProcessorGUI() {
        // Khởi tạo cửa sổ và các thành phần
        setTitle("File Processor");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Tạo các thành phần
        JLabel fileNameLabel = new JLabel("Nhập tên tập tin:");
        fileNameField = new JTextField(20);
        JButton processButton = new JButton("Xử lý");
        resultTextArea = new JTextArea(50, 30);
        resultTextArea.setEditable(false);

        // Đặt layout
        setLayout(new FlowLayout());

        // Thêm các thành phần vào cửa sổ
        add(fileNameLabel);
        add(fileNameField);
        add(processButton);
        add(resultTextArea);

        // Đăng ký sự kiện cho nút
        processButton.addActionListener(this);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new FileProcessorGUI().setVisible(true);
            }
        });
    }

    public void actionPerformed(ActionEvent e) {
        String fileName = fileNameField.getText();

        try {
            int[] integers = createIntegerArrayFromFile("D:\\" + fileName);
            List<int[]> arrays = splitArray(integers);

            resultTextArea.setText("Nội dung các mảng:\n");
            for (int i = 0; i < arrays.size(); i++) {
                resultTextArea.append("Mảng " + (i + 1) + ": " + arrayToString(arrays.get(i)) + "\n");
            }

            writeToFile(arrays);
        } catch (IOException ex) {
            resultTextArea.setText("Lỗi: " + ex.getMessage());
        }
    }

    // Các phương thức còn lại giữ nguyên từ phiên bản ban đầu
    // ...
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
