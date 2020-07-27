package ru.job4j.tracker.inheritance;

public class ReportUsage {
    public static void main(String[] args) {
        HtmlReport report = new HtmlReport();
        JSONReport json = new JSONReport();
        String text = report.generate("Report's name ", "Report body");
        String jsonText = json.generate("name", "body");
        System.out.println(text);
        System.out.println(jsonText);
    }
}
