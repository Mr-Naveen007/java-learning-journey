\# 📅 Day 27 — Java File Handling \& Logging System



\## 📌 Overview



Today focused on understanding and implementing \*\*Java File Handling\*\*, a core backend skill used for data persistence, logging, and file processing.



Built a \*\*mini logging system\*\* that writes user activity to a file and reads it back.



\---



\## 🧠 Concepts Covered



\### 1. File Writing



\* Used `FileWriter` to write data into files

\* Learned difference between:



&#x20; \* \*\*Overwrite mode\*\*

&#x20; \* \*\*Append mode\*\* (`true` flag)



\---



\### 2. Buffered Writing



\* Used `BufferedWriter` for efficient file operations

\* Writes data in chunks → better performance



\---



\### 3. File Reading



\* Used `FileReader` and `BufferedReader`

\* Implemented:



&#x20; ```java

&#x20; while ((line = br.readLine()) != null)

&#x20; ```

\* Reads file line-by-line (real-world approach)



\---



\### 4. Try-With-Resources



\* Automatic resource management

\* No need to manually call `.close()`

\* Prevents memory leaks and file locks



\---



\### 5. Logging Concept



\* Logger = system that records events for debugging and tracking

\* Implemented custom logging format:



&#x20; ```

&#x20; timestamp : username -> action

&#x20; ```



\---



\## ⚙️ Implementation



\### 🔹 Features Built



\* Log user activities into `app.log`

\* Append new logs without overwriting old ones

\* Read and display logs from file



\---



\### 🔹 Sample Output



```

2026-04-10T12:30 : Naveen -> LOGIN

2026-04-10T12:31 : Naveen -> DOWNLOAD\_FILE

2026-04-10T12:32 : Naveen -> LOGOUT

```



\---



\## 🚀 Key Learnings



\* File handling is essential for backend systems

\* Append mode is critical for logging/history

\* Buffered I/O improves performance significantly

\* Try-with-resources ensures safe and clean code

\* Logging helps in debugging and tracking system behavior



\---



\## 📁 Files



\* `UserActivityLogger.java`

\* `app.log` (generated at runtime)



\---



\## 🔥 Conclusion



Built a \*\*real-world applicable logging system\*\* using Java file handling concepts. This forms the foundation for backend features like logging, auditing, and file processing.



\---



\## ⏭️ Next Step



Move to \*\*advanced file handling / serialization / NIO APIs\*\*



