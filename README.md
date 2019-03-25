# JavaTutorial

<!-- TOC -->

- [JavaTutorial](#javatutorial)
  - [1. Description](#1-description)
  - [2. Sructure](#2-sructure)
  - [3. Dependences](#3-dependences)
  - [4. Build && Run](#4-build--run)
    - [4.1. Eclipse users](#41-eclipse-users)
    - [4.2. VScode users](#42-vscode-users)

<!-- /TOC -->

## 1. Description

This is the sync code repo of my class team's classwork. Everyone has right to fork it for learning. Yet, any pull request won't be accepted.

## 2. Sructure

```bash
|-src
    |-app
    |   |-startup.java  # entry point of this program
    |-Chapter
        |-router.java   # router for chapter selection
        |-one           # chapter number
        |   |-router.java       # router for internal chapter selection
        |   |-four              #internal chapter number
        |   |   |-display.java      #display module of this level
        |   |   |-factor.java       #\
        |   |   |-luckyDraw.java    # \---implement of sepcific functions
        |   |-five              #internal chpter number
        |   |   |-xxx               #similar struct of the folder at the same layer
        |   |-xxx               #similar struct of the folder at the same layer
        |-xxx           #similar struct of the folder at the same layer
```

## 3. Dependences

- JDK (version 1.8.0 or later)
- Eclipse or VScode with java supurt

*To enable java support of vscode, the following plugins are required:*

- [Language Support for Java by Red Hat (version 0.32.0 or later)](https://marketplace.visualstudio.com/items?itemName=redhat.java)
- [Java Dependency Viewer](https://marketplace.visualstudio.com/items?itemName=vscjava.vscode-java-dependency)
- [Java Test Runner](https://marketplace.visualstudio.com/items?itemName=vscjava.vscode-java-test)

## 4. Build && Run

### 4.1. Eclipse users

Really easy, just follow the build botten of the IDE

### 4.2. VScode users

Well, if you have install all the plugins referenced in '[Dependences](#2-dependences)' section, the launch setting file(.vscode/launch.json) should already automatically generated corretly. At the entry point `main(String[] args)`, you will see the launch option showed blow.

![codeLen](codeLen.png)

**Here is the ideal content of .vscode/lauch.json:**

```json
{
    "configurations": [
        {
            "type": "java",
            "name": "CodeLens (Launch) - startUp",
            "request": "launch",
            "mainClass": "app.startup",
            "projectName": "JavaTutorial",
            "console": "externalTerminal"
        }
    ]
}
```

***Note: the last k-v "`console": "externalTerminal"` needs to be added manually.***