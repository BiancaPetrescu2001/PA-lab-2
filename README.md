# Advanced Programming - Laboratory 2

## Tasks

```text
Create an object-oriented model of the problem. You should have (at least) the following classes: Source, Destination, Problem.
The sources and the destinations have names. The sources will also have the property type. The available types will be implemented as an enum . For example:
public enum SourceType {
    WAREHOUSE, FACTORY;
}
Assume S1 is a factory and S2, S3 are warehouses.
Each class should have appropriate constructors, getters and setters.
Use the IDE features for code generation, such as generating getters and setters.
The toString method form the Object class must be properly overridden for all the classes.
Use the IDE features for code generation, for example (in NetBeans) press Alt+Ins or invoke the context menu, select "Insert Code" and then "toString()" (or simply start typing "toString" and then press Ctrl+Space).
Create and print on the screen the instance of the problem described in the example.

```

## Solved tasks

As of today (28.02.2021) I have solved all tasks regarding the compulsory task.

## Build and run

To compile and run my project I have typed the following commands in the terminal:
```bash
javac -classpath . *.java Main.java
java compulsory.Main
```

## Output
The output is the following:
```bash
Problem: {sources=[Source: S1, FACTORY, 10, Source: S2, WAREHOUSE, 35, Source: S3, WAREHOUSE, 25], destinations=[Destination: D1, 20, Destination: D2, 25, Destination: D3, 25], cost=[[
2, 3, 1], [5, 4, 8], [5, 6, 8]]}

2 3 1 10
5 4 8 35
5 6 8 25
20 25 25

```