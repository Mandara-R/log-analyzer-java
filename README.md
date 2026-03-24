# Log Analyzer Tool (Java)

## Problem Statement
Modern systems generate large volumes of log data, making it difficult to manually monitor errors and detect suspicious activities such as repeated failed login attempts.

## Solution
This project is a Java-based Log Analyzer Tool that processes log files, identifies error patterns, and detects potential security threats.

## Features
- Counts INFO, WARNING, and ERROR logs  
- Detects multiple failed login attempts  
- Highlights suspicious log entries  
- Identifies most frequent error message  
- User input for dynamic file analysis

## Project Highlights
- Real-world cybersecurity use case  
- Detects suspicious login behavior  
- Identifies most frequent system errors  
- Simple and efficient log analysis using Java  

## Tech Stack
- Java  
- File Handling (BufferedReader)  
- Data Structures (HashMap)

## How to Run

```bash
javac LogAnalyzer.java
java LogAnalyzer
```

Enter:
```
sample_log.txt
```


## Sample Output

```
===== LOG ANALYSIS REPORT =====
Total INFO: 2
Total WARNINGS: 1
Total ERRORS: 4
Failed Login Attempts: 3
ALERT: Suspicious Activity Detected!
```

## Use Case
This tool helps in:
- System monitoring  
- Security analysis  
- Detecting suspicious activities in logs

## Future Enhancements
- Support for large-scale log files  
- GUI-based visualization  
- Integration with real-time monitoring systems  
- Advanced anomaly detection using AI  

## Author
Mandara R
