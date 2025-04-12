# 🎓 Student Database - Java Mini Project (CRUD using ArrayList)

- A simple console-based Java application that performs CRUD (Create, Read, Update, Delete) operations on a student database using `ArrayList`.

---

## 🛠 Features
- Add Student
- View All Students
- Search Student by Roll Number
- Update Student
- Delete Student
---

## 💡 How to Run
1. Save the code in `StudentDatabase.java`.
2. Compile and run using:
   ```bash
   javac StudentDatabase.java
   java StudentDatabase
   ```
   
## 🧪 Sample Output
********** Student Database *************
1. Add Student
2. View All Students
3. Search Student By Roll No.
4. Update Student
5. Delete Student
6. Exit
Enter Choice: 1
Enter Roll No: 101
Enter Name: Ankit
Enter Course: MCA
Student added.

********** Student Database *************
Enter Choice: 2
Roll : 101, Name : Ankit, Course : MCA


## ❓ Q&A (Concepts Behind the Code)
###🔹 Q: Why do we use the toString() method? Any alternate?
The toString() method is automatically called when you print an object using System.out.println(obj).
If you don’t override it, Java prints something like Student@4e50df2e.
✅ Alternate: You can create and call a custom method like display() to print fields.

### 🔹 Q: What happens if I use student.display() instead of System.out.println(student)?
It will work only if you define a display() method inside the Student class.
You’ll need to manually call it in a loop.
⚠️ Disadvantage: Can’t use in System.out.println(student) directly.

### 🔹 Q: Where should we use toString() and where should we use display()?
Use toString() when printing via System.out.println(object)

Use display() if you want more custom control, or want to call printing explicitly

### 🔹 Q: Why is ArrayList<Student> declared outside main()?
Declaring it outside main() makes it accessible to all static methods (addStudent(), viewStudents(), etc.).
⚠️ If you declare it inside main(), other methods can’t access it unless you pass it as an argument.

### 🔹 Q: Why is students declared as static?
Because main() and all other methods are static, you can only access static variables without creating an object of the class.
✅ Alternate: Make everything non-static and call using an object. But for simplicity, static is fine.

### 🔹 Q: Why is Scanner sc = new Scanner(System.in); declared as static?
Same reason: so that all static methods can use it without needing an object.
⚠️ If it’s not static, you'd get non-static variable cannot be referenced from a static context.

## 🧠 Concepts Used
Java Classes & Objects
Constructors
ArrayList
Enhanced for-loop
Scanner class
Iterator for safe deletion
Method Overriding (toString())

🙌 Author
Ankit Sir (Ankit Bisht)
Aspiring Java & Android Developer 🌱
Built with 💙 to master core concepts.

