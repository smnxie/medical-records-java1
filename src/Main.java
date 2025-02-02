// Новый класс для генерации отчета
class ReportCreator {
    public String generate() {
        return "Some report data";
    }
}

// Класс для сохранения отчета в файл
class FileSaver {
    public void saveToFile(String data) {
        System.out.println("Saving to file: " + data);
    }
}

// Класс для отправки отчета по email
class EmailSender {
    public void sendEmail(String data) {
        System.out.println("Sending email: " + data);
    }
}

// Основной класс для использования
public class Main {
    public static void main(String[] args) {
        // Создаем экземпляры классов
        ReportCreator reportCreator = new ReportCreator();
        FileSaver fileSaver = new FileSaver();
        EmailSender emailSender = new EmailSender();

        // Генерируем отчет
        String reportData = reportCreator.generate();

        // Сохраняем отчет в файл
        fileSaver.saveToFile(reportData);

        // Отправляем отчет по email
        emailSender.sendEmail(reportData);
    }
}
