\# Day 31 — HTTP + Real API (Java)



\## 🚀 Objective



Learn how to:



\* Send HTTP requests from Java

\* Consume a real public API

\* Handle response codes (200, 404)

\* Read response data (JSON)

\* Extract specific values from JSON (basic string parsing)



\---



\## 🌐 API Used



GitHub Users API:



```bash

https://api.github.com/users/{username}

```



Example:



```bash

https://api.github.com/users/octocat

```



\---



\## ⚙️ Tech Used



\* Java 17

\* `HttpURLConnection`

\* `BufferedReader`

\* `StringBuilder`



\---



\## 📡 How It Works



1\. Create URL with username

2\. Open HTTP connection

3\. Send GET request

4\. Read response using stream

5\. Handle success and error cases

6\. Extract required data from JSON



\---



\## 🧠 Key Concepts



\### HTTP Request Flow



```

Java Client → HTTP Request → Server → JSON Response

```



\### Response Codes



| Code | Meaning      |

| ---- | ------------ |

| 200  | Success      |

| 404  | Not Found    |

| 400  | Bad Request  |

| 500  | Server Error |



\---



\## 🧪 Features Implemented



\* Fetch GitHub user data

\* Handle both:



&#x20; \* Valid user → 200 OK

&#x20; \* Invalid user → 404 Not Found

\* Read full JSON response

\* Extract:



&#x20; \* `login`

&#x20; \* `public\_repos`



\---



\## 🧾 Sample Output



```

Response Code: 200



Login: octocat

Public Repos: 8

```



\---



\## ⚠️ Important Note



Data extraction is done using:



```java

indexOf + substring

```



This is:



\* NOT reliable for production

\* Used only for learning purpose



\---



\## 📌 Limitations



\* Manual string parsing (fragile)

\* No JSON library used

\* Breaks if JSON format changes



\---



\## 🔜 Next Step



Day 32:



\* JSON parsing using Jackson

\* Convert JSON → Java objects

\* Clean and scalable approach



\---



\## 💡 Takeaway



This is the first step into real backend development:



> Making your Java code communicate with real-world APIs.



