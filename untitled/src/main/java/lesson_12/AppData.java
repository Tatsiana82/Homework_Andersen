package lesson_12;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;

//Task_1 and 2
public class AppData {
    private String[] header;
    private int[][] data;

    public AppData() {
    }

    public AppData(String[] header, int[][] data) {
        this.header = header;
        this.data = data;
    }

    public String[] getHeader() {
        return header;
    }

    public void setHeader(String[] header) {
        this.header = header;
    }

    public int[][] getData() {
        return data;
    }

    public void setData(int[][] data) {
        this.data = data;
    }


    public void saveToCSV(String filename) throws IOException {
        try (FileWriter writer = new FileWriter(filename)) {

// Запись заголовка
            writer.append(String.join(";", header));
            writer.append('\n');

// Запись данных
            for (int[] row : data) {
                String rowString = Arrays.stream(row)
                        .mapToObj(String::valueOf)
                        .reduce((x, y) -> x + ";" + y)
                        .orElse("");
                writer.append(rowString);
                writer.append('\n');
            }
        }
    }

// Загрузка данных из CSV файла
    public void loadFromCSV(String filename) throws IOException {
        try (BufferedReader reader = new BufferedReader(new FileReader(filename))) {

// Чтение заголовка

            String headerLine = reader.readLine();
            header = headerLine.split(";");

// Чтение данных

            String line;
            data = reader.lines()
                    .map(l -> Arrays.stream(l.split(";"))
                            .mapToInt(Integer::parseInt)
                            .toArray())
                    .toArray(int[][]::new);
        }
    }

    public static void main(String[] args) {
        AppData appData = new AppData();
        appData.setHeader(new String[]{"Value 1", "Value 2", "Value 3"});
        appData.setData(new int[][]{
                {100, 200, 123},
                {300, 400, 500}
        });

        String filename = "data.csv";
        try {

            appData.saveToCSV(filename);
            System.out.println("Данные сохранены в " + filename);

// Загрузка данных из CSV файла
            AppData loadedData = new AppData();
            loadedData.loadFromCSV(filename);
            System.out.println("Данные загружены:");
            System.out.println("Заголовок: " + String.join(", ", loadedData.getHeader()));
            for (int[] row : loadedData.getData()) {
                System.out.println(Arrays.toString(row));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}