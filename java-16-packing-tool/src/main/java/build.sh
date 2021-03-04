#! /bin/bash

echo "Build source code"
/c/Program\ Files/Java/jdk-16/bin/javac.exe Main.java

echo "Build jar file"
/c/Program\ Files/Java/jdk-16/bin/jar.exe cfe Main.jar Main Main.class

echo "Build installer"
/c/Program\ Files/Java/jdk-16/bin/jpackage --name myapp4 --input . --main-jar Main.jar --main-class Main --win-console