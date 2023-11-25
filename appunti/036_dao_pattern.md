# DAO pattern

Il **DAO (Data Access Object) Pattern** è un design pattern strutturale che fornisce un'astrazione dell'accesso ai dati. L'obiettivo principale di questo pattern è separare la logica di accesso ai dati dalla logica di business. Ciò consente di modificare la modalità di accesso ai dati senza influenzare il resto del sistema.


---

### Componenti del DAO Pattern:

1. **Interfaccia DAO (Data Access Object):**
   - Definisce i metodi di accesso ai dati, che possono includere operazioni di creazione, lettura, aggiornamento e cancellazione (CRUD).
   - L'interfaccia DAO è indipendente dal tipo specifico di sorgente dati utilizzato.

    ```java
    public interface UserDao {
        User getById(int userId);
        void save(User user);
        void update(User user);
        void delete(User user);
        // Altri metodi relativi all'accesso ai dati
    }
    ```

---

2. **Classe concreta DAO:**
   - Implementa l'interfaccia DAO per un tipo specifico di sorgente dati, come un database relazionale, un file di testo, ecc.
   - Contiene la logica effettiva per interagire con il particolare sorgente dati.

    ```java
    public class UserDaoImpl implements UserDao {
        @Override
        public User getById(int userId) {
            // Implementazione per recuperare un utente dal database
        }

        @Override
        public void save(User user) {
            // Implementazione per salvare un utente nel database
        }

        @Override
        public void update(User user) {
            // Implementazione per aggiornare un utente nel database
        }

        @Override
        public void delete(User user) {
            // Implementazione per eliminare un utente dal database
        }
    }
    ```

---

3. **Modello di Dominio (Model):**
   - Rappresenta l'oggetto di dominio che viene memorizzato o recuperato dal sorgente dati.
   - Nell'esempio, `User` rappresenta l'oggetto utente.

    ```java
    public class User {
        private int userId;
        private String username;
        private String email;
        // Altri attributi e metodi
    }
    ```

---

4. **Client:**
   - Utilizza l'interfaccia DAO per interagire con i dati senza preoccuparsi dei dettagli di implementazione o della sorgente dati sottostante.

    ```java
    public class Client {
        public static void main(String[] args) {
            UserDao userDao = new UserDaoImpl();

            // Utilizzo del DAO per accedere ai dati
            User user = userDao.getById(1);
            user.setUsername("NuovoUsername");
            userDao.update(user);
        }
    }
    ```

### Vantaggi del DAO Pattern:

---

1. **Separazione delle Responsabilità:**
   - Isola la logica di accesso ai dati dal resto del sistema, consentendo cambiamenti indipendenti in ciascun componente.

---

2. **Riutilizzo del Codice:**
   - La logica di accesso ai dati è incapsulata all'interno del DAO, consentendo il riutilizzo dello stesso DAO in diverse parti dell'applicazione.

---

3. **Manutenibilità:**
   - Facilita la manutenzione del codice, poiché le modifiche nel sistema di memorizzazione dati possono essere gestite facilmente modificando solo l'implementazione del DAO.

---

4. **Testabilità:**
   - Semplifica il test delle operazioni di accesso ai dati, poiché è possibile sostituire facilmente un DAO con un'implementazione "mock" o di test.

Il DAO Pattern è particolarmente utile nelle applicazioni che necessitano di interagire con più sorgenti dati o che devono supportare cambiamenti nel sistema di memorizzazione dati senza impattare l'intero sistema.

---

![dao](https://raw.githubusercontent.com/maboglia/CorsoJava/master/appunti/img/dao_pattern_uml_diagram.jpeg)

[tutorialspoint](https://www.tutorialspoint.com/design_pattern/data_access_object_pattern.htm)

---

## Step 1

Create Value Object.

**Student.java**

```java
public class Student {
   private String name;
   private int rollNo;

   Student(String name, int rollNo){
      this.name = name;
      this.rollNo = rollNo;
   }

   public String getName() {
      return name;
   }

   public void setName(String name) {
      this.name = name;
   }

   public int getRollNo() {
      return rollNo;
   }

   public void setRollNo(int rollNo) {
      this.rollNo = rollNo;
   }
}
```

---

## Step 2

Create Data Access Object Interface.

**StudentDao.java**

```java
import java.util.List;

public interface StudentDao {
   public List<Student> getAllStudents();
   public Student getStudent(int rollNo);
   public void updateStudent(Student student);
   public void deleteStudent(Student student);
}
```

---

## Step 3

Create concrete class implementing above interface.

**StudentDaoImpl.java**

```java
import java.util.ArrayList;
import java.util.List;

public class StudentDaoImpl implements StudentDao {
	
   //list is working as a database
   List<Student> students;

   public StudentDaoImpl(){
      students = new ArrayList<Student>();
      Student student1 = new Student("Robert",0);
      Student student2 = new Student("John",1);
      students.add(student1);
      students.add(student2);		
   }
   @Override
   public void deleteStudent(Student student) {
      students.remove(student.getRollNo());
      System.out.println("Student: Roll No " + student.getRollNo() + ", deleted from database");
   }

   //retrive list of students from the database
   @Override
   public List<Student> getAllStudents() {
      return students;
   }

   @Override
   public Student getStudent(int rollNo) {
      return students.get(rollNo);
   }

   @Override
   public void updateStudent(Student student) {
      students.get(student.getRollNo()).setName(student.getName());
      System.out.println("Student: Roll No " + student.getRollNo() + ", updated in the database");
   }
}
```

---

## Step 4

Use the StudentDao to demonstrate Data Access Object pattern usage.

**DaoPatternDemo.java**

```java
public class DaoPatternDemo {
   public static void main(String[] args) {
      StudentDao studentDao = new StudentDaoImpl();

      //print all students
      for (Student student : studentDao.getAllStudents()) {
         System.out.println("Student: [RollNo : " + student.getRollNo() + ", Name : " + student.getName() + " ]");
      }


      //update student
      Student student =studentDao.getAllStudents().get(0);
      student.setName("Michael");
      studentDao.updateStudent(student);

      //get the student
      studentDao.getStudent(0);
      System.out.println("Student: [RollNo : " + student.getRollNo() + ", Name : " + student.getName() + " ]");		
   }
}
```

---

## Step 5

Verify the output.

Student: [RollNo : 0, Name : Robert ]
Student: [RollNo : 1, Name : John ]
Student: Roll No 0, updated in the database
Student: [RollNo : 0, Name : Michael ]
