# task-manager-java

A command line task manager built with Java & Maven.

## What it does

- Presents a numbered menu in the terminal
- Create, list, mark as done, & delete tasks
- Tasks are stored in an ArrayList (reset when the program exits)

## Tech Stack

- Java 17+
- Maven

## How it was made

Project was generated using the Maven quickstart archetype, which produces a standard `src/main/java` folder structure and a `pom.xml` build file.

Logic was split across 3 classes: `Task` holds the data, `TaskManager` contains all CRUD operations using an `ArrayList`, and `App` runs the menu loop using a `Scanner` for terminal input.

No external libraries were needed - everything uses the Java standard library.

## Future Changes

Add an `Update Task` feature to truly complete the CRUD app, currently only has `Create`, `Read`, & `Delete`

## Project Setup

```bash
git clone https://github.com/benjamin-matapo/task-manager-java.git
cd task-manager-java/task-manager
mvn compile
```

## Running the App

```bash
mvn exec:java -Dexec.mainClass="com.taskmanager.App"
```

You will see a menu in the terminal. Type a number and press Enter.

## Menu Options

```markdown
1. List tasks - shows all tasks with status and ID
2. Add task - prompts for a title, creates the task
3. Mark done - prompts for a task ID, marks it complete
4. Delete task - prompts for a task ID, removes it
5. Exit - closes the program
```

## Folder Structure

```markdown
task-manager-java/
└── task-manager/
├── pom.xml
└── src/
    └── main/
        └── java/
            └── com/taskmanager/
                    ├── App.java            # entry point and menu loop
                    ├── Task.java           # data model
                    └── TaskManager.java    # CRUD logic
```

## Class Responsibilities

- `Task.java`: stored id, title, done. Has a `toString()` for display.
- `TaskManager.java`: wraps the ArrayList. Exposes create, readAll, update, delete.
- `App.java`: reads user input, calls TaskManager, prints results.
