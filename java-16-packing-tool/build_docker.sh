#! /bin/bash

TAG="javagroupjava1416:java-16-sealed-classes"

echo "Start building Java 16 sealed classes image"

docker build --pull --rm -f "Dockerfile" -t ${TAG} .

docker run --rm -it ${TAG}