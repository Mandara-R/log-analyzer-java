import java.io.*;
import java.util.*;

public class LogAnalyzer {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter log file name: ");
        String fileName = sc.nextLine();

        int errorCount = 0;
        int warningCount = 0;
        int infoCount = 0;
        int failedLoginCount = 0;

        HashMap<String, Integer> errorMap = new HashMap<>();

        try {
            BufferedReader reader = new BufferedReader(new FileReader(fileName));
            String line;

            System.out.println("\n--- Suspicious Log Entries ---");

            while ((line = reader.readLine()) != null) {

                if (line.contains("ERROR")) {
                    errorCount++;

                    // Count each error message
                    errorMap.put(line, errorMap.getOrDefault(line, 0) + 1);
                }

                if (line.contains("WARNING")) warningCount++;
                if (line.contains("INFO")) infoCount++;

                if (line.toLowerCase().contains("invalid password")) {
                    failedLoginCount++;
                    System.out.println("" + line);
                }
            }

            reader.close();

            // Find most frequent error
            String mostFrequentError = "";
            int maxCount = 0;

            for (String key : errorMap.keySet()) {
                if (errorMap.get(key) > maxCount) {
                    maxCount = errorMap.get(key);
                    mostFrequentError = key;
                }
            }

            // Final Report
            System.out.println("\n===== LOG ANALYSIS REPORT =====");
            System.out.println("Total INFO: " + infoCount);
            System.out.println("Total WARNINGS: " + warningCount);
            System.out.println("Total ERRORS: " + errorCount);
            System.out.println("Failed Login Attempts: " + failedLoginCount);

            if (failedLoginCount >= 3) {
                System.out.println("ALERT: Suspicious Activity Detected!");
            } else {
                System.out.println("System looks safe.");
            }

            if (!mostFrequentError.isEmpty()) {
                System.out.println("\nMost Frequent Error:");
                System.out.println( mostFrequentError + " (" + maxCount + " times)");
            }

        } catch (IOException e) {
            System.out.println(" Error: File not found or cannot be read.");
        }

        sc.close();
    }
}
