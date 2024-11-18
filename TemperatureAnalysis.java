import java.util.Arrays;

public class TemperatureAnalysis {
    public static void main(String[] args) {
        int[] temperatures = {-2, -5, -2, -4, 3, -6, -2, -1, 5, 1, 1, 0, -1, 0, 3, -1, 2, 5, 2, 4, 4, 0, 6, 1, 4, 6, -1, 2, 4, 7, 11};

        // 1) Количество дней с отрицательной температурой
        long negativeDays = Arrays.stream(temperatures)
                .filter(temp -> temp < 0)
                .count();
        System.out.println("Количество дней с отрицательной температурой: " + negativeDays);

        // 2) Были ли дни с температурой выше 10 градусов
        boolean hasAboveTen = Arrays.stream(temperatures)
                .anyMatch(temp -> temp > 10);
        System.out.println("Были ли дни с температурой выше 10 градусов: " + hasAboveTen);

        // 3) Максимальная температура в первую неделю марта
        int maxFirstWeek = Arrays.stream(temperatures, 0, 7)
                .max()
                .orElseThrow();
        System.out.println("Максимальная температура в первую неделю марта: " + maxFirstWeek);

        // 4) Средняя температура за месяц
        double averageTemp = Arrays.stream(temperatures)
                .average()
                .orElseThrow();
        System.out.println("Средняя температура за месяц: " + averageTemp);
    }
}
